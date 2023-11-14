/**
 * La classe Document représente un document texte.
 */
package fr.iut.editeur.document;

public class Document {

    /**
     * Le texte contenu dans le document.
     */
    private String texte;

    /**
     * Constructeur par défaut de la classe Document.
     * Initialise le texte du document à une chaîne vide.
     */
    public Document() {
        this.texte = "";
    }

    /**
     * Retourne le texte actuel du document.
     *
     * @return Le texte du document.
     */
    public String getTexte() {
        return texte;
    }

    /**
     * Modifie le texte du document en remplaçant par la nouvelle chaîne spécifiée.
     *
     * @param texte Le nouveau texte à définir pour le document.
     */
    public void setTexte(String texte) {
        this.texte = texte;
    }

    /**
     * Ajoute du texte au document existant.
     *
     * @param texte Le texte à ajouter au document.
     */
    public void ajouter(String texte) {
        this.texte += texte;
    }

    /**
     * Retourne une représentation textuelle du document.
     *
     * @return Le contenu texte du document.
     */
    @Override
    public String toString() {
        return this.texte;
    }
}
