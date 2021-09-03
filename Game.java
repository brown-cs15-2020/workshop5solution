package workshop5solution;

import javafx.event.EventHandler;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;

public class Game {
    private Pane pane;

    public Game(Pane pane){
        this.pane = pane;
        this.pane.setOnKeyPressed((KeyEvent e) -> this.onKeyPress(e));
        this.pane.setFocusTraversable(true);
        this.pane.requestFocus();
    }



    public void onKeyPress(KeyEvent e) {
        KeyCode key = e.getCode();
        int [][] coords;
        switch(key) {
            case DIGIT1:
                coords = Constants.CLOUD_1;
                break;
            case DIGIT2:
                coords = Constants.CLOUD_2;
                break;
            /*
             * since our clouds are specifically generated with the 1 and 2 keys,
             * nothing should happen in the default case
            */
            default:
                return;
        }

        Cloud cloud = new Cloud(coords);

        for(Bubble cloudBubble : cloud.getComponents()){
            this.pane.getChildren().add(cloudBubble.getBubble());
        }
    }
}

