package oop;

public class course {
    String name;
     int duration;

     course()
     {
         System.out.println("constructer called...");
     }

    public static void main(String[] args) {
        System.out.println("before object create ");

        course c= new course();
        c.learn();
        course c2=new course();


    }
    void learn()
    {
        System.out.println();
    }
}
