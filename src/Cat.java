public class Cat extends Animal{

    Cat(Animal name){
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("miav");
    }

    @Override
    public void eat() {

    }
}
