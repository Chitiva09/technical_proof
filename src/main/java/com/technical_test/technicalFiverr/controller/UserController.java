package com.technical_test.technicalFiverr.controller;

import com.technical_test.technicalFiverr.service.UserService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
public class UserController {

private UserService userService;

public void UserController(UserService userService){
    this.userService= userService;
}


}
