/**
 * La classe abstraite CommandeDocument est une base pour les commandes liées à un document.
 * Elle implémente l'interface Commande.
 */
package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public abstract class CommandeDocument implements Commande {

    /**
     * Le document associé à la commande.
     */
    protected Document document;

    /**
     * Les paramètres de la commande.
     */
    protected String[] parameters;

    /**
     * Constructeur de la classe CommandeDocument.
     *
     * @param document   Le document concerné par la commande.
     * @param parameters Les paramètres associés à la commande.
     */
    public CommandeDocument(Document document, String[] parameters) {
        this.document = document;
        this.parameters = parameters;
    }

    /**
     * Exécute la commande. Par défaut, affiche le document lié à la commande.
     * Les classes filles devraient implémenter leur propre logique d'exécution.
     */
    @Override
    public void executer() {
        System.out.println(this.document);
    }
}
