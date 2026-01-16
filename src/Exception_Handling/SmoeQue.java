package Exception_Handling;

public class SmoeQue {
    public static void main(String[] args) {

        try {
            int arr[]={23,34,45};
            System.out.println(arr[4]);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Arithmetic");
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array index out of bound");
        }
        catch (Exception e)
        {
            System.out.println("exception");
        }
        finally {
            System.out.println("finally");
        }
    }
}
