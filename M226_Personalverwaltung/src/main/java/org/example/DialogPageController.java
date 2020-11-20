package org.example;

import javafx.fxml.FXML;
import javafx.geometry.Pos;

import java.awt.*;

public class DialogPageController {
 @FXML
 static TextField prename;
 @FXML
 static TextField name;
 @FXML
 static Button safe;

 @FXML
 private void safe_action(){
    MainPageController.dialog(String.valueOf(prename),String.valueOf(name));
 }
}
