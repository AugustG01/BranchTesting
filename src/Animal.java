public class Animal {
    private String name;

    Animal(Animal name){

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
