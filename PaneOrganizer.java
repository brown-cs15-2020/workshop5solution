package workshop5solution;

import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

/**
 * Organizes GUI layout for workshop5.
 */
public class PaneOrganizer {
    private BorderPane _root;

    public PaneOrganizer() {
        _root = new BorderPane();
        Pane cloudPane = new Pane();
        _root.setCenter(cloudPane);
        new Game(cloudPane);
    }

    public Pane getRoot() {
        return _root;
    }
}

