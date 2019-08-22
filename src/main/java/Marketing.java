public class Marketing extends Departament implements Evaluator{


    public Marketing() {
        super("Marketing", 6);
    }

    public StatusCandidat evalueaza(Candidat candidat) {
        //to be implements

        if (candidat.getNivelDeComp() > super.getNivelMinimDeCompetente()) {
            return StatusCandidat.ACCEPTAT;
        } else if (candidat.getNivelDeComp() < super.getNivelMinimDeCompetente()) {
            return StatusCandidat.RESPINS;
        } else {
            return StatusCandidat.IN_ASTEPTARE;
        }
    }
}
