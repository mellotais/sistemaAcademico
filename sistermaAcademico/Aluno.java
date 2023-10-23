package sistermaAcademico;

import java.util.ArrayList;

public class Aluno extends Pessoa{

	private String nome;
	private ArrayList <Disciplina> disciplinas;
	
	
	public Aluno(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public ArrayList<Disciplina> getDisciplinas() {
		return disciplinas;
	}



	public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}



	public Curso getCurso() {
		return curso;
	}



	public void setCurso(Curso curso) {
		this.curso = curso;
	}



	private  Curso curso;


	@Override
	public String toString() {
		return "Aluno [disciplinas=" + disciplinas + ", curso=" + curso + "]";
	}
	
	
	
	
}
