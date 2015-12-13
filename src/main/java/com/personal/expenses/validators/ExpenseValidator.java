package com.personal.expenses.validators;

import com.personal.expenses.models.Expense;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class ExpenseValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return Expense.class.equals(clazz);
	}

	@Override
	public void validate(Object obj, Errors errors) {
		Expense expense = (Expense) obj;
		
//		if(expense.getCategory().getName().length() < 50){
//			errors.rejectValue("category.name", "expense.category.name", "category name to short");
//		}

	}

}
