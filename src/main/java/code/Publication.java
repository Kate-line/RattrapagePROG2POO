package code;

import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;

class Publication {
    private String identifiant;
    private Utilisateur proprietaire;
    private String lieu;
    private List<Message> messages;

    public Publication(String identifiant, Utilisateur proprietaire, String lieu) {
        this.identifiant = identifiant;
        this.proprietaire = proprietaire;
        this.lieu = lieu;
        this.messages = new ArrayList<>();
    }

    public String getIdentifiant() {
        return identifiant;
    }

    public Utilisateur getProprietaire() {
        return proprietaire;
    }

    public String getLieu() {
        return lieu;
    }

    public void ajouterMessage(Message message) {
        messages.add(message);
    }

    public List<Message> getMessages() {
        return new ArrayList<>(messages);
    }
}
