package Multythreding;
class Eventhread extends Thread{

    @Override
    public void run() {
        for(int i=2;i<=10;i=i+2){
            System.out.println("even :"+i);
        }
    }
}

class oddthread extends Thread{
    @Override
    public void run() {
        for(int i=1;i<=9;i=i+2){
            System.out.println("odd :"+i);
        }
    }
}


public class EvenOdd {
    static void main(String[] args) {
        new Eventhread().start();
        new oddthread().start();
    }
}
