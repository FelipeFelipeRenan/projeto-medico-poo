package view;

import Modelos.Medico;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.io.IOException;

import static Modelos.Hospital.removerMed;


public class Noambiente {

    UserHolder holder = UserHolder.getInstance();
    Medico m = holder.getUserM();

    @FXML
    private Button sair;

    @FXML
    private Button sairBotao;

    @FXML
    private Label nomeamb;

    @FXML
    private Label idamb;

    @FXML
    private Button excluir;

    @FXML
    private Button showData;

    @FXML
    void excluirMed(ActionEvent event) throws IOException {
        removerMed(m);
        Main m = new Main();
        m.changeScene("principal.fxml");
    }

    @FXML
    void mostrarDados(ActionEvent event){
        nomeamb.setText(m.getNome());
        idamb.setText(m.getId_medico());

    }



    @FXML
    void logout(ActionEvent event) throws IOException{
        Main m = new Main();
        m.changeScene("principal.fxml");

    }
    @FXML
    void sair(ActionEvent event) throws IOException{
        System.exit(0);
    }


}
