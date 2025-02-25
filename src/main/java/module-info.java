module com.vinidev.convertmoedas {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;
    requires org.json;
    requires java.desktop;

    opens com.vinidev.convertmoedas to javafx.fxml;
    exports com.vinidev.convertmoedas;
    exports com.vinidev.convertmoedas.controller;
    opens com.vinidev.convertmoedas.controller to javafx.fxml;
}