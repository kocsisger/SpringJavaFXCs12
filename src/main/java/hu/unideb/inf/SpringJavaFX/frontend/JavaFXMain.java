package hu.unideb.inf.SpringJavaFX.frontend;

import hu.unideb.inf.SpringJavaFX.SpringJavaFxApplication;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.boot.SpringApplication;

public class JavaFXMain extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/MainWindow.fxml"));
        stage.setScene(new Scene(root));
        stage.show();

        SpringApplication.run(SpringJavaFxApplication.class);
    }
}
