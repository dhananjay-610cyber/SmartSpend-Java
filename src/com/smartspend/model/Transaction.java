package com.smartspend.model;

import java.time.LocalDate;

public abstract class Transaction {
    protected final String username;
    protected final double amount;
    protected final String category;
    protected final String description;
    protected final LocalDate date;

    protected Transaction(String username, double amount, String category, String description, LocalDate date) {
        this.username = username; this.amount = amount; this.category = category;
        this.description = description; this.date = date;
    }
    public String getUsername() { return username; }
    public double getAmount() { return amount; }
    public String getCategory() { return category; }
    public String getDescription() { return description; }
    public LocalDate getDate() { return date; }
    public abstract String getType();
    public String toFileString() { return username+"|"+amount+"|"+category+"|"+description.replace("|","/")+"|"+date; }
}
