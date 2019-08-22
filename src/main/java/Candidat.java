public class Candidat {
   private String nume;
    private String pren;
   private  int nivelDeComp;
   private String numeDepartament;
   private StatusCandidat statusCandidat;

    public Candidat() {
    }

    public Candidat(String nume, String pren, int nivelDeComp, String numeDepartament) {
        this.nume = nume;
        this.pren = pren;
        this.nivelDeComp = nivelDeComp;
        this.numeDepartament = numeDepartament;
        this.statusCandidat = StatusCandidat.IN_ASTEPTARE;
    }



    public StatusCandidat getStatusCandidat() {
        return statusCandidat;
    }

    public void setStatusCandidat(StatusCandidat statusCandidat) {
        this.statusCandidat = statusCandidat;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPren() {
        return pren;
    }

    public void setPren(String pren) {
        this.pren = pren;
    }

    public int getNivelDeComp() {
        return nivelDeComp;
    }

    public void setNivelDeComp(int nivelDeComp) {
        this.nivelDeComp = nivelDeComp;
    }

    public String getNumeDepartament() {
        return numeDepartament;
    }

    public void setNumeDepartament(String numeDepartament) {
        this.numeDepartament = numeDepartament;
    }
}
