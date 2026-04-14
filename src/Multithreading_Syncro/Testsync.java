package Multithreading_Syncro;

public class Testsync {
    static void main(String[] args) {
        System.out.println("..............sync Thread...................");
        TablePrintWithMethod t=new TablePrintWithMethod();
        Thread t1= new Mythread1(t);
        Thread t2 = new Mythread1(t);
        t1.setName("first-thread");
        t2.setName("Second-thread");

        t1.start();
        t2.start();
    }
}
