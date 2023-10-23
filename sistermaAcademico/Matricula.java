package sistermaAcademico;

import java.util.ArrayList;

public class Matricula {

	private int matricula;
	private Aluno aluno;
	private ArrayList <Disciplina> disciplinas;
	
	public Matricula(int Matricula) {
		
		this.matricula = Matricula;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public ArrayList<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	@Override
	public String toString() {
		return "Matricula [matricula=" + matricula + ", aluno=" + aluno + ", disciplinas=" + disciplinas + "]";
	}
	
	
}
