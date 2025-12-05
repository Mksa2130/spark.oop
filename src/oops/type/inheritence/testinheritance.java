package oops.type.inheritence;

public class testinheritance {
    public static void main(String[] args) {

        Animal animal=new Animal();
        animal.eat();
        animal.sound();
        animal.fly();

        dog dog=new dog();
        dog.eat();
        dog.sound();
        dog.fly();

        Animal a= new dog();
        a.sound();
    }
}
