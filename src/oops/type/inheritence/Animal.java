package oops.type.inheritence;
    class species
    {

    }

    void fly()
    {
        System.out.println("flying.....");
    }




public class Animal extends species{


    void eat()
    {
        System.out.println("Animal is eating.....");

    }

    void sound(){

        System.out.println("Making sound trrrrrrr.......");
    }

}


class dog extends Animal{

    @Override
    void sound() {
        System.out.println("Bark......");
    }
}