package aerodeparture;

import aerodeparture.aeroapi.AeroClient;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Screen;

public class App extends Application {
    private static final String MESSAGE = "Hello World!";
    private Screen screen;
    
    @Override
    public void start(javafx.stage.Stage primaryStage) {
        screen = Screen.getPrimary();

        double screenWidth = screen.getBounds().getWidth();
        double screenHeight = screen.getBounds().getHeight();

        primaryStage.setTitle("Hello World!");
        primaryStage.setFullScreen(true);
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println(getMessage());
            }
        });

        StackPane root = new StackPane();
        root.getChildren().add(btn);
        primaryStage.setScene(new javafx.scene.Scene(root, screenWidth, screenHeight));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    public String getMessage() {
        return MESSAGE;
    }
    
}
