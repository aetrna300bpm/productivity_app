// Inside src/main/java/runtime/RuntimeManager.java
package runtime;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import gui.MainWindow;  // Assuming you'll create MainWindow in the 'gui' package

public class RuntimeManager extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Initialize any application-wide services here if needed (e.g., data loading)
        
        // Set up the main window (blank window for now)
        MainWindow mainWindow = new MainWindow();
        Scene scene = new Scene(mainWindow, 800, 600);
        primaryStage.setTitle("Focus Companion");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        // Launch the JavaFX application
        launch(args);
    }
}
