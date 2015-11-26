package com.personal.expenses.services.impl;

import com.personal.expenses.models.Expense;
import com.personal.expenses.services.ExpenseService;
import org.apache.log4j.Logger;

import java.util.ArrayList;

public class ExpenseServiceImpl implements ExpenseService {

    final static Logger logger = Logger.getLogger(ExpenseServiceImpl.class);

    @Override
    public void saveExpense(Expense expense){
        ArrayList<Expense> expenses = new ArrayList<Expense>();
        expenses.add(expense);
        logger.info("expense was successfully saved");
        logger.info(expenses.get(0));
    }

    @Override
    public Expense find(Long expenseId){

        return new Expense();
    }


}
