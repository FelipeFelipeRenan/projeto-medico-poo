package Exceptions;

public class ClenteNaoExiste extends Exception{

    @Override
    public String getMessage(){
        return "Conta não existente";
    }

}
