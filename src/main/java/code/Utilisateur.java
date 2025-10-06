package code;

abstract class Utilisateur {
    private String identifiant;

    public Utilisateur(String identifiant) {
        this.identifiant = identifiant;
    }

    public String getIdentifiant() {
        return identifiant;
    }

    public abstract void afficherInfo();
}