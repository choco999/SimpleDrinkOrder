package controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import models.Coffee;

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
    private ChoiceBox<String> hotColdChoiceBox;

    @FXML
    private ChoiceBox<String> sugarChoiceBox;

    @FXML
    private ChoiceBox<String> creamChoiceBox;

    @FXML
    private void submitCoffee(){
        Coffee newCoffee = new Coffee(coffeeNameTextField.getText(),
                sizeChoiceBox.getValue(),
                true,
                true,
                2,
                2);
        System.out.println(newCoffee);
    }

//    decafCheckBox.getText(),
//            hotColdChoiceBox.getValue(),
//            sugarChoiceBox.getValue(),
//            creamChoiceBox.getItems());

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        sizeChoiceBox.getItems().add("Small");
        sizeChoiceBox.getItems().add("Medium");
        sizeChoiceBox.getItems().add("Large");
    }

}
