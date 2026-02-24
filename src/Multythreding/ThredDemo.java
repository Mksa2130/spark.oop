package Multythreding;
class Mythread extends Thread
{
    @Override
    public void run() {
        for(int i=0;i<6; i++)
        {
            System.out.println("Child thread");
        }
    }
}
public class ThredDemo {
    public static void main(String[] args) {
        Mythread t =new Mythread();
        t.start();
        for (int i=0; i<6;i++){
            System.out.println("main thread");
        }

    }
}
