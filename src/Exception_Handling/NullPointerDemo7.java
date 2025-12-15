package Exception_Handling;

public class NullPointerDemo7
{
    public static void main(String[] args)
    {
        String s=null;
        try
        {
            int length = s.length();
        }
        catch (NullPointerException e)
        {
            System.out.println("ArithmeticException");
        }
//          Exception missmaatch
    }

}
