package sistermaAcademico;

import java.util.ArrayList;

public class DisciplinaOfertada extends Disciplina {

	private Date data;
	private ArrayList<Disciplina> disciplinas;



	public DisciplinaOfertada(String nome) {
		super(nome);
		
	}

	public DisciplinaOfertada(String nome, ArrayList<Disciplina> disciplinas) {
		super(nome);
		this.disciplinas = disciplinas;
	}

	public ArrayList<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	public void addDisciplinas(Disciplina disciplina) {
		this.disciplinas.add(disciplina);
	}

	@Override
	public String toString() {
		return "DisciplinaOfertada [disciplinas=" + disciplinas + "]";
	}
	
	

}
