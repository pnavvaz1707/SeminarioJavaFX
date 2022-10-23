package com.example.seminariojavafx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    String user;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText(getUser());
        System.out.println("Hola");
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}