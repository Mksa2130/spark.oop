package oops.type.encapsulation_and_abstraction;

public class Atm {

  private  String accountHoldername;

    private double balance; //hiding internal acceses
    Atm(String name, double bal)
    {
        this.accountHoldername=name;
        this.balance=bal;

    }

    public static void main(String[] args) {
     Atm a=new Atm("Mrityunjay",100000);
     a.showbal();

        
    }
    void showbal(){
        System.out.println("your curent bal "+balance);
    }

}
