package com.smartspend.util;
public final class ValidationUtil {
    private ValidationUtil() {}
    public static boolean validUsername(String s){return s!=null && s.matches("[A-Za-z0-9_]{3,20}");}
    public static boolean validPassword(String s){return s!=null && s.length()>=4;}
    public static double positiveAmount(String s){double n=Double.parseDouble(s); if(n<=0) throw new IllegalArgumentException("Amount must be positive."); return n;}
}
