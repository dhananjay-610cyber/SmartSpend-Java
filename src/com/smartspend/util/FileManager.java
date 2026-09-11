package com.smartspend.util;
import java.io.*; import java.nio.file.*; import java.util.*;
public class FileManager {
    public static List<String> read(String path){try{Path p=Paths.get(path);if(!Files.exists(p))return new ArrayList<>();return Files.readAllLines(p);}catch(IOException e){throw new RuntimeException("Unable to read data file: "+path,e);}}
    public static void append(String path,String line){try{Path p=Paths.get(path);if(p.getParent()!=null)Files.createDirectories(p.getParent());Files.writeString(p,line+System.lineSeparator(),StandardOpenOption.CREATE,StandardOpenOption.APPEND);}catch(IOException e){throw new RuntimeException("Unable to save data.",e);}}
    public static void write(String path,List<String> lines){try{Path p=Paths.get(path);if(p.getParent()!=null)Files.createDirectories(p.getParent());Files.write(p,lines);}catch(IOException e){throw new RuntimeException("Unable to write data.",e);}}
}
