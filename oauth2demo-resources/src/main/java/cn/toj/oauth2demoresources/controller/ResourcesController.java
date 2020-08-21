package cn.toj.oauth2demoresources.controller;

import cn.toj.oauth2demoresources.domain.User;
import cn.toj.oauth2demoresources.dto.ResponseResult;
import cn.toj.oauth2demoresources.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Carlos
 * @description
 * @Date 2020/8/20
 */

@RestController
public class ResourcesController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public ResponseResult<List<User>> getAllUsers() {
        return new ResponseResult<>(Integer.valueOf(HttpStatus.OK.value()), HttpStatus.OK.toString(), userService.getAllUsers());
    }

}
