package com.ulearnProjects.lod.ShoppingList.controller;

import com.ulearnProjects.lod.ShoppingList.service.BuyingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BuyingController {
    @Autowired
    BuyingService buyingService;

    @ResponseBody
    @RequestMapping(path = "/item/{id}/status", method = RequestMethod.POST)
    public boolean check(@PathVariable("id") Long id){
        return buyingService.check(id);
    }
}