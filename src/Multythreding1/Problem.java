package Multythreding1;

class Addition{
    int sum=0;
    public  void add()
    {
        synchronized(this) {
            sum = sum + 1;
        }
    }
}
class Mythread3 extends Thread {
   Addition add;
    Mythread3(Addition add){
        this.add=add;

    }

    @Override
    public void run() {
        for(int i =1;i<=1000;i++){
            add.add();
        }
    }
}

class Mythread4 extends Thread {
    Addition add;
    Mythread4(Addition add){
        this.add=add;

    }

    @Override
    public void run() {
        for(int i =1;i<=1000;i++){
            add.add();
        }
    }
}
public class Problem {

    static void main(String[] args) throws InterruptedException {
        Addition addition=new Addition();


        Mythread3 t3= new Mythread3(addition);
        Mythread4 t4 = new Mythread4(addition);
        t3.start();
        t4.start();
        t3.join();
        t4.join();

        System.out.println("final sum : "+addition.sum );

    }
}
