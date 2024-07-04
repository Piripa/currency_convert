package com.vinidev.convertmoedas.controller;

import com.almasb.fxgl.core.collection.Array;
import com.vinidev.convertmoedas.HelloApplication;
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
    public MenuItem yuybrl;
    @FXML
    public MenuItem eurbrl;
    @FXML
    public MenuItem btcbrl;
    @FXML
    public MenuItem usdeur;
    @FXML
    public MenuItem dogebrl;
    @FXML
    public MenuItem brlgbp;
    @FXML
    public MenuItem eurchf;
    @FXML
    public MenuItem brlusd;
    @FXML
    public MenuItem brleur;
    @FXML
    public MenuItem brlchf;
    @FXML
    public MenuItem brluyu;
    @FXML
    public MenuItem euraoa;
    @FXML
    public MenuItem usdaoa;
    @FXML
    public MenuItem brlars;
    @FXML
    public MenuItem arsbrl;
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
        yuybrl.setOnAction(event -> selectMoedas.setText(yuybrl.getText()));
        eurbrl.setOnAction(event -> selectMoedas.setText(eurbrl.getText()));
        btcbrl.setOnAction(event -> selectMoedas.setText(btcbrl.getText()));
        usdeur.setOnAction(event -> selectMoedas.setText(usdeur.getText()));
        brlgbp.setOnAction(event -> selectMoedas.setText(brlgbp.getText()));
        brleur.setOnAction(event -> selectMoedas.setText(brleur.getText()));
        brlchf.setOnAction(event -> selectMoedas.setText(brlchf.getText()));
        brlars.setOnAction(event -> selectMoedas.setText(brlars.getText()));
        euraoa.setOnAction(event -> selectMoedas.setText(euraoa.getText()));
        usdaoa.setOnAction(event -> selectMoedas.setText(usdaoa.getText()));
        usdeur.setOnAction(event -> selectMoedas.setText(usdeur.getText()));
        arsbrl.setOnAction(event -> selectMoedas.setText(arsbrl.getText()));
        brluyu.setOnAction(event -> selectMoedas.setText(brluyu.getText()));
        brlusd.setOnAction(event -> selectMoedas.setText(brlusd.getText()));
        dogebrl.setOnAction(event -> selectMoedas.setText(dogebrl.getText()));
        eurbrl.setOnAction(event -> selectMoedas.setText(eurbrl.getText()));

    }

    public void converterMoeda(ActionEvent actionEvent){
        try {
            System.out.println("selectMoedas.getText(): " + selectMoedas.getText());
            String[] escolhaConversao = selectMoedas.getText().split("-");
            System.out.println("Moeda origem: " + escolhaConversao[0]);
            System.out.println("Moeda destino: " + escolhaConversao[1]);
            double value = Double.valueOf(getValue.getText()).doubleValue();
            System.out.println("Valor convertido: " + value);
            Moeda moeda = new Moeda(escolhaConversao[0],value,escolhaConversao[1]);
            System.out.println(moeda.toString());
            ConfigCotacao configCotacao = new ConfigCotacao(moeda);
            Double resultado = configCotacao.getConvertValue();
            System.out.println("Resultado da conversão: " + resultado);
            setText.setText("O resultado da conversão de " + configCotacao.getName() + " é igual a R$ " + String.format("%.2f",resultado));
            getValue.clear();
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public void onClickBack(ActionEvent actionEvent) {
        HelloApplication.changeScreen("menu");
    }
}
