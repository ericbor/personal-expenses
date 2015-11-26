package com.personal.expenses.controllers;

import com.personal.expenses.models.Expense;
import com.personal.expenses.models.JsonResponse;
import com.personal.expenses.services.ExpenseService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class FirstController {

    @Autowired
    ExpenseService expenseService;

    final static Logger logger = Logger.getLogger(FirstController.class);

    @RequestMapping("/index")
    public String fillForm(Model model){
        logger.info("\n" + "***************" + "\n" + "invoke fillForm()");
        model.addAttribute("expense", new Expense());

        return "index";
    }

    @RequestMapping("/{expenseId}")
    public String showExpense(Model model, @PathVariable("expenseId") Long expenseId){
        model.addAttribute("project", expenseService.find(expenseId));
        return "expense";
    }

    @RequestMapping(value="/addExpense", method= RequestMethod.POST)
    public @ResponseBody String addExpense(@ModelAttribute Expense expense, BindingResult result){
        logger.info("\n" + "***************" + "\n" + "invoke addExpense()");

        if(!result.hasErrors()){
            //if(expense != null){
                expenseService.saveExpense(expense);
            //}
            return "SUCCESS";
        }

        return "FAIL";
    }

}
