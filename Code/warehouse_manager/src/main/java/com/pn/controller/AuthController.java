package com.pn.controller;

import com.pn.entity.Result;
import com.pn.service.AuthService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Slf4j
@RestController
@RequestMapping("/auth")
public class AuthController {
    @Autowired
    private AuthService authService;

    @RequestMapping("/auth-tree")
    public Result loadAllAuthTree(){
        return Result.ok(authService.allAuthTree());
    }


}
