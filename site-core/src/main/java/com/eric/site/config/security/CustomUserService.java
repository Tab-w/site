package com.eric.site.config.security;

import com.eric.site.web.dao.AuthorityMapper;
import com.eric.site.web.dao.UserMapper;
import com.eric.site.web.entity.User;
import com.eric.site.web.entity.UserExample;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @Author: Eric
 */
public class CustomUserService implements UserDetailsService {

    @Resource
    private UserMapper userMapper;

    @Resource
    private AuthorityMapper authorityMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserExample userExample = new UserExample();
        UserExample.Criteria userExampleCriteria = userExample.createCriteria();
        userExampleCriteria.andUsernameEqualTo(username);
        Optional<User> userOptional = userMapper.selectByExample(userExample).stream().findFirst();
        if (!userOptional.isPresent()) {
            throw new UsernameNotFoundException("用户" + username + "不存在", null);
        }
        List<GrantedAuthority> authorities = new ArrayList<>();
        User user = userOptional.get();
        authorityMapper.selectAllAuthoritiesByUserId(user.getId()).forEach(authority -> authorities.add(new SimpleGrantedAuthority(authority.getCode())));
        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), user.getEnabled(), user.getAccountNonExpired(), user.getCredentialsNonExpired(), user.getAccountNonLocked(), authorities);
    }
}
