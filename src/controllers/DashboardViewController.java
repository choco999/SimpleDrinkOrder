package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import models.Coffee;
import models.Juice;
import models.Order;
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

    @FXML
    private TextField nameTextField;

    @FXML
    private ListView<Order> orderListView;

    @FXML
    private Label orderDetails;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        coffeeListView.getItems().addAll(DBUtility.getCoffeeFromDB());
        coffeeLabel.setText(String.format("Coffee: %d", coffeeListView.getItems().size()));

        juiceListView.getItems().addAll(DBUtility.getJuiceFromDB());
        juiceLabel.setText(String.format("Juice: %d",juiceListView.getItems().size()));

        orderListView.getItems().addAll(DBUtility.getOrderFromDB());
        orderLabel.setText(String.format("Order: %d", orderListView.getItems().size()));


    }

    @FXML
    private void orderCoffeeButton(ActionEvent event) throws IOException {
        SceneChanger.changeScenes(event, "../views/createCoffeeView.fxml", "Order Coffee");
    }

    @FXML
    private void orderJuiceButton(ActionEvent event) throws IOException {
        SceneChanger.changeScenes(event, "../views/createJuiceView.fxml", "Order Juice");
    }

    @FXML
    void addCoffeeToOrder(ActionEvent event) {
         if (coffeeListView.getSelectionModel().getSelectedItem() != null)
         {
             if(orderListView.getSelectionModel().getSelectedItem() != null){
                 orderListView.getSelectionModel().getSelectedItem().addOrder(coffeeListView.getSelectionModel().getSelectedItem());
                 orderListView.getItems().setAll(DBUtility.getOrderFromDB());
                 orderLabel.setText(String.format("Order: %d", orderListView.getItems().size()));
             }
         }
    }

    @FXML
    void addJuiceToOrder(ActionEvent event) {
        if (juiceListView.getSelectionModel().getSelectedItem() != null)
        {
            if(orderListView.getSelectionModel().getSelectedItem() != null){
                orderListView.getSelectionModel().getSelectedItem().addOrder(juiceListView.getSelectionModel().getSelectedItem());
                orderListView.getItems().setAll(DBUtility.getOrderFromDB());
                orderLabel.setText(String.format("Order: %d", orderListView.getItems().size()));
            }
        }
    }

    @FXML
    private void orderButton(ActionEvent event) {
        if(!nameTextField.getText().isEmpty()){
            Order order1 = new Order(nameTextField.getText());
            DBUtility.insertOrderIntoDB(order1);

            orderListView.getItems().setAll(DBUtility.getOrderFromDB());
            orderLabel.setText(String.format("Order: %d", orderListView.getItems().size()));

            nameTextField.clear();
        }
    }

    @FXML
    private void viewOrder(ActionEvent event){
        if (orderListView.getSelectionModel().getSelectedItem() != null){
            orderDetails.setText(orderListView.getSelectionModel().getSelectedItem().getDetails());
        }
    }



}
