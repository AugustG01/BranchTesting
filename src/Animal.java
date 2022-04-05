public class Animal {
    private String name;

    public Animal() {

    }

    public void makeSound(){

    }

    public void go(){
        makeSound();
    }

    public static void main(String[] args) {
        new Animal().go();
    }
}
