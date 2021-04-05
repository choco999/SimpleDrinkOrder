package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.stage.Stage;
import models.Coffee;
import models.Juice;
import utilities.DBUtility;

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
        Parent root = FXMLLoader.load(getClass().getResource("../views/createCoffeeView.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Order Coffee");
        stage.show();
    }



}
