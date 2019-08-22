import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Companie companie= new Companie("SDA");


        Departament departamentMarketing = new Marketing();
        Departament departamentProductie = new Productie();
        Departament departamentHr = new Departament("HR", 5);

        List<Departament> departaments = new ArrayList<Departament>();
        departaments.add(departamentMarketing);
        departaments.add(departamentProductie);
        departaments.add(departamentHr);

        companie.setDepartamente(departaments); //daca pun un obiect sa apartina unui alt obiect punem set

        Candidat candidat1 = new Candidat("Pop", "Ion", 10, "Marketing");
        Candidat candidat2 = new Candidat("Popa", "Andreea", 1, "Productie");
        Candidat candidat3 = new Candidat("Vlad", "Mihai", 7, "Productie");
        Candidat candidat4 = new Candidat("Pop ", "Andrei", 3, "HR");

        List<Candidat> candidats = new ArrayList<>();
        candidats.add(candidat1);
        candidats.add(candidat2);
        candidats.add(candidat3);
        candidats.add(candidat4);

        companie.setAngajati(candidats);
        for (Candidat candidat : candidats) {
            try {
                companie.recruteaza(candidat);
                System.out.println(candidat.getStatusCandidat());
            } catch (IncapacitateEvaluare e ) {
                System.out.println("Esti un prost daca nu ai fost acceptat");
            }
        }
    }
}
