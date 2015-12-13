package com.personal.expenses.models;

import org.springframework.format.annotation.DateTimeFormat;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "INCOME")
public class Income {

        @Id
        @Column(name = "id")
        @GeneratedValue
        private Integer  incomeId;

        @Embedded
        private Category category = new Category();

        @Column(name = "income_amount")
        private Double income_amount;

        @Column(name = "income_date")
        @DateTimeFormat(pattern = "yyyy-MM-dd")
        @Temporal(TemporalType.DATE)
        private Date income_date;

    public Integer getIncomeId() {
        return incomeId;
    }

    public void setIncomeId(Integer incomeId) {
        this.incomeId = incomeId;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Date getIncome_date() {
        return income_date;
    }

    public void setIncome_date(Date income_date) {
        this.income_date = income_date;
    }

    public Double getIncome_amount() {
        return income_amount;
    }

    public void setIncome_amount(Double income_amount) {
        this.income_amount = income_amount;
    }

    @Override
    public String toString() {
        return "Income{" +
                "category=" + category +
                ", incomeAmount=" + income_amount +
                ", income_date=" + income_date +
                ", incomeId=" + incomeId +
                '}';
    }
}

