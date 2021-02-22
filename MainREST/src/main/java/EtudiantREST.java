import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

@Path("/Etudiants")
public class EtudiantREST {

    public static ListEtudiant listEtudiant = new ListEtudiant();
    @POST
    @Path("/returnListe")
    public ListEtudiant returnList(){

        listEtudiant.getEtudiants().add(new Etudiant("toto","cutting"));
        listEtudiant.getEtudiants().add(new Etudiant("Tom","Kubasik"));
        listEtudiant.getEtudiants().add(new Etudiant("Hugo","Bollon"));
        listEtudiant.getEtudiants().add(new Etudiant("Sammy","Dep-Dep"));

        return listEtudiant;

    }



}
