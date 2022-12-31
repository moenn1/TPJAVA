package comTP7;

public class Cours {
    private String code;
    private String nomCours;
    private String enseignant;

    public Cours(String code, String nomCours, String enseignant){
        this.code = code;
        this.nomCours = nomCours;
        this.enseignant = enseignant;
    }


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNomCours() {
        return nomCours;
    }

    public void setNomCours(String nomCours) {
        this.nomCours = nomCours;
    }

    public String getEnseignant() {
        return enseignant;
    }

    public void setEnseignant(String enseignant) {
        this.enseignant = enseignant;
    }

    public String toString(){
        return "Code: "+code+" Nom: "+nomCours+" Enseignant: "+enseignant;
    }


    public static void main(String[] args) {

    }
}
