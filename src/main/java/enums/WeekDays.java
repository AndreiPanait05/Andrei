package enums;

import java.util.Arrays;
// enumul este clasa finala, nu poate fi extinsa
public enum WeekDays {
    LUNI(111),
    MARTI(106),
    MIERCURI(100),
    JOI(100),
    VINERI(100),
    SAMBATA(150),
    DUMINICA(150);

    private int procent;
    WeekDays(int procent) {
        this.procent = procent;
    }
    public static void main(String[] args) {
        WeekDays x = WeekDays.JOI;
        System.out.println(Arrays.toString(WeekDays.values()));

        System.out.println(WeekDays.JOI);
        System.out.println(WeekDays.JOI.name());
        System.out.println(WeekDays.JOI.ordinal());

        System.out.println(WeekDays.VINERI);
        System.out.println(WeekDays.VINERI.name());
        System.out.println(WeekDays.VINERI.ordinal());

        WeekDays.LUNI.procent = 222;
        System.out.println(WeekDays.LUNI.procent);


    }
}
