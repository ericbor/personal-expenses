package com.personal.expenses.models;

import javax.persistence.*;

@Entity
@Table(name="CATEGORIES")
public class Category implements Comparable<Category>{

    @Id
    @Column(name = "category_id")
    @GeneratedValue
    private Integer id;

    @Column(name = "category_name")
    private String name;

    @Column(name = "category_type")
    private String type;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="id")
    public Expense expense;

    public Category (){}

    public Category(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public int compareTo(Category other) {

        int last = this.name.compareTo(other.name);

        return last;
    }


}
