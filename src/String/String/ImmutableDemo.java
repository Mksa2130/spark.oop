package String.String;

public class ImmutableDemo {
    public static void main(String[] args) {
        String s1=new String("java " );
        String s2=s1.concat("full stack");
        System.out.println(s2);
    }
}
