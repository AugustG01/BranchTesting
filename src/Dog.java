public class Dog extends Animal {

    Dog(Animal name){
        super(name);
    }

    Dog(Animal name) {

    }

    @Override
    public void makeSound() {
        System.out.println("Voof");
    }

    @Override
    public void eat() {
        System.out.println("snask");
    }
}
