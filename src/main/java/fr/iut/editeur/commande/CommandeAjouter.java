/**
 * La classe CommandeAjouter représente une commande pour ajouter du texte à un document.
 * Elle étend la classe abstraite CommandeDocument.
 */
package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeAjouter extends CommandeDocument {

    /**
     * Constructeur de la classe CommandeAjouter.
     *
     * @param document   Le document auquel le texte sera ajouté.
     * @param parameters Les paramètres nécessaires pour l'ajout de texte au document.
     */
    public CommandeAjouter(Document document, String[] parameters) {
        super(document, parameters);
    }

    /**
     * Exécute la commande pour ajouter du texte au document.
     * Si le format des paramètres est incorrect, affiche un message d'erreur.
     */
    @Override
    public void executer() {
        if (parameters.length < 2) {
            System.err.println("Format attendu : ajouter;texte");
            return;
        }
        String texte = parameters[1];
        this.document.ajouter(texte);
        super.executer();
    }
}
