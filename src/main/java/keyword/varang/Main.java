package keyword.varang;
public class Main {
    public static void main(String[] args) {
        int a = 3;
        int b = 7;
        System.out.println(sum1(a, b));

        int c = 5;
        System.out.println(sum2(a, b, c));
    }
   private static int sum2(int a, int b, int c) {
        return a + b +c;
   }
    private static int sum1(int a, int b){
        return a + b;
    }
    void f(String x, int y, float... z) {   // ... tip varags
        z[0] = 3;
    }
}
