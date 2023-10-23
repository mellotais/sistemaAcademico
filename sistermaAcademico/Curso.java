package sistermaAcademico;

import java.util.ArrayList;

public class Curso {
	
	private String nome; 
	private ArrayList<Fase> fase;
	private ArrayList<Disciplina> disciplinas;
	
	public Curso(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<Fase> getFase() {
		return fase;
	}

	public void setFase(ArrayList<Fase> fase) {
		this.fase = fase;
	}

	public ArrayList<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	@Override
	public String toString() {
		return "Curso [nome=" + nome + ", fase=" + fase + ", disciplinas=" + disciplinas + "]";
	}
	
	
	
}
