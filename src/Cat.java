public class Cat extends Animal{

    Cat(String name){
        super(name);
    }

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("miav");
    }
}
