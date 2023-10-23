package sistermaAcademico;

import java.util.ArrayList;

public class Fase {
	
	private String nome; 
	
	private ArrayList <DisciplinaOfertada>disciplinas;
	
	public Fase(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


	public ArrayList<DisciplinaOfertada> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(ArrayList<DisciplinaOfertada> disciplinas) {
		this.disciplinas = disciplinas;
	}

	@Override
	public String toString() {
		return "Fase [nome=" + nome + ", curso=" + curso + ", disciplinas=" + disciplinas + "]";
	}

	
}
