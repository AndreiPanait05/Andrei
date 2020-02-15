package inheritans;

public class Student extends Person {
    int year;
    public Student() {
        this.year = 3;
        this.age = 10;
        this.name = "Ion";

    }
    @Override
    void f() {
        System.out.println("copil");
        super.f(); //constructor parinte
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.f();
        Student student = new Student();
        student.f();
    }


}
