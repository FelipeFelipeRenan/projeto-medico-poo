package view;

import Modelos.Medico;
import Modelos.Paciente;

public final class UserHolder{

    private Medico userM;
    private Paciente userP;
    private final static UserHolder INSTANCE = new UserHolder();

    private UserHolder(){}

    public static UserHolder getInstance() {
        return INSTANCE;
    }

    public void setUserM(Medico m) {
        this.userM = m;
    }
    public void setUserP(Paciente p){
        this.userP = p;

    }

    public Medico getUserM() {
        return this.userM;
    }
    public Paciente getUserP() {
        return this.userP;
    }
}