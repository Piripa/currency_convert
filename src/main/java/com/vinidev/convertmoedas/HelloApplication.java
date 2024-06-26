package com.vinidev.convertmoedas;

import com.vinidev.convertmoedas.api.ConfigCotacao;
import com.vinidev.convertmoedas.api.ConsumindoApi;
import com.vinidev.convertmoedas.moedas.Moeda;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.json.JSONObject;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) throws Exception {
        launch();
        Moeda moeda = new Moeda("USD",10,"BRL");
        ConfigCotacao configCotacao = new ConfigCotacao(moeda);
        Double resultado = configCotacao.getConvertValue();
        System.out.println("O resultado da conversão de " + configCotacao.getName() + " é igual a R$ " + String.format("%.2f",resultado));
    }
}