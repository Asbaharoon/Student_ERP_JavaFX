/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studenter;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.layout.VBox;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class LoginController implements Initializable {

    @FXML
    private VBox vbox;

    private Parent fxml;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        TranslateTransition t = new TranslateTransition(Duration.seconds(1),vbox);
        t.setToX(vbox.getLayoutX()*10);
        t.play();
        t.setOnFinished((e)->{
            try {
                fxml=FXMLLoader.load(getClass().getResource("SignIn.fxml"));
                vbox.getChildren().removeAll();
                vbox.getChildren().setAll(fxml);
            } catch (IOException ex) {
                Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        
    }    

    @FXML
    private void newsign(ActionEvent event) {
    TranslateTransition t = new TranslateTransition(Duration.seconds(1),vbox);
        t.setToX(0);
        t.play();
        t.setOnFinished((e)->{
            try {
                fxml=FXMLLoader.load(getClass().getResource("forgotPassword.fxml"));
                vbox.getChildren().removeAll();
                vbox.getChildren().setAll(fxml);
            } catch (IOException ex) {
                Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    @FXML
    private void newsignagain(ActionEvent event) {
     TranslateTransition t = new TranslateTransition(Duration.seconds(1),vbox);
        t.setToX(vbox.getLayoutX()*9.5);
        t.play();
        t.setOnFinished((e)->{
            try {
                fxml=FXMLLoader.load(getClass().getResource("SignIn.fxml"));
                vbox.getChildren().removeAll();
                vbox.getChildren().setAll(fxml);
            } catch (IOException ex) {
                Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }
}
