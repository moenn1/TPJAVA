package comTP7;

public class Examen {
    String matricule; //Cle etrangere etudiant
    String code; //cle etrangere cours
    double note;

    public Examen(String matricule, String code, double note) {
        this.matricule = matricule;
        this.code = code;
        this.note = note;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double getNote() {
        return note;
    }

    public void setNote(double note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "Examen{" +
                "matricule='" + matricule + '\'' +
                ", code='" + code + '\'' +
                ", note=" + note +
                '}';
    }

    //Function pour la creation de table
    public static void createTable() {
        Database db = new Database();
        db.connect();
        String sql = "CREATE TABLE IF NOT EXISTS examen (matricule VARCHAR(10), code VARCHAR(10), note DOUBLE, PRIMARY KEY (matricule, code), FOREIGN KEY (matricule) REFERENCES etudiant(matricule), FOREIGN KEY (code) REFERENCES cours(code))";
        db.execute(sql);
        db.disconnect();
    }
}
