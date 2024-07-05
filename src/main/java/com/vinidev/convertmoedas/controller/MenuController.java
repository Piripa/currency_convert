package com.vinidev.convertmoedas.controller;

import com.vinidev.convertmoedas.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;


public class MenuController {
    @FXML
    private Label welcomeText;

    @FXML
    private MenuButton menuOpcoes;


    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    protected void oneHelloButtonClick(ActionEvent event) {

}
    public void changeScreenMoedas(ActionEvent actionEvent) {
        HelloApplication.changeScreen("moedas");
    }

    public void quitClick(ActionEvent actionEvent) {
        HelloApplication.changeScreen("quit");
    }
}
