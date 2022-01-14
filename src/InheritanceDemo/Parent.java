package InheritanceDemo;

public class Parent {
    int a;
    String name;
    String companyName;
    public void p1(int IDNumber){
        System.out.println("IDNumber:"+" "+IDNumber+" "+"companyName:"+" "+companyName);
    }
    public static  class Child extends Parent{
        public void c1(int IDNumber){
            // Using parent property in child class. But we can not use child property in super class.
            System.out.println("a ="+this.a+" "+"name ="+this.name+" "+"comapnyNmae ="+this.companyName);

        }
    }
    //inheritance variable of super class.
    public static class Vehicle{
        //super class property or field.
        String vehicleType;
    }
    //sub-class of Vehicle.
    public static class Car extends Vehicle{
        //sub-class property of field.
        String modelType;
        public void showDetail(){
            vehicleType = "car";
            modelType = "sports";
            System.out.println(vehicleType+" "+modelType);

        }
    }


    public static void main(String[] args) {
        //creating object of child/sub class.
        Child obj = new Child();
        //creating object of parent class.
        Parent obj1 = new Parent();


        obj.a = 1254;
        obj.companyName = "Newton school";
        obj.name = "Bhuban padun";
        obj.c1(1245);
        obj.p1(1254);
        //if we call obj1.p1() then entity will null. because all entity are initialized by the child object.
        obj1.a = 1;
        obj1.name = "Newton School";
        obj1.companyName = "google";
        //Here obj1.p1() method will give the output because all entity are initialized by parent object.
        obj1.p1(0);

        Car car = new Car();
       // car.vehicleType = "car"; here do not need to initialized because already initialized in constructor method.
        //car.modelType = "sports";
        car.showDetail();


    }
}
