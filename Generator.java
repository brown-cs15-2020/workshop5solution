package workshop5solution;

import javafx.event.EventHandler;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;

public class Generator {
    Pane _pane;

    public Generator(Pane pane){
        _pane = pane;
        _pane.addEventHandler(KeyEvent.KEY_PRESSED, new KeyHandler());
        _pane.setFocusTraversable(true);
        _pane.requestFocus();
    }

    public void buildCloud(int type) {
        _pane.getChildren().addAll(new Cloud(type).getComponents());
    }

    private class KeyHandler implements EventHandler<KeyEvent> {
        @Override
        public void handle(KeyEvent e) {
            KeyCode key = e.getCode();
            if (key == KeyCode.DIGIT1) {
                Generator.this.buildCloud(0);
            }
            if (key == KeyCode.DIGIT2) {
                Generator.this.buildCloud(1);
            }
            e.consume();
        }
    }
}
