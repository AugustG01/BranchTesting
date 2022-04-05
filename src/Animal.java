public class Animal {
    private String name;

    public Animal(String name) {
    this.name = name;
    }

    public void makeSound(){

    }

    public void eat(){

    }

    public static void main(String[] args) {
        Cat c1 = new Cat();
        Dog d1 = new Dog();

        c1.makeSound();
        d1.makeSound();
    }
}
