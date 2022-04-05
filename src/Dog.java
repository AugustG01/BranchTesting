public class Dog extends Animal {

    Dog(Animal name){
        super();
    }

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("Voof");
    }
}
