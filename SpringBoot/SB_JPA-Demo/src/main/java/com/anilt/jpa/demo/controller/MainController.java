package com.anilt.jpa.demo.controller;

import com.anilt.jpa.demo.dao.TestRepository;
import com.anilt.jpa.demo.entity.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/test")
public class MainController {

    @Autowired
    private TestRepository testRepository;

    @GetMapping(path = "/all")
    public @ResponseBody Iterable<Test> getAllTests(){
        return testRepository.findAll();
    }
}
