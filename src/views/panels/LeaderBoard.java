package views.panels;

import models.Model;
import views.View;

import javax.swing.*;
import java.awt.*;

/**
 * See on edetabeli klass. See näitab andmebaasist loetud edetabelit. Seda ei saa mängimise ajal
 * vaadata.
 */
public class LeaderBoard extends JPanel {
    /**
     * Klassisisene mudel, mille väärtus saadakse View konstruktorist ja loodud MainApp-is
     */
    private final Model model;
    /**
     * Klassisisene vaade, mille väärtus saadakse otse View-st
     */
    private final View view;

    public LeaderBoard(Model model, View view) {
        this.model = model;
        this.view = view;

        setBackground(new Color(250, 150, 215)); // Leaderboard paneeli taustavärv
    }

}
