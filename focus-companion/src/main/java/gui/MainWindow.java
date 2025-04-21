// Inside src/main/java/gui/MainWindow.java
package gui;

import javafx.scene.layout.StackPane;
import javafx.scene.control.Label;

public class MainWindow extends StackPane {
    
    public MainWindow() {
        // For now, the window will just display a label
        Label label = new Label("Welcome to Focus Companion!");
        this.getChildren().add(label); // Add the label to the window
    }
}
