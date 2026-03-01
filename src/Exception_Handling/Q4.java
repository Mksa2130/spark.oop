package Exception_Handling;

public class Q4 {
    public static void main(String[] args)
    {
        try {
            try {
                int a = 10 / 0;

            } catch (NullPointerException e) {
                System.out.println("inner catch");
            }
        }catch (Exception e) {
                System.out.println("outer exception");

            System.out.println();
        }
    }
}
