package org.learning.springlibrary.controller;

import org.learning.springlibrary.model.Pizza;
import org.learning.springlibrary.repository.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/")
public class IndexController {

    @Autowired
    private PizzaRepository pizzaRepository;

    @GetMapping
    public String index(Model model) {

        List<Pizza> pizzaList = pizzaRepository.findAll();

        model.addAttribute("pizzaList", pizzaList);
        return "home";
    }
}
