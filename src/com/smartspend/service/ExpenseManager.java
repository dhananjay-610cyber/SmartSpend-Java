package com.smartspend.service;
import com.smartspend.model.Expense; import com.smartspend.util.FileManager; import java.time.LocalDate; import java.util.*;
public class ExpenseManager {
 private static final String FILE="data/expenses.txt";
 public void add(Expense e){FileManager.append(FILE,e.toFileString());}
 public List<Expense> get(String user){List<Expense> r=new ArrayList<>();for(String l:FileManager.read(FILE)){try{String[] a=l.split("\\|",-1);if(a.length==5&&a[0].equals(user))r.add(new Expense(a[0],Double.parseDouble(a[1]),a[2],a[3],LocalDate.parse(a[4])));}catch(Exception ignored){}}return r;}
 public boolean delete(String user,int index){List<String> all=FileManager.read(FILE);int n=-1;for(int i=0;i<all.size();i++){String[] a=all.get(i).split("\\|",-1);if(a.length>0&&a[0].equals(user)&&++n==index){all.remove(i);FileManager.write(FILE,all);return true;}}return false;}
}
