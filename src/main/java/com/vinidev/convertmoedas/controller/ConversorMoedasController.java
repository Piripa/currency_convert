package com.vinidev.convertmoedas.controller;

import com.almasb.fxgl.core.collection.Array;
import com.vinidev.convertmoedas.api.ConfigCotacao;
import com.vinidev.convertmoedas.moedas.Moeda;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ConversorMoedasController {

    @FXML
    private MenuButton selectMoedas;

    @FXML
    private TextField getValue;

    @FXML
    private MenuItem usdbr;

    @FXML
    private TextArea setText;

    @FXML
    public void initialize(){
        usdbr.setOnAction(event -> selectMoedas.setText(usdbr.getText()));

    }

    public void converterMoeda(ActionEvent actionEvent) throws Exception {
        String[] escolhaConversao = selectMoedas.getText().split("-");
        double value = Double.valueOf(getValue.getText()).doubleValue();
        Moeda moeda = new Moeda(escolhaConversao[0],value,escolhaConversao[1]);
        ConfigCotacao configCotacao = new ConfigCotacao(moeda);
        Double resultado = configCotacao.getConvertValue();
        setText.setText("O resultado da conversão de " + configCotacao.getName() + " é igual a R$ " + String.format("%.2f",resultado));
    }
}
