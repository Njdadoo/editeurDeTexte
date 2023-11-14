/**
 * La classe CommandeInvoker agit comme un invocateur pour exécuter des commandes.
 * Elle utilise le pattern Singleton pour fournir une seule instance de l'invocateur.
 */
package fr.iut.editeur.commande.invoker;

import fr.iut.editeur.commande.Commande;

import java.util.Stack;

public class CommandeInvoker {

    /**
     * Instance unique de CommandeInvoker (utilisation du pattern Singleton).
     */
    private static CommandeInvoker instance;

    /**
     * Méthode statique pour obtenir l'instance unique de CommandeInvoker.
     *
     * @return L'instance unique de CommandeInvoker.
     */
    public static synchronized CommandeInvoker getInstance() {
        if (instance == null) {
            instance = new CommandeInvoker();
        }
        return instance;
    }

    /**
     * Constructeur privé pour empêcher l'instanciation directe de CommandeInvoker depuis l'extérieur.
     */
    private CommandeInvoker() {}

    /**
     * Exécute la commande spécifiée.
     *
     * @param commande La commande à exécuter.
     */
    public void executer(Commande commande) {
        commande.executer();
    }
}
