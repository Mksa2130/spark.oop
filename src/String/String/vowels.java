package String.String;

public class vowels {
    public static void main(String[] args) {

        String s1 = "Mrityunjay";
        int v=0; int c=0;
        for (char c1:s1.toCharArray())
        {
            if ("aeiou")
            {
                v++;
            }
            else{
                c++;
            }
        }
    }
}
