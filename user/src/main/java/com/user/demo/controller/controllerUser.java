package com.user.demo.controller;

import com.user.demo.Repo.RepoUser;
import com.user.demo.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/users")
public class controllerUser {

    @Autowired
    RepoUser repoUser;

    @GetMapping(path = "")
    @ResponseBody
    public List<User> users(){
        return repoUser.findAll();
    }
}
