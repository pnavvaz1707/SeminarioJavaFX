package com.example.seminariojavafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.io.IOException;

public class SegundaVentanaController {
    @FXML
    private Label nombreCompleto;

    String nombre;
    String apellido;

    @FXML
    protected void mostrarDatos() {
        nombreCompleto.setText(getNombre() + " " + getApellido());
    }

    public void volver(ActionEvent event) {
        try {
            Aplicacion.setRoot("ventana-principal");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}