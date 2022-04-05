public class Dog extends Animal {

    Dog(Animal name){
        super(name);
    }

    Dog(Animal name) {

    }

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("Voof");
    }
}
