package com.personal.expenses.dao;

import com.personal.expenses.models.Category;
import com.personal.expenses.models.Expense;
import com.personal.expenses.models.Income;
import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.*;

@Repository
public class ExpenseDaoImpl implements ExpenseDao {

    @Autowired
    private SessionFactory sessionFactory;

    final static Logger logger = Logger.getLogger(ExpenseDaoImpl.class);

    @Override
    public void addExpense(Expense expense){
        sessionFactory.getCurrentSession().save(expense);
    }

    @Override
    public void addIncome(Income income){
        sessionFactory.getCurrentSession().save(income);
    }

    @Override
    public Expense getExpenseById(Integer expenseId){
        Expense exp = (Expense) sessionFactory.getCurrentSession().load(Expense.class, expenseId);
        Hibernate.initialize(exp);
        return exp;
    }

    @Override
    public List<Expense> getAllExpenses(){
        List<Expense> expenses = (List<Expense>)
                sessionFactory.getCurrentSession().createQuery("from Expense order by date DESC ").list();
        return expenses;
    }

    @Override
    public Double getTotalSum(){

        Criteria cr = sessionFactory.getCurrentSession().createCriteria(Expense.class);
        cr.setProjection(Projections.sum("amount"));
        Double totalExpenses = (Double) cr.uniqueResult();

        return totalExpenses;
    }

    @Override
    public Double getTotalIncomes(){

        Criteria cr = sessionFactory.getCurrentSession().createCriteria(Income.class);
        cr.setProjection(Projections.sum("income_amount"));
        Double totalIncomes = (Double) cr.uniqueResult();

        return totalIncomes;
    }

    @Override
    public Map<Category,Double> getCategoryTotal(){

        Query query = sessionFactory.getCurrentSession().createQuery(
                "select e.category as category, sum(e.amount) as total from Expense e group by e.category");

        List<Object[]> groupList = query.list();
        Map<Category,Double> map = new HashMap<>();
        for(Object[] row : groupList) {
            map.put((Category)row[0],(Double)row[1]);
        }

        return map;
    }
}
