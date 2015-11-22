package com.personal.expenses.models;


public class Expense {

    private String category;
    private String amount;
    private String date;

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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
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
