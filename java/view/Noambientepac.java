package view;

import Modelos.Medico;
import Modelos.Paciente;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.io.IOException;

public class Noambientepac{

    UserHolder holder = UserHolder.getInstance();
    Paciente p = holder.getUserP();

    @FXML
    private Button saidaButton;

    @FXML
    private Label pacname;

    @FXML
    private Button logoutButton;

    @FXML
    private void setTexts(ActionEvent event){
        pacname.setText(p.getNome());

    }

    @FXML
    private void logout(ActionEvent event) throws IOException {
        Main m = new Main();
        m.changeScene("principal.fxml");
    }

    @FXML
    void sair(ActionEvent event) {
        System.exit(1);

    }

}
