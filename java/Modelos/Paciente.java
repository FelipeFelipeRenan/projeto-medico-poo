package Modelos;

import Exceptions.ClienteJaExiste;

import Modelos.Hospital.*;

import java.util.ArrayList;

public class Paciente extends Cliente {
	private Hospital h;
	private String nome;
	private String cpf;
	private String id;
	
	public Paciente(String nome, String cpf, String id){
		super(nome,cpf,id);
	}
	public ArrayList verMedicoDisponivel(Medico list[], String id_medico){
		ArrayList<Medico> disponiveis = new ArrayList<>();
		for(Medico i: list) {
			if(i.getDisponibilidade()) {
				disponiveis.add(i);
			}
		}
		return disponiveis;
	}
	public String marcaConsulta(Medico list[], String id_medico){
		for(Medico i: list) {
			if(i.getId_medico().equals(id_medico)) {
				if(i.getDisponibilidade()) {
					i.setDisponibilidade(false);
					return i.getNome() + " j� ira lhe atender";
				}else {
					return i.getNome() + " n�o esta disponivel.";
				}
			}
		}
			return "Medico n�o encontrado no banco de dados.";
	}
	
	public String classificar(Medico list[], String id_medico, int satisfacao){
		for(Medico i: list) {
			if(i.getId_medico().equals(id_medico)) {
				int avaliacao = satisfacao;
				avaliacao = (avaliacao + i.getSatisfacao())/2;
				satisfacao = avaliacao;
				i.setSatisfacao(satisfacao);
				return i.getNome() + " recebeu uma avalia��o de " + i.getSatisfacao();
			}
		}
			return "Medico n�o encontrado no banco de dados.";
	}
	public String verificarsatisfacao(Medico list[], String id_medico){
		for(Medico i: list) {
			if(i.getId_medico().equals(id_medico)) {
				int satisfacao = i.getSatisfacao();
				return i.getNome() + " recebeu uma avalia��o de " + satisfacao;
			}
		}
			return "Medico n�o encontrado no banco de dados.";
	}
	public void cadastrarPaciente(Paciente p) throws ClienteJaExiste{
		try{
			h.cadastrarPac(p);
		}catch(Exception e){
			System.out.println("");
		}

	}
	//////////////////////////////////////
	public String getNome() {

		return nome;
	}
	public void setNome(String nome) {

		this.nome = nome;
	}
	public String getCpf() {

		return cpf;
	}
	public void setCpf(String cpf) {

		this.cpf = cpf;
	}
	public String getId() {

		return id;
	}
	public void setId(String id) {

		this.id = id;
	}
}