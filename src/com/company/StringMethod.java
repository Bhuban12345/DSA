package com.company;

public class StringMethod {
    public static void main(String[] args) {
        String str = new String("Bhuban padun");
        // To find character of the given index.
        char charOfIndex = str.charAt(3);
        System.out.println(charOfIndex);
        // To compare the quality of the two string.
        String str1 = new String("Bhuban pasung");
        System.out.println(str.equalsIgnoreCase(str1));
        // indexof() using in various types.
        String subString = "padun";
        System.out.println(str.indexOf('p'));
        // This will give the index position of the char p.
        System.out.println(str.indexOf('u',3));
        //This will give the index position of char u but its count start from index 3.
        System.out.println(str1.indexOf("padun"));
        //It will give the index position of string "padun".
        System.out.println(str.indexOf("dun",7));
        // To change in character of the string.
        //Here every 'b' is replace with the 'B'.
        String str2 = "bhuban";
        System.out.println(str2.replace('b','B'));
    }
}
