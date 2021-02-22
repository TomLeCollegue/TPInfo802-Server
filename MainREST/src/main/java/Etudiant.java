public class Etudiant {
    private String name;
    private String firstname;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public Etudiant(String name, String firstname) {
        this.name = name;
        this.firstname = firstname;
    }

    @Override
    public String toString() {
        return "Etudiant{" +
                "name='" + name + '\'' +
                ", firstname='" + firstname + '\'' +
                '}';
    }

}

