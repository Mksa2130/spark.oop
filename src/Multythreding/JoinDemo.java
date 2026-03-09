package Multythreding;
class Jointhread extends Thread{
    @Override
    public void run() {

        for (int i =0;i<=10; i++){
            System.out.println("Child");
        }
    }
}


public class JoinDemo {
    static void main(String[] args) throws InterruptedException {
        Jointhread t1 = new Jointhread();
        t1.start();
        t1.join();
        for (int i=0 ; i<=8;i++)
        {
            System.out.println("main thread");
        }
    }
}
