public abstract class Animal {
    private String name;
    private String foodType;
    public Animal() {

    }

    public abstract void makeSound();

    public abstract void eat();


    public void go(){
        makeSound();
    }

    public static void main(String[] args) {
        new Animal() {
            @Override
            public void makeSound() {

            }

            @Override
            public void eat() {
            }
        }.go();
    }
}
