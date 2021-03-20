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

//    public void buildCloud(int type) {
//        _pane.getChildren().addAll(new Cloud(type).getComponents());
//    }

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
                 * since our clouds are specifically generated with 1 and 2, there is no default
                 * in Tetris, since they're switching on a random number, the default should be
                 * the last real case (e.g. switching on a random number 0-3, cases should be 0, 1
                 * 2) and then the default should be for 3
                */
                default:
                    break;
            }

            _pane.getChildren().addAll(new Cloud(coords).getComponents());
            /*
            if (key == KeyCode.DIGIT1) {
                Game.this.buildCloud(1);
            }
            if (key == KeyCode.DIGIT2) {
                Game.this.buildCloud(2);
            }
            e.consume();
             */
        }
    }
}
