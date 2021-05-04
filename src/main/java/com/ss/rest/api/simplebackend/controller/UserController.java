package com.ss.rest.api.simplebackend.controller;

import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;

@RestController
public class UserController {

    @Transactional(rollbackFor = Exception.class)
    public String saveDto(UserDto userDto) {
        userDto.setPassword(bCryptPasswordEncoder
                .encode(userDto.getPassword()));
        return save(new User(userDto)).getId();
    }
}
