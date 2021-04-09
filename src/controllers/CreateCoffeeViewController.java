package controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
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
    private Label msgLabel;

    @FXML
    private void submitCoffee(){
        try {
            Coffee newCoffee = new Coffee(coffeeNameTextField.getText(),
                    sizeChoiceBox.getValue(),
                    getValueOfHotColdChoiceBox(hotColdChoiceBox.getValue()),
                    getValueOfDecafCheckBox(decafCheckBox.getText()),
                    getValueOfSugarCheckBox(sugarChoiceBox.getValue()),
                    getValueOfCreamCheckBox(creamChoiceBox.getValue()));

            msgLabel.setText(newCoffee.toString());
        } catch(IllegalArgumentException e){
            msgLabel.setText(e.getMessage());
        }

    }

    private boolean getValueOfDecafCheckBox(String text){
        return decafCheckBox.isSelected();
    }

    private boolean getValueOfHotColdChoiceBox(String temp){
        return hotColdChoiceBox.getValue().equals("Hot");
    }

    private int getValueOfSugarCheckBox(String numOfSugar){
        int number = 0;
        switch(numOfSugar){
            case "0":
                number = 0;
                break;
            case "1":
                number = 1;
                break;
            case "2":
                number = 2;
                break;
            case "3":
                number = 3;
                break;
            case "4":
                number = 4;
                break;
        }
        return number;
    }

    private int getValueOfCreamCheckBox(String numOfCream){
        int number = 0;
        switch(numOfCream){
            case "0":
                number = 0;
                break;
            case "1":
                number = 1;
                break;
            case "2":
                number = 2;
                break;
            case "3":
                number = 3;
                break;
            case "4":
                number = 4;
                break;
        }
        return number;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // default value for choice box
        sizeChoiceBox.setValue("Small");
        hotColdChoiceBox.setValue("Hot");
        sugarChoiceBox.setValue("0");
        creamChoiceBox.setValue("0");

        // add items to choice box
        sizeChoiceBox.getItems().add("Small");
        sizeChoiceBox.getItems().add("Medium");
        sizeChoiceBox.getItems().add("Large");

        hotColdChoiceBox.getItems().add("Hot");
        hotColdChoiceBox.getItems().add("Cold");

        sugarChoiceBox.getItems().add("0");
        sugarChoiceBox.getItems().add("1");
        sugarChoiceBox.getItems().add("2");
        sugarChoiceBox.getItems().add("3");
        sugarChoiceBox.getItems().add("4");

        creamChoiceBox.getItems().add("0");
        creamChoiceBox.getItems().add("1");
        creamChoiceBox.getItems().add("2");
        creamChoiceBox.getItems().add("3");
        creamChoiceBox.getItems().add("4");

    }

}
