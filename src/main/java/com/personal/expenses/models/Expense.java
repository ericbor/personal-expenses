package com.personal.expenses.models;


import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

public class Expense {

    private String category;
    private String amount;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate date;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Expense{" +
                "category='" + category + '\'' +
                ", amount='" + amount + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
