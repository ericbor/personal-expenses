package com.personal.expenses.models;

import org.springframework.format.annotation.DateTimeFormat;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "EXPENSES")
@XmlRootElement(name="expense")
public class Expense {

    @Id
    @Column(name = "id")
    @GeneratedValue
    private Integer  expenseId;

    @Embedded
    private Category category = new Category();

    @Column(name = "amount")
    private Double amount;

    @Column(name = "expense_date")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    private Date date;

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getExpenseId() {
        return expenseId;
    }

    public void setExpenseId(Integer expenseId) {
        this.expenseId = expenseId;
    }

    @Override
    public String toString() {
        return "Expense{" +
                "expenseId=" + expenseId +
                ", category=" + category +
                ", amount='" + amount + '\'' +
                ", date=" + date +
                '}';
    }
}
