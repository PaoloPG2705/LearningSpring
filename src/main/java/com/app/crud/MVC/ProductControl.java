package com.app.crud.MVC;

import com.app.crud.Repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductControl {
    
    @Autowired
    private ProductRepository repository;

    @GetMapping("templates/")
    public String homePage(Model model){
        model.addAttribute("list", repository.findAll());
        return "index";
    }

    
}
