package com.example.validacionlogin;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controlador {
    @FXML
    private Label registroText;

    @FXML
    void onConfirmarButtonClick() {
        registroText.setText("Gracias por registrarse.");
    }
}