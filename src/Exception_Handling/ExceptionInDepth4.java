package Exception_Handling;

public class ExceptionInDepth4
{
    public static void main(String[] args)
    {
        m1();

        System.out.println("hello ji main ");

    }

    public static void m1()
    {
     m2();
        System.out.println("hello ji m1");

    }

    public static void m2( )
    {
         m3();

        System.out.println("hello ji m2");
    }
    public static void m3()
    {
                System.out.println(10/0);
        System.out.println("hello ji m3");
    }

}
