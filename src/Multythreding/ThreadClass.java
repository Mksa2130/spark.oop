package Multythreding;

class mythread1 extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}



public class ThreadClass {

    //.start()
    //.run()
    //getName()
    //setName()
    //setPriority()

    static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        Thread t =Thread.currentThread();
       t.setName("mera thread");
        System.out.println(Thread.currentThread().getName());

        mythread1 t1= new mythread1();
        t1.setName("child-thread");
        t1.start();
    }
}
