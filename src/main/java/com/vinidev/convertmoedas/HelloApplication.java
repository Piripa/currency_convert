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

    private static Stage stage;

    private static Scene mainScene;
    private static Scene moedasScene;

    @Override
    public void start(Stage primaryStage) throws IOException {
        stage = primaryStage;
        stage.setTitle("Conversor");
        FXMLLoader fxmlMain = new FXMLLoader(HelloApplication.class.getResource("menu.fxml"));
        mainScene = new Scene(fxmlMain.load(), 280, 60);

        FXMLLoader fxmlMoedas = new FXMLLoader(HelloApplication.class.getResource("conversormoedas.fxml"));
        moedasScene = new Scene(fxmlMoedas.load(), 300, 600);
        stage.setScene(mainScene);
        stage.show();
    }

    public static void changeScreen(String src){
        switch(src){
            case "menu":
                stage.setScene(mainScene);
                break;
            case "moedas":
                stage.setScene(moedasScene);
                break;
        }
    }

    public static void main(String[] args) throws Exception {
        launch();
    }
}