package view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

import Modelos.*;

public class Principal{

    @FXML
    private Button cadastrar;

    @FXML
    private Button login;

    @FXML
    void toCadastrar(ActionEvent event) throws IOException {
        Main m = new Main();
        m.changeScene("cadastro.fxml");

    }

    @FXML
    void toLogin(ActionEvent event) throws IOException{
        Main m = new Main();
        m.changeScene("hello-view.fxml");

    }

}
