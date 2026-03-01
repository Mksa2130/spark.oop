package Exception_Handling;

public class Thowsdemo {
    public static void main(String[] args)
    {
        m1();
    }
    public static void m1()
    {
        m2();
        System.out.println("m1");
    }
    public static void m2()
    {
        System.out.println(10/0);
        System.out.println("m1");
    }
}
