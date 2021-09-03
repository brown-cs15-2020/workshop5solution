package workshop5solution;

import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

/**
 * Organizes GUI layout for workshop5.
 */
public class PaneOrganizer {
    private BorderPane root;

    public PaneOrganizer() {
        this.root = new BorderPane();
        Pane cloudPane = new Pane();
        this.root.setCenter(cloudPane);
        new Game(cloudPane);
    }

    public Pane getRoot() {
        return this.root;
    }
}

