package oop;

public class car {
    //fields, attribute, properties

    String colour;
    String brand;
    int speed;

    public static void main(String[] args) {

        car car1=new car();


        //we need to set speed value
        car1.speed = 101;
        car1.run();

    }

    public void run() {
        System.out.println("car is runnig at "+speed);
    }
}
