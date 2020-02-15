package constructors;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class MainPersoana {
    public static void main(String[] args) {
        Persoana persoana = new Persoana(1, "Ion");
        //persoana.setId(1);
        //persoana.setNume("Ion");
        Persoana persoana2 = new Persoana(2, "Gheorghe");
        //persoana.setId(1);
        //persoana.setNume("Gheorghe");

        Persoana persoana3 = new Persoana();
        persoana3.setId(1);
        persoana3.setNume("Vasile");

        afiseazapersoana(persoana);
        afiseazapersoana(persoana2);
        afiseazapersoana(persoana3);

    }


    private static void afiseazapersoana(Persoana persoana) {
        System.out.println("nume = " + persoana.getNume() + " id = " + persoana.getId());
    }
}
