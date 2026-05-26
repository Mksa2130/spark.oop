package oops.type.abstractDemoInterfaceMultithreading;

public interface Animal {
    void makesound();

    void eat();

}
class Dog implements Animal{

    @Override
    public void makesound() {
        System.out.println("Dog brak ");
    }

    @Override
    public void eat() {
        System.out.println("Dudh roti ");

    }

    static void main(String[] args) {
        Animal dog=new Dog();

        dog.eat();
        dog.makesound();
    }
}