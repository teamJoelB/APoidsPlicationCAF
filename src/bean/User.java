
package bean;


public class User {
    private int id;
    private String nom;
    private String prenom;
    private String mail;
    private String mdp;
    private String sexe;
    private int taille;
    private double poids;

    public User() {
    }

    public User(int id, String nom, String prenom, String mail, String mdp, String sexe, int taille, double poids) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.mail = mail;
        this.mdp = mdp;
        this.sexe = sexe;
        this.taille = taille;
        this.poids = poids;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getMail() {
        return mail;
    }

    public String getMdp() {
        return mdp;
    }

    public String getSexe() {
        return sexe;
    }

    public int getTaille() {
        return taille;
    }

    public double getPoids() {
        return poids;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }

    public void setPoids(double poids) {
        this.poids = poids;
    }
    
    
    
}
