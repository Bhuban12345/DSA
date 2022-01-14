package com.company;

public class TypeCasting {
    public static void main(String[] args) {
        // Implicit typecasting.
        int i = 100;
        double d = i;
        long l = i;
        float f = i;
        System.out.println("Int value is:"+i);
        System.out.println("Double value is:"+d);
        System.out.println("Long value is:"+l);
        System.out.println("Float value is:"+f);
        //Explicit type casting.
        double d1 = 12.125;
        float f1 = (float) d1;
        long l1 = (long) f1;
        int i1 = (int) f1;
        System.out.println("The double value:"+d1);
        System.out.println("The float value is:"+f1);
        System.out.println("The long value is:"+l1);
        System.out.println("The int value is:"+i1);
    }
}
