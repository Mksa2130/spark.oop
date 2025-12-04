package oop.objectcreation;

public class course {
    String name;
     int duration;

    /* course()
     {
         System.out.println("constructer called...");
     }*/

    course(String name,int duration)
    {
        System.out.println(name);
        this.name=name;
        this.duration=duration;
//        System.out.println("Parametric constructer called...");
    }

    public static void main(String[] args) {
        System.out.println("before object create ");

        course c= new course( "Devops",5);
  /*      c.name="Java full stack";
        System.out.println("After object crearte");
        c.learn(c);*/
        course c2=new course( "Java",6);
       /* c2.name="Devops course";
        c.learn(c2);*/

//        parametric custructor
        course c3=new course("DSA",3);

        System.out.println(c.name);
        System.out.println(c.duration);
        System.out.println(c2.name);
        System.out.println(c2.duration);
        System.out.println(c3.name);
        System.out.println(c3.duration);



    }
    void learn(course c)
    {
        System.out.println("We are learning "+c.name);
    }

}
