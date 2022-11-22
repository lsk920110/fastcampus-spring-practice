package com.fastcampus.springpractice;

import com.fastcampus.springpractice.config.Config;
import com.fastcampus.springpractice.logic.BubbleSort;
import com.fastcampus.springpractice.logic.Sort;
import com.fastcampus.springpractice.service.SortService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
//        Sort<String> sort = context.getBean(Sort.class);
        SortService sortService = context.getBean(SortService.class);

//        Sort<String> sort = new BubbleSort<>();

        System.out.println("[result] "+sortService.doSort(Arrays.asList(args)));
    }
}
