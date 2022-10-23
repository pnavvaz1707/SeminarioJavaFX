package com.example.seminariojavafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextField;

import java.io.IOException;

public class EjemploController {

    @FXML
    public TextField txtFieldUser;
    @FXML
    public TextField txtFieldPassword;

    @FXML
    protected void iniciarSesion(ActionEvent actionEvent) {
        if (txtFieldUser.getText().equals("Paco") && txtFieldPassword.getText().equals("1234")){
            System.out.println("Has iniciado sesión");
            try {
                FXMLLoader fxmlLoader = HelloApplication.setRoot("hello-view");
                HelloController helloController = fxmlLoader.getController();
                helloController.setUser(txtFieldUser.getText().toString());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }else {
            System.out.println("Datos incorrectos");
        }
    }
}
