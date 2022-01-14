package com.company;

public class OopsStatic {
    int employeeId;
    String employeeName;
    static String company = "Newton school";
    public void showInfo(){
        System.out.println("Name:"+employeeName+ "ID:"+employeeId+ " company Name:"+company);
    }
    //Different between static and instance variable.
    public static class Test{
        static  int x = 100;
        int y = 100;
        public void increment(){
            x++;
            y++;
        }
    }
    // Using final keyword in variable.
    public static class Test1{
        final int a = 10;
        public void printInfo(){
            System.out.println(this.a);
            System.out.println(a);
        }
    }
    //Using final keyword in method.
    public class NewtonSchool{
        final void learn(){
            System.out.println("learning coding from Newton School.");
        }
    }
   /* public class Student extends NewtonSchool{
        // learn() method is overridden here so there will compile error.
        void learn(){
            System.out.println("learning something new is interesting.");
        }
    }*/


    public static void main(String[] args) {
        OopsStatic set = new OopsStatic();
        set.employeeId = 10456;
        set.employeeName = "Bhuban padun";
        set.showInfo();
        Test t1 = new Test();
        Test t2 = new Test();
        t1.increment();
       // t2.increment();
      /*  System.out.println(t1.x);
        System.out.println(t1.y);*/
        Test1 test1 = new Test1();
       // test1.a = 15; can not assign new value it will compile error.
       test1.printInfo();
       /*Student object = new Student();
       object.learn();*/

    }
}
