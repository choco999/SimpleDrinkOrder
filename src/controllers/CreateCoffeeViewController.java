package controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class CreateCoffeeViewController implements Initializable {

    @FXML
    private TextField coffeeNameTextField;

    @FXML
    private CheckBox decafCheckBox;

    @FXML
    private ChoiceBox<String> sizeChoiceBox;

    @FXML
    private ChoiceBox<?> hotColdChoiceBox;

    @FXML
    private ChoiceBox<?> sugarChoiceBox;

    @FXML
    private ChoiceBox<?> creamChoiceBox;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        sizeChoiceBox.getItems().add("Small");
        sizeChoiceBox.getItems().add("Medium");
        sizeChoiceBox.getItems().add("Large");
    }

}
