package com.FirstAPI.Api_02.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/factorial")
public class FactorialController {

    @GetMapping(value = "{n}")
    public String getRequest(@PathVariable(required = false) String n){
        return n;
    }
}
