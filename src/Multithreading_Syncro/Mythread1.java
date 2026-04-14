package Multithreading_Syncro;

public class Mythread1 extends Thread {

    TablePrintWithMethod t;
    Mythread1(TablePrintWithMethod t){
        this.t=t;
    }

    @Override
    public void run() {
        t.printTable(5);
    }
}
