package keyword.varargs;
public class Main {
    public static void main(String[] args) {
        int a = 3;
        int b = 7;
        System.out.println(calculeazaImpozitPeVenituri(a, b));

        int c = 5;
        System.out.println(calculeazaImpozitPeVenituri(a, b, c));
    }
    private static int calculeazaImpozitPeVenituri(int venitObligatoriu, int... alteVenituri){
        int total = venitObligatoriu;
        for (int altVenit : alteVenituri) {
            total += altVenit;
        }
        return total;
    }
    void f(String x, int y, float... z) {   // ... tip varags
        z[0] = 3;
    }
}
