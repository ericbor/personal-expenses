package com.personal.expenses.controllers;

import com.personal.expenses.models.Income;
import com.personal.expenses.services.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
@SessionAttributes("income")
public class IncomeController {

    @Autowired
    private ExpenseService expenseService;

    @ModelAttribute("income")
    public Income getIncome(){
        return new Income();
    }

    @RequestMapping(value="/addIncome", method= RequestMethod.GET)
    public String addIncome(){
        return "addIncome";
    }

    @RequestMapping(value="/addIncome", method= RequestMethod.POST)
    public String addIncome(@ModelAttribute Income income, BindingResult result){

        if(!result.hasErrors()){
            expenseService.addIncome(income);
        }

        return "redirect:/expenses";
    }

    @InitBinder
    public void initBinder(WebDataBinder binder){
        binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true, 10));
    }
}
