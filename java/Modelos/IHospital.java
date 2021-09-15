package Modelos;

import Exceptions.ClienteJaExiste;

public interface IHospital {




    void cadastrarPac(Paciente p);
    void cadastrarMed(Medico m) throws ClienteJaExiste;


}
