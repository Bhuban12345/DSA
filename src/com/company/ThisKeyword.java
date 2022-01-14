package com.company;

public class ThisKeyword {
   static class UseOfthisDemo{
        String name, address, fatherName, motherName;
        double weight, height;
        UseOfthisDemo(String  name, String address, String fatherName, String motherName){
            this.name = name;
            this.address = address;
            this.fatherName = fatherName;
            this.motherName = motherName;

        }
        UseOfthisDemo(double weight, double height){
            weight = this.weight;
            height = this.height;
        }
        void printinfo(){
            System.out.println("name:"+name);
            System.out.println("address:"+address);
            System.out.println("fatherName:"+fatherName);
            System.out.println("motherName:"+motherName);

        }
        void printinfo1(){
            System.out.println("height:"+height);
            System.out.println("weight:"+weight);
        }
    }

    public static void main(String[] args) {
        UseOfthisDemo d = new UseOfthisDemo("Bhuban padun","Ramdhon Dikhari","Jugesh padun", "Sumitra padun");
        UseOfthisDemo e = new UseOfthisDemo(45.5, 5.5);
        e.weight = (double) 56.45;
        e.height = (double) 5.88;
        d.printinfo();
        e.printinfo1();
    }
}
