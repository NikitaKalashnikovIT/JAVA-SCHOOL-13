package ru.alishev.springcourse.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Neil Alishev
 */
@Controller
@RequestMapping("/first")
public class FirstController {

    @GetMapping("/hello")
    //@RequestParam(value = "name", required = false) String name
    //запрос по имени name будет положенно в String namе значение
    //если url не написать один из параметров value то будет выдана ошибка.
    //для отключения проверки нужно написать required = false
    public String helloPage(@RequestParam(value = "name", required = false) String name,
                            @RequestParam(value = "surname", required = false) String surname) {

        System.out.println("Hello, " + name + " " + surname);

        return "first/hello";
    }

    @GetMapping("/goodbye")
    public String goodByePage() {
        return "first/goodbye";
    }
}
