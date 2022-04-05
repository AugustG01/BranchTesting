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

    @Override
    public void mood() {
    if(showMood == true){
        System.out.println("logrer");
    }else
        System.out.println("knurrer");
    }
}