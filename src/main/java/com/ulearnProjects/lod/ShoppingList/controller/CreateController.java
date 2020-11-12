package com.ulearnProjects.lod.ShoppingList.controller;

import com.ulearnProjects.lod.ShoppingList.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class CreateController {
    @Autowired
    ProductService productService;

    @RequestMapping(path = "/product/new", method = RequestMethod.GET)
    public String create(Model model) {
        model.addAttribute("appName", "Список покупок");
        return "create";
    }

    @RequestMapping(path = "/product/new", method = RequestMethod.POST)
    public String doCreate(@ModelAttribute("text") String text) {
        productService.create(text);
        return "redirect:/";
    }
}
