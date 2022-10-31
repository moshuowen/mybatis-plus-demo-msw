package cn.msw.demo;

import cn.msw.demo.entity.User;
import cn.msw.demo.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MybatisPlusDemoApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    void contextLoads() {
        List<User> users = userMapper.selectList(null);
        users.forEach(System.out::println);

    }

    @Test
    void insert(){
        User user = new User();
        user.setAge(22);
        user.setEmail("msw@qq.com");
        user.setName("msw");
        int insert = userMapper.insert(user);
        System.out.println(insert);
    }

    @Test
    void deleteById(){
        int i = userMapper.deleteById(2);
        System.out.println(i);
    }

}
