package com.personal.expenses.controllers;

import com.personal.expenses.models.Expense;
import com.personal.expenses.models.JsonResponse;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FirstController {

    @RequestMapping("/home")
         public String goHome(){
        return "home";
    }

    @RequestMapping("/form")
    public String fillForm(){

        System.out.println("CONTROLLER FORM method");
        return "form";
    }

    @RequestMapping(value="/addExpense", method= RequestMethod.POST)
    public @ResponseBody String addExpense(@ModelAttribute Expense expense){

        //JsonResponse res = new JsonResponse();

        //if(!result.hasErrors()){
            System.out.println(expense);
            //res.setStatus("SUCCESS");
            //res.setResult(expense);
        //}

        return new String("SUCCESS");
    }
}
