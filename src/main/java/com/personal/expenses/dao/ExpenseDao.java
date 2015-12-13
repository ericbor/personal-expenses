package com.personal.expenses.dao;

import com.personal.expenses.models.Category;
import com.personal.expenses.models.Expense;
import com.personal.expenses.models.Income;
import java.util.List;
import java.util.Map;

public interface ExpenseDao {

    public void addExpense(Expense expense);
    public void addIncome(Income income);
    public Expense getExpenseById(Integer expenseId);
    public List<Expense> getAllExpenses();
    public Double getTotalSum();
    public Double getTotalIncomes();
    public Map<Category,Double> getCategoryTotal();
}
