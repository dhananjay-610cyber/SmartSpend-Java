package com.smartspend.model;
public class Budget {
    private final String username; private final String month; private double amount;
    public Budget(String username,String month,double amount){this.username=username;this.month=month;this.amount=amount;}
    public String getUsername(){return username;} public String getMonth(){return month;} public double getAmount(){return amount;}
    public void setAmount(double amount){this.amount=amount;}
    public String toFileString(){return username+"|"+month+"|"+amount;}
}
