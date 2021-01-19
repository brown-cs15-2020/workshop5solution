package workshop5solution;

import javafx.scene.layout.Pane;

/**
 * Organizes GUI layout for workshop5.
 */
public class PaneOrganizer {
    private Pane _root;

    public PaneOrganizer() {
        _root = new Pane();
    }

    public Pane getRoot() {
        return _root;
    }
}

