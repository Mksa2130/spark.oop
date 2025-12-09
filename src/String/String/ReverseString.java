package String.String;

public class ReverseString {
    public static void main(String[] args) {

        String s1="Amritesh";
        //loop
        for (int i=0; i<s1.length();i++)
        {
            System.out.print(s1.charAt(i));
        }

        System.out.println();

        //REVERSELOOP
        for(int i=s1.length()-1;i>=0;i--)
        {
            System.out.print(s1.charAt(i));
        }
    }
}
