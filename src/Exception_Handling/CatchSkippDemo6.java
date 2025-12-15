package Exception_Handling;

public class CatchSkippDemo6
{
    public static void main(String[] args)
    {
        try
        {
            System.out.println("try block");
        }
        catch(Exception e)
        {
            System.out.println("catch skipped");
        }
        System.out.println("Done ... ?");
    }
}
