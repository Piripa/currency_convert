package com.vinidev.convertmoedas.controller;

import com.vinidev.convertmoedas.HelloApplication;
import javafx.event.ActionEvent;

public class ErrorController {
    public void clickOkInvalid(ActionEvent actionEvent) {
        HelloApplication.changeScreen("moedas");
    }
}
