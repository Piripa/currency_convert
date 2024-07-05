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

    @Override
    public void start(Stage primaryStage) throws IOException {
        stage = primaryStage;
        stage.setTitle("Conversor");

        FXMLLoader fxmlMain = new FXMLLoader(HelloApplication.class.getResource("menu.fxml"));
        mainScene = new Scene(fxmlMain.load(), 280, 60);

        FXMLLoader fxmlMoedas = new FXMLLoader(HelloApplication.class.getResource("conversormoedas.fxml"));
        moedasScene = new Scene(fxmlMoedas.load(), 500, 300);

        FXMLLoader fxmlBack = new FXMLLoader(HelloApplication.class.getResource("back.fxml"));
        backScene = new Scene(fxmlBack.load(), 500, 300);

        FXMLLoader fxmlQuit = new FXMLLoader(HelloApplication.class.getResource("quitPrograma.fxml"));
        quitScene = new Scene(fxmlQuit.load(), 500, 300);


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
                Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(10), actionEvent -> stage.close()));
                timeline.setCycleCount(2);
                timeline.play();
                System.exit(0);
                break;


        }
    }

    public static void main(String[] args) throws Exception {
        launch();
    }
}