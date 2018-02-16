package com.eric.site;

import com.eric.site.web.entity.User;
import com.eric.site.web.entity.UserExample;
import com.eric.site.web.service.UserServiceImpl;
import com.github.pagehelper.PageHelper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Random;

/**
 * @Author: WangXY
 * @Date: 2018-02-16
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestMybatis {

    @Autowired
    private UserServiceImpl userServiceImpl;

    @Test
    public void testCURD() {
        User user = new User();
        Random random = new Random();
        user.setUsername(random.nextInt() + "");
        int count = userServiceImpl.insert(user);
        Assert.assertEquals(count, 1);
        user.setEmail("123@qq.com");
        userServiceImpl.updateByPrimaryKey(user);
        String email = userServiceImpl.selectByPrimaryKey(user.getId()).getEmail();
        Assert.assertEquals(email, "123@qq.com");
        count = userServiceImpl.deleteByPrimaryKey(user.getId());
        Assert.assertEquals(count, 1);
    }

    @Test
    public void testPage() {
        PageHelper.startPage(1, 10);
        List<User> userList1 = userServiceImpl.selectAll();
        if(userList1!=null){
            for (User u : userList1) {
                System.out.println(u.getUsername());
            }
        }
        UserExample userExample = new UserExample();
        userExample.createCriteria().andIdGreaterThan(1000);
        List<User> userList2 = userServiceImpl.selectByExample(userExample);
        Assert.assertNotNull(userList2);
    }
}
