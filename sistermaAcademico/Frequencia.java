package sistermaAcademico;


public class Frequencia {
	
	private float porcentagem;
	private Matricula matricula;

	private Professor professor;

	public Frequencia(float porcentagem) {
		super();
		this.porcentagem = porcentagem;
	}

	public float getPorcentagem() {
		return porcentagem;
	}

	public void setPorcentagem(float porcentagem) {
		this.porcentagem = porcentagem;
	}

	public Matricula getMatricula() {
		return matricula;
	}

	public void setMatricula(Matricula matricula) {
		this.matricula = matricula;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	@Override
	public String toString() {
		return "Frequencia [porcentagem=" + porcentagem + ", matricula=" + matricula + ", professor=" + professor + "]";
	}
	
	
	
}
