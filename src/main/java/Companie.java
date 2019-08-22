import java.util.ArrayList;
import java.util.List;

public class Companie {
    String NumeComp;
  private  List<Candidat>angajati;
  private List<Departament>departamente;
    //getere,setere,constructor

    public String getNumeComp() {
        return NumeComp;
    }

    public void setNumeComp(String numeComp) {
        NumeComp = numeComp;
    }

    public List<Candidat> getAngajati() {
        return angajati;
    }

    public void setAngajati(List<Candidat> angajati) {
        this.angajati = angajati;
    }

    public void recruteaza(){

    }
}
