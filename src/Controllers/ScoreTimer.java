package Controllers;

import javafx.scene.control.Label;

import java.util.TimerTask;

public class ScoreTimer extends TimerTask {
    private static int min = 4;
    private static int sc = 59;

    public ScoreTimer(Label scends, Label minutes) {
    }

    @Override
    public void run() {

    }

    private void time(Label scends, Label minutes) {

        sc--;
        if (sc == 0) {
            min--;
            sc = 59;
        }
        scends.setText(Integer.toString(sc));
        minutes.setText(Integer.toString(min));


    }

}


