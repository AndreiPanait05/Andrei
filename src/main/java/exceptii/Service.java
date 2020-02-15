package exceptii;

public class Service {
    int calcul (int x, int y) {
        if (x<0) {
            RuntimeException exception = new RuntimeException("Eroare");
            throw exception;
        }
        return x + y;
    }
    void f() throws Exception {
        int x = 3;
        if (x==4) {
            throw new Exception("All");
        }
    }

    public static void main(String[] args) {
 //      System.out.println(new Service().calcul(1,2));
 //      System.out.println(new Service().calcul(-1, 2));
        try {
            new Service().f();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
