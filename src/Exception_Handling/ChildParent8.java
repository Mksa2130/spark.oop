package Exception_Handling;

public class ChildParent8
{
    public static void main(String[] args)
    {
        String s=null;
        try
        {
            int length = s.length();
        }
        catch (ArithmeticException e)
        {
            System.out.println("ArithmeticException");
        }
        catch (NullPointerException e){
            System.out.println("NullPointerException");
        }
        catch (Exception e)
        {
            System.out.println("Exception...");
        }
    }
}
