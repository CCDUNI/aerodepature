import aeroapi.AeroClient;
import javafx.application.Application;

public class App extends Application {
    private static final String MESSAGE = "Hello World!";


    public App() {


    }
    
    @Override
    public void start(javafx.stage.Stage primaryStage) {
        
    }

    public static void main(String[] args) {
        Application.Launch(args);
    }

    public String getMessage() {
        return MESSAGE;
    }
    
}
