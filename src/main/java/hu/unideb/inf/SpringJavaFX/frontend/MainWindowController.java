package hu.unideb.inf.SpringJavaFX.frontend;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MainWindowController {
    @FXML
    public Label nameLabel;

    @FXML
    public void loadData(ActionEvent actionEvent) {
        nameLabel.setText(JavaFXMain.manager.getPersonName());
    }
}
