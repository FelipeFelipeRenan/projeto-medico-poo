package view;

import Modelos.Medico;
import Modelos.Paciente;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

import java.io.IOException;

import Exceptions.*;

import static Modelos.Hospital.medicos;
import static Modelos.Hospital.pacientes;
import static Modelos.Hospital.existeMed;
import static Modelos.Hospital.existePac;

public class Cadastro {

    @FXML
    private TextField nome;

    @FXML
    private TextField cpf;

    @FXML
    private TextField idnumero;

    @FXML
    private RadioButton medicoradio;

    @FXML
    private RadioButton pacienteradio;

    @FXML
    private Button cadastrarbutton;

    @FXML
    private Label error;

    @FXML
    void cadastrarCliente(ActionEvent event) throws IOException, ClienteJaExiste{

        if(medicoradio.isSelected() && pacienteradio.isSelected()){
            error.setText("Marque apenas uma alternativa");
        }
        else if(medicoradio.isSelected() && !pacienteradio.isSelected()){
            error.setText("");
            System.out.println("cadastrp medico");
            Medico medic = new Medico(nome.getText(), cpf.getText(), idnumero.getText() );

                if(existeMed(medic)){
                    error.setText("Conta ja existente");
                }
                else{
                    medicos.add(medic);
                    cadastrarbutton.setDisable(true);
                    Main m = new Main();
                    UserHolder holder = UserHolder.getInstance();
                    holder.setUserM(medic);
                    m.changeScene("principal.fxml");
                    System.out.println("deu certo");
                }

            }
        else if(pacienteradio.isSelected() && !medicoradio.isSelected()){
            error.setText("");
            System.out.println("cadastro paciente");
            Paciente pac = new Paciente(nome.getText(), cpf.getText(), idnumero.getText());
                if(existePac(pac)){
                    error.setText("Conta ja existente");
                }
                else{
                    pacientes.add(pac);
                    cadastrarbutton.setDisable(true);
                    Main m = new Main();
                    m.changeScene("principal.fxml");
                    System.out.println("Cadastro de paciente ok");
                }
            }
        else{
            error.setText("Marque uma alternativa");
        }
        }

    }


