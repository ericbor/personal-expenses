package com.personal.expenses.services;

import com.personal.expenses.models.Expense;

public interface ExpenseService {

    public void saveExpense(Expense expense);

    public Expense find(Long expenseId);
}
