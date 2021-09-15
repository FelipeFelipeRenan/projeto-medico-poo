package Modelos;

import Exceptions.ClienteJaExiste;

import java.util.ArrayList;

public class Hospital implements IHospital{
    public static ArrayList<Medico> medicos = new ArrayList<>();
    public static ArrayList<Paciente> pacientes = new ArrayList<>();

    @Override
    public void cadastrarPac(Paciente P) {
        pacientes.add(P);
    }

    @Override
    public void cadastrarMed(Medico M) throws ClienteJaExiste {
        medicos.add(M);
    }

    public static void removerMed(Medico m) {
        for(int i = 0; i < medicos.size(); i++)
            if(m.getId_medico().equals(medicos.get(i).getId_medico())){
                medicos.remove(i);
            }
    }

    public static void removerPac(Paciente p){
        for(int i = 0; i < pacientes.size(); i++)
            if(p.getId().equals(pacientes.get(i).getId())){
                pacientes.remove(i);
            }
    }
    public static boolean existeMed(Medico m) {
        for(int i = 0; i < medicos.size(); i++)
            if(m.getId_medico().equals(medicos.get(i).getId_medico())){
                return true;
            }
        return false;
    }

    public static boolean existePac(Paciente p){
        for(int i = 0; i < pacientes.size(); i++)
            if(p.getId().equals(pacientes.get(i).getId())){
                return true;
            }
        return false;
    }

    public static boolean validarMed(String nome, String id) {
        for (int i = 0; i < medicos.size(); i++) {
            if (nome.equals(medicos.get(i).getNome()) && id.equals(medicos.get(i).getId_medico())) {
                return true;
            }
        }
        return false;
    }
    public static boolean validarPac(String nome, String id) {
        for(int i = 0; i < pacientes.size(); i++){
            if(nome.equals(pacientes.get(i).getNome()) && id.equals(pacientes.get(i).getId())){
                return true;
            }
        }
        return false;
    }

    public Paciente getPacientes(int i) {
        return pacientes.get(i);
    }
    public static Medico getMedico(int i){
        return medicos.get(i);
    }

}
