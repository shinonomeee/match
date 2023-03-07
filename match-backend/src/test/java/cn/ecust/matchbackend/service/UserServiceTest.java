package cn.ecust.matchbackend.service;

import cn.ecust.matchbackend.entity.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

/**
 * @Description
 * @Author chris
 * @Date 2023/3/7, 16:20
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class UserServiceTest {
    @Resource
    private UserService userService;

    @Test
    public void testSearchUserByTags() {
        List<String> tags = Arrays.asList("java", "python");
        List<User>  userList = userService.searchUsersByTags(tags);
        Assert.assertNotNull(userList);
    }
}
