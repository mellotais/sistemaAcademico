package sistermaAcademico;

public class Avaliacao {

	private float nota;
	private Matricula matricula;
	private Professor professores;
	private Aluno alunos;
	
	
	
	public Avaliacao(float nota, Matricula matricula, Professor professores, Aluno alunos) {
		super();
		this.nota = nota;
		this.matricula = matricula;
		this.professores = professores;
		this.alunos = alunos;
	}
	public float getNota() {
		return nota;
	}
	public void setNota(float nota) {
		this.nota = nota;
	}
	public Matricula getMatricula() {
		return matricula;
	}
	public void setMatricula(Matricula matricula) {
		this.matricula = matricula;
	}
	public Professor getProfessores() {
		return professores;
	}
	public void setProfessores(Professor professores) {
		this.professores = professores;
	}
	public Aluno getAlunos() {
		return alunos;
	}
	public void setAlunos(Aluno alunos) {
		this.alunos = alunos;
	}
	@Override
	public String toString() {
		return "Avaliacao [nota=" + nota + ", matricula=" + matricula + ", professores=" + professores + ", alunos="
				+ alunos + "]";
	}
	
	
}
