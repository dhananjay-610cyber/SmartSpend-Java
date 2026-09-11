package com.smartspend.service;
import com.smartspend.model.*; import java.util.*;
public class ReportManager {
 public void print(String user,List<Income> income,List<Expense> expenses,Budget budget){double in=income.stream().mapToDouble(Income::getAmount).sum();double ex=expenses.stream().mapToDouble(Expense::getAmount).sum();System.out.printf("\n===== FINANCIAL REPORT =====%nIncome:  %.2f%nExpense: %.2f%nBalance: %.2f%n",in,ex,in-ex);Map<String,Double> m=new TreeMap<>();for(Expense e:expenses)m.merge(e.getCategory(),e.getAmount(),Double::sum);System.out.println("\nCategory-wise Expenses:");if(m.isEmpty())System.out.println("No expenses recorded.");else m.forEach((k,v)->System.out.printf("%-15s %.2f%n",k,v));if(budget!=null)System.out.printf("\nBudget (%s): %.2f%nRemaining: %.2f%n",budget.getMonth(),budget.getAmount(),budget.getAmount()-ex);System.out.println("============================\n");}
}
