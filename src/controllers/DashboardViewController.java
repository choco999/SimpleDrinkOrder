package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import models.Coffee;
import models.Juice;
import utilities.DBUtility;
import utilities.SceneChanger;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class DashboardViewController implements Initializable {

    @FXML
    private Label coffeeLabel;

    @FXML
    private ListView<Coffee> coffeeListView;

    @FXML
    private Label juiceLabel;

    @FXML
    private ListView<Juice> juiceListView;

    @FXML
    private Label orderLabel;

//    @FXML
//    private ListView<Order> orderListView;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        coffeeListView.getItems().addAll(DBUtility.getCoffeeFromDB());
        coffeeLabel.setText(String.format("Coffee: %d", coffeeListView.getItems().size()));

        juiceListView.getItems().addAll(DBUtility.getJuiceFromDB());
        juiceLabel.setText(String.format("Juice: %d",juiceListView.getItems().size()));
    }

    @FXML
    private void orderCoffeeButton(ActionEvent event) throws IOException {
        SceneChanger.changeScenes(event, "../views/createCoffeeView.fxml", "Order Coffee");
    }

    @FXML
    private void orderJuiceButton(ActionEvent event) throws IOException {
        SceneChanger.changeScenes(event, "../views/createJuiceView.fxml", "Order Juice");
    }



}
