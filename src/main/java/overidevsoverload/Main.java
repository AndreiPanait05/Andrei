package overidevsoverload;

public class Main {
    public static void main(String[] args) {
        A a = new A();
        a.f();

        B b = new B();
        b.f();
    }
}
