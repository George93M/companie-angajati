public class Productie extends Departament implements Evaluator {
   //static final=constanta
    //nume='Productie'
//nivelComp=3


    public Productie() {
        super("Productie", 3);
    }

    public StatusCandidat evalueaza(Candidat candidat) {
        if (candidat.getNivelDeComp() > super.getNivelMinimDeCompetente()) {
            return StatusCandidat.ACCEPTAT;
        } else if (candidat.getNivelDeComp() < super.getNivelMinimDeCompetente()) {
            return StatusCandidat.RESPINS;
        } else {
            return StatusCandidat.IN_ASTEPTARE;
        }
    }
}
// git push origin master
