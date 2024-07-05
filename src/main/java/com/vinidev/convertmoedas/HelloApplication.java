package com.vinidev.convertmoedas;

import com.vinidev.convertmoedas.api.ConfigCotacao;
import com.vinidev.convertmoedas.api.ConsumindoApi;
import com.vinidev.convertmoedas.moedas.Moeda;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.util.Duration;
import org.json.JSONObject;

import java.io.IOException;

public class HelloApplication extends Application {

    private static Stage stage;
    private static Scene mainScene;
    private static Scene moedasScene;
    private static Scene backScene;
    private static Scene quitScene;
    private static Scene erroScene;

    @Override
    public void start(Stage primaryStage) throws IOException {
        stage = primaryStage;
        stage.setTitle("Conversor");

        FXMLLoader fxmlMain = new FXMLLoader(HelloApplication.class.getResource("menu.fxml"));
        mainScene = new Scene(fxmlMain.load(), 290, 110);

        FXMLLoader fxmlMoedas = new FXMLLoader(HelloApplication.class.getResource("conversormoedas.fxml"));
        moedasScene = new Scene(fxmlMoedas.load(), 500, 300);

        FXMLLoader fxmlBack = new FXMLLoader(HelloApplication.class.getResource("back.fxml"));
        backScene = new Scene(fxmlBack.load(), 260, 110);

        FXMLLoader fxmlQuit = new FXMLLoader(HelloApplication.class.getResource("quitPrograma.fxml"));
        quitScene = new Scene(fxmlQuit.load(), 260 , 150);

        FXMLLoader fxmlError = new FXMLLoader(HelloApplication.class.getResource("error.fxml"));
        erroScene = new Scene(fxmlError.load(), 260 , 150);


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
            case "back":
                stage.setScene(backScene);
                break;
            case "quit":
                stage.setScene(quitScene);
                break;
            case "error":
                stage.setScene(erroScene);
                break;
        }
    }

    public static void main(String[] args) throws Exception {
        launch();
    }
}