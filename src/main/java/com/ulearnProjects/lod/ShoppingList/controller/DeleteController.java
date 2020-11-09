package com.ulearnProjects.lod.ShoppingList.controller;

import com.ulearnProjects.lod.ShoppingList.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DeleteController {
    @Autowired
    ProductService productService;

    @ResponseBody
    @RequestMapping(path = "/item/{id}/delete", method = RequestMethod.POST)
    public void delete(@PathVariable("id") Long id){
        productService.remove(id);
    }
}
