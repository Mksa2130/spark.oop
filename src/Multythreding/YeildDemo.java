package Multythreding;
class YeildThread extends Thread{
    @Override
    public void run() {
        for(int i=1; i<=10; i++)
        {
            System.out.println(Thread.currentThread().getName()+" -- "+i);
            Thread.yield();
        }
    }
}


public class YeildDemo {

    static void main(String[] args) {

YeildThread t1= new YeildThread();
YeildThread t2= new YeildThread();

t1.start();
t2.start();
    }
}
