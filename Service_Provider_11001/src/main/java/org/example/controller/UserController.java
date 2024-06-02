package org.example.controller;

import org.example.entity.CommonResult;
import org.example.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @GetMapping("/getUserById/{userId}")
    public CommonResult<User> getUserById(@PathVariable("userId") Integer userId){
        CommonResult<User> result =new CommonResult<>();
        Integer code = 200;
        String message = "success(服务由11001端口提供)";
        try {
            User u = new User(userId,"小明","123456");
            result.setCode(code);
            result.setMessage(message);
            result.setUser(u);

        }catch (Exception e){
            result.setCode(404);
            result.setMessage("error");
        }
        return result;

    }

}
