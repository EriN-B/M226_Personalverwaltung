package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class DialogPageController {

 @FXML
 static Button save;
 @FXML
 public TextField prename;
 @FXML
 public TextField name;

 @FXML
 private void saving_action(){
  MainPageController.dialog(prename.getText(), name.getText());
 }
}
