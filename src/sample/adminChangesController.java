package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class adminChangesController {
    @FXML
    private Button buttonCancelTour;
    @FXML
    private Button buttonAddTour;
    @FXML
    private TextField textTourName;
    @FXML
    private TextField textTourDate;
    @FXML
    private TextField textTourPrice;
    @FXML
    private TextField textMaxBooking;
    @FXML
    private TextField textTourInfo;
    @FXML
    private TextField textTourID;

    /*public adminChangesController(Button buttonAddTour) {
        this.buttonAddTour = buttonAddTour;
    }*/

    public void backToMainPageButtonAdminCOnAction(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("search.fxml"));
        Scene tableViewScene = new Scene(root);
        Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(tableViewScene);
        window.show();
    }

    public void buttonAddTourOnAction(ActionEvent actionEvent) {
        String tourName = textTourName.getText();
        String tourDate = textTourDate.getText();
        String tourPrice = textTourPrice.getText();
        String maxBooking = textMaxBooking.getText();
        String tourInfo = textTourInfo.getText();
    }

    public void buttonCancelTourOnAction(ActionEvent event) {
        String tourID = textTourID.getText();

    }
}
