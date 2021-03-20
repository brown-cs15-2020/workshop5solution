package workshop5solution;

import javafx.event.EventHandler;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;

public class Game {
    Pane _pane;

    public Game(Pane pane){
        _pane = pane;
        _pane.addEventHandler(KeyEvent.KEY_PRESSED, new KeyHandler());
        _pane.setFocusTraversable(true);
        _pane.requestFocus();
    }

    private class KeyHandler implements EventHandler<KeyEvent> {
        int[][] coords;

        @Override
        public void handle(KeyEvent e) {
            KeyCode key = e.getCode();

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
                    break;
            }

            Cloud cloud = new Cloud(coords);

            for(Bubble cloudBubble : cloud.getComponents()){
                _pane.getChildren().add(cloudBubble.getBubble());
            }
        }
    }
}
