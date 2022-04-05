public class Cat extends Animal{

    Cat(String name){
        super(name);
    }

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("miav");
    }

    @Override
    public void mood() {
        if (showMood == true){
            System.out.println("Spinder");
        } else
            System.out.println("hvæser");
    }
}
