public class Dog extends Animal {

    Dog(Animal name) {
        super(name);


        @Override
        public void makeSound () {
            System.out.println("Voof");
        }

        @Override
        public void eat () {

        }

    }