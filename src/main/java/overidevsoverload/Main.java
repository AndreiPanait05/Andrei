package overidevsoverload;

public class Main {
    public static void main(String[] args) {
        A a = new A();
        a.f();

        B b = new B();
        b.f();

        b.f(5);
        b.f(7, "aa");
    }
}
