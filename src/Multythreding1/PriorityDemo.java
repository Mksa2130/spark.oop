package Multythreding1;

class Mythread2 extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getPriority());
    }
}

public class PriorityDemo {
    static void main(String[] args) {


        Mythread2 t2= new Mythread2();
        t2.setName("thread-t2");
        t2.setPriority(Thread.MIN_PRIORITY);
        t2.start();
    }
}
