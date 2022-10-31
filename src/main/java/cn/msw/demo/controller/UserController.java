package cn.msw.demo.controller;

import cn.msw.demo.common.R;
import cn.msw.demo.entity.User;
import cn.msw.demo.mapper.UserMapper;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author moshuowen
 */
@RestController
@AllArgsConstructor
public class UserController {

    private  final UserMapper mapper;

    @GetMapping("/users/{id}")
    public R<?> getUser(@PathVariable  String id) {
        User user = mapper.selectById(id);

        return R.ok().data(user);
    }


    @GetMapping("/users")
    public R<?> getUsers() {
        return R.ok().data(mapper.selectList(null));
    }

}
