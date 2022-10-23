package com.example.seminariojavafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextField;

import java.io.IOException;

public class VentanaPrincipalController {

    @FXML
    public TextField txtNombre;
    @FXML
    public TextField txtApellido;

    @FXML
    public void mandarinformacion(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = Aplicacion.setRoot("segunda-ventana");
            SegundaVentanaController segundaVentanaController = fxmlLoader.getController();
            segundaVentanaController.setNombre(txtNombre.getText().toString());
            segundaVentanaController.setApellido(txtApellido.getText().toString());
        } catch (IOException e) {
            throw new RuntimeException(e);

        }
    }
}