public class Dog extends Animal {

    Dog(String name){
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Voof");
    }

        @Override
        public void eat(){

        }
    }