package fr.iut.editeur.document;

import junit.framework.TestCase;
public class DocumentTest extends TestCase {

    public void testAddText() {
        Document doc = new Document();
        doc.addText("Hello");
        assertEquals("Hello", doc.getText());
    }

    public void testClear() {
        Document doc = new Document();
        doc.addText("Hello");
        doc.clear();
        assertEquals("", doc.getText());
    }

    public void testAddTextMultipleTimes() {
        Document doc = new Document();
        doc.addText("Hello");
        doc.addText(" World");
        assertEquals("Hello World", doc.getText());
    }

    // ... Ajoutez d'autres tests selon les méthodes de la classe Document que vous souhaitez tester

}
