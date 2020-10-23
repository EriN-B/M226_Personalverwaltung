package org.example;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.util.ArrayList;
import java.util.List;

public class MainPageController {
    @FXML
    Button back_1;
    @FXML
    Button back_2;
    @FXML
    Button forward_1;
    @FXML
    Button forward_2;
    @FXML
    Button add;
    @FXML
    Button remove;
    @FXML
    Button discard;
    @FXML
    Button safe;
    @FXML
    TextField pin;
    @FXML
    TextField name;

    private List<Person> Personen = new ArrayList<>();
    private int m_Position = 0;

    public void initialize(){
        for (int i = 1; i <= 3; i++){
            Person p = new Person();
            p.setM_Name("Neue Person"+i);
            Personen.add(p);
        }
        m_Position = 1; //Das erste Personenobjekt soll visualisiert werden
        FillForm();
    }

    private void FillForm(){
        Person p = Personen.get(m_Position - 1);
        System.out.println(p.getM_Name());
    }

    public void btn_click_add(){
    }
    @FXML
    private void OnFirst() { //back_2

    }
    @FXML
    private void OnPrevious() {//back_1

    }
    @FXML
    private void OnNext() {//forward_1

    }
    @FXML
    private void OnLast() {//forward_2

    }

//Met
}
