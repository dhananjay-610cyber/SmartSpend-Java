package com.smartspend.service;
import com.smartspend.model.Income; import com.smartspend.util.FileManager; import java.time.LocalDate; import java.util.*;
public class IncomeManager {
 private static final String FILE="data/income.txt";
 public void add(Income e){FileManager.append(FILE,e.toFileString());}
 public List<Income> get(String user){List<Income> r=new ArrayList<>();for(String l:FileManager.read(FILE)){try{String[] a=l.split("\\|",-1);if(a.length==5&&a[0].equals(user))r.add(new Income(a[0],Double.parseDouble(a[1]),a[2],a[3],LocalDate.parse(a[4])));}catch(Exception ignored){}}return r;}
}
