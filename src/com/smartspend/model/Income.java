package com.smartspend.model;
import java.time.LocalDate;
public class Income extends Transaction {
    public Income(String username,double amount,String category,String description,LocalDate date){super(username,amount,category,description,date);}
    @Override public String getType(){return "INCOME";}
}
