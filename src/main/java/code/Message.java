package code;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Message {
    private String texte;
    private LocalDateTime dateHeure;
    private boolean confidentiel;
    private Utilisateur auteur;

    public Message(String texte, boolean confidentiel, Utilisateur auteur) {
        this.texte = texte;
        this.dateHeure = LocalDateTime.now();
        this.confidentiel = confidentiel;
        this.auteur = auteur;
    }

    public String getTexte() {
        return texte;
    }

    public LocalDateTime getDateHeure() {
        return dateHeure;
    }

    public boolean isEstConfidentiel() {
        return confidentiel;
    }

    public Utilisateur getAuteur() {
        return auteur;
    }
}