package workshop5solution;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.paint.Color;

/**
 * This is the App class that starts the program.
 */
public class App extends Application {
    public App() {
    }

    /**
     * Starts the program.
     * @param stage Main stage for the program GUI
     */
    public void start(Stage stage) {
        PaneOrganizer organizer = new PaneOrganizer();
        Scene scene = new Scene(organizer.getRoot(), Constants.SCENE_WIDTH, Constants.SCENE_HEIGHT);
        scene.setFill(Color.LIGHTBLUE);
        stage.setScene(scene);
        stage.setTitle("Bubbly Clouds");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
