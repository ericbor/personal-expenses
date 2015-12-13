package com.personal.expenses.services;

import com.personal.expenses.dao.ExpenseDao;
import com.personal.expenses.models.Category;
import com.personal.expenses.models.Expense;
import com.personal.expenses.models.Income;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Map;

@Service
public class ExpenseServiceImpl implements ExpenseService {

    @Autowired
    private ExpenseDao expenseDao;

    final static Logger logger = Logger.getLogger(ExpenseServiceImpl.class);

    @Transactional
    @Override
    public void addExpense(Expense expense){
        expenseDao.addExpense(expense);
    }

    @Transactional
    @Override
    public void addIncome(Income income){
        expenseDao.addIncome(income);
    }

    @Transactional
    @Override
    public Expense find(Integer expenseId){
        Expense expense = expenseDao.getExpenseById(expenseId);
        return expense;
    }

    @Transactional
    @Override
    public List<Expense> getAllExpenses(){
        return expenseDao.getAllExpenses();
    }

    @Transactional
    @Override
    public Double getTotalSum(){
        Double totalExpenses = expenseDao.getTotalSum();
        return totalExpenses;
    }

    @Transactional
    @Override
    public Double getTotalIncomes(){
        Double totalIncomes = expenseDao.getTotalIncomes();
        return totalIncomes;
    }

    @Transactional
    @Override
    public Map<Category,Double> getCategoryTotal(){
        Map<Category,Double> categoryTotal;
        categoryTotal = expenseDao.getCategoryTotal();
        return categoryTotal;
    }
}
