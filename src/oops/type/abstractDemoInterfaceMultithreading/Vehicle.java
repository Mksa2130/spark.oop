package oops.type.abstractDemoInterfaceMultithreading;

public abstract class Vehicle {
    String brand;

    Vehicle(String brand){
        this.brand=brand;
    }

   abstract void start();


    public void m1(){
        System.out.println("Hello m1");
    }




}
