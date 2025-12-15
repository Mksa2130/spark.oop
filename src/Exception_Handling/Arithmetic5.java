package Exception_Handling;

public class Arithmetic5
{
    public static void main(String[] args)
    {
        System.out.println("before exception");

        try
        {
            int a=10/0;
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally {
            System.out.println("finaly is always runing");
        }
        System.out.println("After handling exception ");

    }

}
