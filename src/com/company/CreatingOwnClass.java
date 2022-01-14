package com.company;

public class CreatingOwnClass {
    //Creating class without the method.
    static class Employee{
        String Name;
        String DepartmentName;
        int EmployeeId;
        float Salary;
    }
    // Crating class with method or function.
    static class Student{
        String name;
        int rollNo;
        float marks;
        int age;
         void info(){
            System.out.println("Name is:"+name);
            System.out.println("RollNo is:"+rollNo);
            System.out.println("Age is:"+age);
            System.out.println("Marks is:"+marks);
        }
    }
    // class with constructor and function.
    static class Car{
        String name;
        String model;
        String engineType;
        float price;
        Car(){
            name = "maruti";
            model = "marutiAk47";
            engineType = "petrol";
        }
         void infoOfCar(){
            System.out.println("name:"+name);
             System.out.println("model:"+model);
             System.out.println("engineType:"+engineType);
             System.out.println("price:"+price);
        }
    }

    public static void main(String[] args) {
       /* Employee information = new Employee();
        information.Name = "Bhuban padun";
        information.DepartmentName = "IT developer";
        information.EmployeeId = 125;
        information.Salary = 1526.56f;
        System.out.println(information.Name);
        System.out.println(information.DepartmentName);
        System.out.println(information.EmployeeId);
        System.out.println(information.Salary);


        Student school = new Student();
        school.name = "Bhovani padun";
        school.rollNo = 124;
        school.marks = 500.5f;
        school.age = 2;
        school.info();//calling a function of info.*/

        Car vahicle = new Car();
        vahicle.price = 14259.5f;
        vahicle.infoOfCar();
    }
}
