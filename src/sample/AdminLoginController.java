package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class AdminLoginController {
    @FXML
    private TextField adminUsername, adminPassword;
    @FXML
    private Text textWrongPassword;
    @FXML
    private PasswordField passwordFieldLogin;

    public void backToMainPageButtonFromAOnAction(ActionEvent event) throws IOException {
        changesPages("search.fxml",event);
    }

    public void buttonAdminLoginOnAction(ActionEvent event) throws IOException {
            String userN=adminUsername.getText();
            String userP=adminPassword.getText();
            if (userN.equals("admin") && userP.equals("admin123")){
                changesPages("adminChanges.fxml",event);
            }
            else {
                textWrongPassword.setText("Username or password is incorrect");
            }
            adminUsername.setText("");
            adminPassword.setText("");
    }

    private void changesPages(String pages, ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource(pages));
        Scene tableViewScene = new Scene(root);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(tableViewScene);
        window.show();
    }
}
