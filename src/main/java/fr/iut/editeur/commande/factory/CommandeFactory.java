/**
 * La classe CommandeFactory est une fabrique pour créer des instances de commandes.
 * Elle utilise le pattern Singleton pour fournir une seule instance de la fabrique.
 */
package fr.iut.editeur.commande.factory;

import fr.iut.editeur.commande.*;
import fr.iut.editeur.document.Document;

public class CommandeFactory {

    /**
     * Instance unique de CommandeFactory (utilisation du pattern Singleton).
     */
    private static CommandeFactory instance;

    /**
     * Méthode statique pour obtenir l'instance unique de CommandeFactory.
     *
     * @return L'instance unique de CommandeFactory.
     */
    public static CommandeFactory getInstance() {
        if (instance == null) {
            instance = new CommandeFactory();
        }
        return instance;
    }

    /**
     * Constructeur privé pour empêcher l'instanciation directe de CommandeFactory depuis l'extérieur.
     */
    private CommandeFactory() {}

    /**
     * Crée une instance de commande en fonction du nom spécifié, du document et des paramètres fournis.
     *
     * @param name       Le nom de la commande à créer.
     * @param document   Le document associé à la commande.
     * @param parameters Les paramètres nécessaires pour la création de la commande.
     * @return Une instance de la commande créée ou null si le nom de la commande n'est pas reconnu.
     */
    public Commande createCommand(String name, Document document, String[] parameters) {
        switch (name) {
            case "ajouter": return new CommandeAjouter(document, parameters);
            default: return null;
        }
    }
}
