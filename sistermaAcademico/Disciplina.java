package sistermaAcademico;

import java.util.ArrayList;

public class Disciplina {

	public String nome;
	public ArrayList<Professor> professores;
	
	public Disciplina(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<Professor> getProfessores() {
		return professores;
	}

	public void setProfessores(ArrayList<Professor> professores) {
		this.professores = professores;
	}

	@Override
	public String toString() {
		return "Disciplina [nome=" + nome + ", professores=" + professores + "]";
	}
	
	
	
}
