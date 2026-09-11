package com.smartspend.service;
import com.smartspend.model.Budget; import com.smartspend.util.FileManager; import java.util.*;
public class BudgetManager {
 private static final String FILE="data/budgets.txt";
 public void set(Budget b){List<String> all=FileManager.read(FILE);String target=b.getUsername()+"|"+b.getMonth()+"|";boolean found=false;for(int i=0;i<all.size();i++){if(all.get(i).startsWith(target)){all.set(i,b.toFileString());found=true;}}if(found)FileManager.write(FILE,all);else FileManager.append(FILE,b.toFileString());}
 public Budget get(String user,String month){for(String l:FileManager.read(FILE)){String[] a=l.split("\\|",-1);if(a.length==3&&a[0].equals(user)&&a[1].equals(month))return new Budget(a[0],a[1],Double.parseDouble(a[2]));}return null;}
}
