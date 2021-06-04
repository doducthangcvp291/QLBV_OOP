package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button ;
import javafx.scene.control.PasswordField;
import javafx.scene.text.Text;
import javafx.stage.Stage;


import java.awt.*;
import java.io.IOException;

public class LoginController {
    private Stage a;
    private Scene b;
    private Parent root;

          @FXML
          private PasswordField password ;
          @FXML
          private Text health;
          @FXML
          private Text manage;
          @FXML
          private TextField user ;
          @FXML
          private Button buttonlogin ;



          @FXML
          void abcs(ActionEvent event) throws IOException {
            Parent root = FXMLLoader.load(getClass().getResource("Bangtuychon.fxml"));
            a = (Stage)((Node)event.getSource()).getScene().getWindow();
            b = new Scene(root);
            a.setScene(b);
            a.show();
        }
}

