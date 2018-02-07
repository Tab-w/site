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
 * @author WangXingYu
 * @date 2018-01-31
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestMybatis {

    @Autowired
    private UserServiceImpl userService;

    @Test
    public void testCURD() {
        User user = new User();
        Random random = new Random();
        user.setUsername(random.nextInt() + "");
        user.setAddress("wangxy");
        int count = userService.insert(user);
        Assert.assertEquals(count, 1);
        user.setAge(20);
        userService.updateByPrimaryKey(user);
        int age = userService.selectByPrimaryKey(user.getId()).getAge();
        Assert.assertEquals(age, 20);
        count = userService.deleteByPrimaryKey(user.getId());
        Assert.assertEquals(count, 1);
    }

    @Test
    public void testPage() {
        PageHelper.startPage(1, 10);
        List<User> userList1 = userService.selectAll();
        for (User u : userList1) {
            System.out.println(u.getFullname());
        }
        UserExample userExample = new UserExample();
        userExample.createCriteria().andIdGreaterThan(1000);
        List<User> userList2 = userService.selectByExample(userExample);
        System.out.println(userList2.size());
    }
}
