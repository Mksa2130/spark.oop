package Multythreding1;
class SleepThread extends Thread{
    @Override
    public void run() {
        for (int i=1;i<=10;i++)
        {


           System.out.println(getName()+" --- "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread intrerrupted");
            }

        }
    }
}


public class SleepDemo {
    static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());

        SleepThread t1=new SleepThread();
        t1.setName("child");
        t1.start();
    }
}
