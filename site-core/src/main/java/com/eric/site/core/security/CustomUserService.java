package com.eric.site.core.security;

import com.eric.site.web.dao.RoleMapper;
import com.eric.site.web.dao.UserMapper;
import com.eric.site.web.entity.Role;
import com.eric.site.web.entity.RoleExample;
import com.eric.site.web.entity.User;
import com.eric.site.web.entity.UserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Eric
 */
public class CustomUserService implements UserDetailsService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private RoleMapper roleMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User userWithRoles = userMapper.selectUserWithRoles(username);
        if (userWithRoles == null) {
            throw new UsernameNotFoundException("用户" + username + "不存在", null);
        }
        List<GrantedAuthority> authorities = new ArrayList<>();
        userWithRoles.getRoles().forEach(role -> {
            Role roleWithAuthorities = roleMapper.selectRoleWithAuthorities(role.getId());
            roleWithAuthorities.getAuthorities().forEach(authority -> authorities.add(new SimpleGrantedAuthority(authority.getAuthorityName())));
        });
        return new org.springframework.security.core.userdetails.User(userWithRoles.getUsername(), userWithRoles.getPassword(), userWithRoles.getEnabled(), userWithRoles.getAccountNonExpired(), userWithRoles.getCredentialsNonExpired(), userWithRoles.getAccountNonLocked(), authorities);
    }
}
