import javafx.application.Application;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.InputStream;

public class Main extends javafx.application.Application{
    public static void main(String[] args) {
        Application.launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.show();
        primaryStage.setTitle("Dangerous Weapon");
//        InputStream iconStream = getClass().getResourceAsStream("icon.png");
//        Image image = new Image(iconStream);
//        primaryStage.getIcons().add(image);
    }
}
