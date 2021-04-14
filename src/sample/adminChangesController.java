package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class adminChangesController implements Initializable {

    @FXML
    private Button buttonDeleteTour;
    @FXML
    private Button buttonAddTour;
    @FXML
    private TextField textTourName;
    @FXML
    private DatePicker dateTourDate;
    @FXML
    private TextField textTourPrice;
    @FXML
    private TextField textMaxBooking;
    @FXML
    private TextField textTourInfo;
    @FXML
    private TextField textTourID;
    @FXML
    private TextField textTourServices;
    @FXML
    private TextField textTourRegion;
    @FXML
    private TextField textTourDuration;
    @FXML
    private ChoiceBox choiceBoxTourRegion, choiceBoxTourServices;

    TourController tourController = new TourController();
    public void backToMainPageButtonAdminCOnAction(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("search.fxml"));
        Scene tableViewScene = new Scene(root);
        Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        window.setScene(tableViewScene);
        window.show();
    }

    public void buttonAddTourOnAction(ActionEvent event) {
        String name = textTourName.getText();
        String info = textTourInfo.getText();
        int spots = Integer.parseInt(textMaxBooking.getText());
        int price = Integer.parseInt(textTourPrice.getText());
        String  region = choiceBoxTourRegion.getValue().toString();
        System.out.println(region);
        int duration = Integer.parseInt(textTourDuration.getText());
        String services = choiceBoxTourServices.getValue().toString();
        LocalDate date = dateTourDate.getValue();
        Tour tour= new Tour(name,info,date,spots,price,region,duration,services);
        tour.setTourID(51);  // þarf að skoða með þetta
        tourController.addTour(tour);
    }

    public void buttonDeleteTourOnAction(ActionEvent event) {
        String s = textTourID.getText();
        int enteredTourID = Integer.parseInt(s);
        tourController.deleteTour(enteredTourID);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        choiceBoxTourRegion.getItems().addAll("Akureyri", "Egilsstaðir", "Reykjavík","Ísafjörður");
        choiceBoxTourRegion.getSelectionModel().select(" ");
        choiceBoxTourServices.getItems().addAll("Family friendly", "Action","Wheelchair accessible");
        choiceBoxTourServices.getSelectionModel().select(" ");
    }
}
