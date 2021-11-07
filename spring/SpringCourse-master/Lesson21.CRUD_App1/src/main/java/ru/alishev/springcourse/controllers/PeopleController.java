package ru.alishev.springcourse.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.alishev.springcourse.dao.PersonDAO;

/**
 * @author Neil Alishev
 */
@Controller//Инициализация ызкштпф
@RequestMapping("/people")//для работы с методами этого класса из url необходимо ввводить /people
public class PeopleController {

    private final PersonDAO personDAO;
    @Autowired//объявление зависмости
    //Через конструктор
    public PeopleController(PersonDAO personDAO) {
        this.personDAO = personDAO;
    }

    @GetMapping()//Получить данные и передать html файл
    //возвращает человека по индексу
    public String index200(Model model) {
        model.addAttribute("people", personDAO.index());
        return "people/index";
    }
//Спомощью этого метода извлекается id
    @GetMapping("/{id}")
    public String show100(@PathVariable("id") int id, Model model) {
        model.addAttribute("person", personDAO.show(id));
        return "people/show";
    }
}
