package code;

class UtilisateurAnonyme extends Utilisateur {

    public UtilisateurAnonyme(String identifiant) {
        super(identifiant);
    }

    @Override
    public void afficherInfo() {
        System.out.println("Id utiliosateur anonyme: " + identifiant);
    }
}