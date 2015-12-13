package com.personal.expenses.controllers;

import com.personal.expenses.models.Category;
import com.personal.expenses.models.Expense;
import com.personal.expenses.models.Income;
import com.personal.expenses.services.ExpenseService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import java.text.SimpleDateFormat;
import java.util.*;

@Controller
@SessionAttributes("expense")
public class ExpenseController {

    @Autowired
    private ExpenseService expenseService;

    final static Logger logger = Logger.getLogger(ExpenseController.class);

    @RequestMapping("/expenses")
    public String showExpenses(Model model){

        Double totalAllExpenses = expenseService.getTotalSum();
        Double totalAllIncomes = expenseService.getTotalIncomes();
        model.addAttribute("totalAllExpenses", totalAllExpenses);
        model.addAttribute("totalAllIncomes", totalAllIncomes);

        Map<Category, Double> totalByCategory = expenseService.getCategoryTotal();
        model.addAttribute("totalByCategory", totalByCategory);

        return "expenses";
    }

    @RequestMapping(value="/addExpense", method= RequestMethod.GET)
    public String addExpense(){
        return "addExpense";
    }

//    @RequestMapping(value="/expenses", method= RequestMethod.GET)
//    public String expenses(Model model){
//
//        Double total = expenseService.getTotalSum();
//        model.addAttribute("totalExpenses", total);
//        System.out.println("*******************" + total);
//
//        return "expenses";
//    }

    @ModelAttribute("categoryOptions")
    public List<String> getCategoryOptions(){
        return new LinkedList<>(Arrays.asList(new String[]{"Eating Out", "Food", "Alcohol", "Other"}));
    }

    @ModelAttribute("expense")
    public Expense getExpense(){
        return new Expense();
    }

    @RequestMapping("/{expenseId}")
    public String findResource(Model model,@PathVariable("expenseId") Integer expenseId){

        model.addAttribute("expense", expenseService.find(expenseId));

        return "expense";
    }


    @RequestMapping(value="/addExpense", method= RequestMethod.POST)
    public @ResponseBody String addExpense(@ModelAttribute Expense expense, BindingResult result){

        if(!result.hasErrors()){
            expenseService.addExpense(expense);
        }

        return "SUCCESS";
    }

    @RequestMapping(value="/transactions")
    public String showAllTransactions(Model model){
        model.addAttribute("expenses", expenseService.getAllExpenses());
        return "transactions";
    }
}
