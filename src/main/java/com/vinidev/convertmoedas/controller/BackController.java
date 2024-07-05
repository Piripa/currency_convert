package com.vinidev.convertmoedas.controller;

import com.vinidev.convertmoedas.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class BackController {

    @FXML
    void clickCancel(ActionEvent event) {
        HelloApplication.changeScreen("moedas");
    }

    @FXML
    void clickNo(ActionEvent event) {
        HelloApplication.changeScreen("quit");

    }

    @FXML
    void clickYes(ActionEvent event) {
        HelloApplication.changeScreen("menu");

    }

}
