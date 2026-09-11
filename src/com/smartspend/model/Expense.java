package com.smartspend.model;
import java.time.LocalDate;
public class Expense extends Transaction {
    public Expense(String username,double amount,String category,String description,LocalDate date){super(username,amount,category,description,date);}
    @Override public String getType(){return "EXPENSE";}
}
