package org.fasttrackit.utils;

import java.util.Random;

public class Constants {

    public static final String USER_EMAIL = "danuwenthome@gmail.com";
    public static final String USER_PASS = "Sserenity!123";
    public static String getSaltString;
    public static final String USER_RANDOM_EMAIL = randomUserEmailGenerator()+"@gmail.com";
    public static String randomPasswordGenerator;
    public static final  String USER_RANDOM_PASSWORD = randomPasswordGenerator() ;






    protected static String randomUserEmailGenerator() {
        String EMAIL = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 10) {
            int index = (int) (rnd.nextFloat() * EMAIL.length());
            salt.append(EMAIL.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;

    }
    protected  static String randomPasswordGenerator(){
        String PASSWORD = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder pass = new StringBuilder();
        Random rnd = new Random();
        while(pass.length()< 10) {
            int index = (int) (rnd.nextFloat()* PASSWORD.length());
            pass.append(PASSWORD.charAt(index));
        }
        String passStr = pass.toString();
        return passStr;
    }


}
