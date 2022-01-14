package com.company;

public class SwitchStatement {
    public static void main(String[] args) {
        // Switch case using integer data types.
        int day = 5;
        String dayName;
        switch(day){
            case 1:
                dayName = "The day name is Monday";
                break;
            case 2:
                dayName = "The day name is Tuesday";
                break;
            case 3:
                dayName = " The day name is Wednesday";
                break;
            case 4:
                dayName = "The day name is Thursday";
                break;
            case 5:
                dayName = "The day name is Friday";
                break;
            case 6:
                dayName = "The day name is Saturday";
                break;
            case 7:
                dayName = "The day name is Sunday";
                break;
            default:
                dayName = "Invalid day";
        }
        System.out.println(dayName);
        String name = "Bhuban";
        switch (name){
            case "bhuban":
                System.out.println("Name is bhuban");
                break;
            case "padun":
                System.out.println("Name is padun");
                break;
            case "Bhuban":
                System.out.println("Name is Bhuban");
                break;
            default:
                System.out.println("Name is invalid");

        }
    }
}
