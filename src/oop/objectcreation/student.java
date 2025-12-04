package oop.objectcreation;

public class student {

    String name;

    int age;

    String course;

    student()
    {
      this ("unknown" ,11);
    }

    student(String name,int age ){
        this.name=name;
        this.age=age;

    }

    public static void main(String[] args) {

        student s1 = new student();
        s1.studentDetails();
        student s2 = new student("Ayush", 12);
        s2.studentDetails();

    }

        void studentDetails()
        {
            System.out.println("name "+name +" age "+age);
            hello(this);
        }
        void hello(student s)
        {
            System.out.println("hello "+name);
        }
    }

