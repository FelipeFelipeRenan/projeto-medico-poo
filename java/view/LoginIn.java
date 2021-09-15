package view;
import Modelos.Hospital;
import Modelos.Medico;
import Modelos.Paciente;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.io.IOException;
import java.util.ArrayList;

import static Modelos.Hospital.*;

public class LoginIn {


    public LoginIn() {
    }

        @FXML
        private TextField username;

        @FXML
        private PasswordField pass;

        @FXML
        private Label error;

        @FXML
        private RadioButton medicradio;

        @FXML
        private RadioButton pacradio;

        @FXML
        private Button login;

    @FXML
    private Button voltar;

    @FXML
    void goBack(ActionEvent event) throws IOException {
        Main m = new Main();
        m.changeScene("principal.fxml");
    }


    @FXML
    void userLogin(ActionEvent event) throws IOException {
            checkLogin();
        }
        void checkLogin() throws IOException{

            Main m = new Main();
            if(medicradio.isSelected() && pacradio.isSelected()){
                error.setText("Selecione somente uma opção");
            }
            else if(username.getText().isEmpty() || pass.getText().isEmpty()){
                error.setText("insira todos os seus dados");
            }
            else if(!medicradio.isSelected() && pacradio.isSelected() ) {
                System.out.println("Paciente Marcado");
                // Funcionou com a negação da validação, nâo mexer!!!
                   if(!validarPac(username.getText(), pass.getText())){
                        System.out.println("deu certo1.5");
                        error.setText("Bem vindo!");
                        m.changeScene("noambientepac.fxml");
                    }
                    else{
                        error.setText("Paciente inexistente");
                        System.out.println("error1");
                    }
            }
            else if(medicradio.isSelected() && !pacradio.isSelected()) {
                System.out.println("deu certo2");
                    if(validarMed(username.getText(), pass.getText())){
                        error.setText("Bem vindo!");
                        System.out.println("Consegui");
                        m.changeScene("noambiente.fxml");
                    }
                    else{
                        error.setText("Médico inexistente");
                        System.out.println("error12");
                    }
            }
            else{
                error.setText("Usuario ou senha incorretos");
            }
        }
}
