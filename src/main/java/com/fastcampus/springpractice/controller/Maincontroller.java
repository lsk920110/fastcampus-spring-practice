package com.fastcampus.springpractice.controller;

import com.fastcampus.springpractice.service.SortService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class Maincontroller {

    private final SortService sortService;

    public Maincontroller(SortService sortService) {
        this.sortService = sortService;
    }

    @GetMapping("/")
    public String hello(@RequestParam List<String> list){
        return sortService.doSort(list).toString();
    }

    


}
