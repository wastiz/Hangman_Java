package listeners;

import models.Model;
import views.View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonNew implements ActionListener {
    private Model model;
    private View view;

    public ButtonNew(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // System.out.println("Klikk"); Test
        view.hideButtons();
        if(!view.getGameTimer().isRunning()) {  //Mängu aeg ei jookse
            view.getGameTimer().setSeconds(0); // Sek nullida
            view.getGameTimer().setMinutes(0); // Min nullida
            view.getGameTimer().setRunning(true); // aeg jooksma
            view.getGameTimer().startTime(); // Käivita aeg
        } else {
            view.getGameTimer().stopTime();
            view.getGameTimer().setRunning(false);
        }
        // TODO Siit jätkub õpilaste arendus

    }
}
