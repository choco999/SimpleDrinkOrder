package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import models.Juice;
import utilities.SceneChanger;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class CreateJuiceViewController implements Initializable {

    @FXML
    private TextField juiceNameTextField;

    @FXML
    private CheckBox pulpCheckBox;

    @FXML
    private ChoiceBox<String> juiceSizeChoiceBox;

    @FXML
    private VBox ingredientVBox;

    @FXML
    private CheckBox appleCheckBox;

    @FXML
    private CheckBox orangeCheckBox;

    @FXML
    private CheckBox strawberryCheckBox;

    @FXML
    private CheckBox pineappleCheckBox;

    @FXML
    private CheckBox bananaCheckBox;

    @FXML
    private CheckBox lemonCheckBox;

    @FXML
    private Label msgLabel;


    @FXML
    void returnToDashboard(ActionEvent event) throws IOException {
        SceneChanger.changeScenes(event,"../views/dashboardView.fxml","Simple Drink Order Dashboard");
    }

    @FXML
    void submitJuice(ActionEvent event) {
        try {
            Juice newJuice = new Juice(juiceNameTextField.getText(),
                    juiceSizeChoiceBox.getValue(),
                    getValueOfPulpCheckBox(pulpCheckBox.getText()));

            if(appleCheckBox.isSelected())
                newJuice.addIngredient("apple");
            if(orangeCheckBox.isSelected())
                newJuice.addIngredient("orange");
            if(strawberryCheckBox.isSelected())
                newJuice.addIngredient("strawberry");
            if(pineappleCheckBox.isSelected())
                newJuice.addIngredient("pineapple");
            if(lemonCheckBox.isSelected())
                newJuice.addIngredient("lemon");

            msgLabel.setText(newJuice.toString());

        } catch(IllegalArgumentException e){
            msgLabel.setText(e.getMessage());
        }
    }

    private boolean getValueOfPulpCheckBox(String text){
        return pulpCheckBox.isSelected();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // default value for choice box
        juiceSizeChoiceBox.setValue("Small");

        // add items to choice box
        juiceSizeChoiceBox.getItems().add("Small");
        juiceSizeChoiceBox.getItems().add("Medium");
        juiceSizeChoiceBox.getItems().add("Large");

    }
}
