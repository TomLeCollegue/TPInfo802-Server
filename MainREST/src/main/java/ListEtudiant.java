import java.util.ArrayList;

public class ListEtudiant {
    private ArrayList<Etudiant> etudiants = new ArrayList<Etudiant>();

    public ArrayList<Etudiant> getEtudiants() {
        return etudiants;
    }

    public void setEtudiants(ArrayList<Etudiant> etudiants) {
        this.etudiants = etudiants;
    }


    @Override
    public String toString() {
        return "ListEtudiant{" +
                "etudiants=" + etudiants +
                '}';
    }
}
