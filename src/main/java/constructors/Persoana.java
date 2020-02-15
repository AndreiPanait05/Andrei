package constructors;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor



public class Persoana {
    static int numarTotalPersoane = 0;
    private int id;
    private String nume;

    /*public Persoana(int id, String nume) {
        this.id = id;
        this.nume = nume;
        numarTotalPersoane++;
    }
    public Persoana() {
        numarTotalPersoane++;
    }*/
}



