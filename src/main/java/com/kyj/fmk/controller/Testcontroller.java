package com.kyj.fmk.controller;

import com.kyj.fmk.sec.annotation.PublicEndpoint;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/chat")
public class Testcontroller {

    @PublicEndpoint
    @GetMapping("/")

    public String test(){
        return "chat";
    }

}
