package com.smartspend.service;
import com.smartspend.model.User; import com.smartspend.util.FileManager; import java.util.*;
public class UserManager {
 private static final String FILE="data/users.txt";
 public boolean register(String u,String p){for(String l:FileManager.read(FILE)){if(!l.isBlank()&&l.split("\\|",-1)[0].equals(u))return false;}FileManager.append(FILE,u+"|"+p);return true;}
 public User login(String u,String p){for(String l:FileManager.read(FILE)){String[] a=l.split("\\|",-1);if(a.length==2&&a[0].equals(u)&&a[1].equals(p))return new User(u,p);}return null;}
}
