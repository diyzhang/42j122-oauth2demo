package cn.toj.oauth2demoresources.service;

import cn.toj.oauth2demoresources.domain.User;
import cn.toj.oauth2demoresources.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> getAllUsers() {
        List<User> users = userMapper.getAllUsers();
        return users;
    }
}
