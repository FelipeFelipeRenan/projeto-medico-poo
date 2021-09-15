package Modelos;

import Modelos.Cliente;

public class Medico extends Cliente {
	private String ocupacao;
	private int idade;
	private Boolean disponibilidade = true;
	private int satisfacao;


	public Medico(String nome, String cpf, String id) {
		super(nome,cpf,id);
	}

	public String getNome() {

		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getId_medico() {

		return id;
	}

	public void setId_medico(String id_medico) {
		this.id= id_medico;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	public void setDisponibilidade(Boolean disponibilidade){
		this.disponibilidade = disponibilidade;
	}
	public Boolean getDisponibilidade(){
		return disponibilidade;
	}
	public void setSatisfacao(int satisfacao){
		this.satisfacao = satisfacao;
	}
	public int getSatisfacao(){
		return satisfacao;
	}
	public String getOcupacao(){
		return ocupacao;
	}

	public void setOcupacao(String ocupacao) {
		this.ocupacao = ocupacao;
	}
}
