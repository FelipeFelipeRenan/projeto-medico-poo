package Modelos;

public abstract class Cliente {
    String nome;
    String cpf;
    String id;


    public Cliente(String nome, String cpf, String id) {
        this.nome = nome;
        this.cpf = cpf;
        this.id = id;
    }
}
