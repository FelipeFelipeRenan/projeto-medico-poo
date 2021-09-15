package Exceptions;

public class ClienteJaExiste extends Exception{

    public ClienteJaExiste(){
        super();
    }
    @Override
    public String getMessage(){
        return "Conta já existente" ;
    }
}
