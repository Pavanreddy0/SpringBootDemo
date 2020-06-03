package com.ib.pavan.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @GetMapping("/pavan")
    public String index()
    {
        return "print Hello";
    }
}
