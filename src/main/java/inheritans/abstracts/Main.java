package inheritans.abstracts;

public class Main {
    public static void main(String[] args) {
        //Animal animal = new Animal();
        //animal.mananca();
        Dog dog = new Dog();
        dog.mananca();

        Cat cat = new Cat();
        cat.mananca();
        scrie(cat);

        Animal x = dog;
        x.mananca();
    }
    private static void scrie(Cat cat) {
        System.out.println("pisica " + cat);
    }
}
