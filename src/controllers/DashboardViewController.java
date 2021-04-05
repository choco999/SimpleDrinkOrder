package controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import models.Coffee;
import models.Juice;
import utilities.DBUtility;

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
        juiceListView.getItems().addAll(DBUtility.getJuiceFromDB());
    }



}
