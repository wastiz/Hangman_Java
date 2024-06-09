package app;

import models.Model;
import views.View;

import javax.swing.*;

/**
 * Siin klassis on meetod mida Java Virtual Machine (JVM) otsib (main). Sellest meetodist käivitaatakse rakendus
 */
public class MainApp {
    /**
     * Klassi MainApp konstruktor
     */
    public MainApp() {
        initializeUI(); // Loob GUI
    }

    /**
     * See meetod loob tegelikkuses kogu rakenduse.
     */
    private void initializeUI() {
        Model model = new Model();
        View view = new View(model); // Loome JFrame ja kõik JPanel ja sinna peale minevad JComponents

        view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // JFRame sulgemis nupu tegevus (Sulge)
        view.pack(); // "Raputa" komponendid paika
        view.setLocationRelativeTo(null); // JFRame asukoht (ekraani keskel)
        view.setVisible(true); // Tee JFrame nähtavaks
    }

    /**
     * Meetod millega käivitatakse rakendus
     * @param args käsurealt loetavad argumendid (teise andmebaasi kasutamine)
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(MainApp::new);
    }
}
