package sistermaAcademico;

public class Avaliacao {
    
	
	private String data;
    private double nota;
    private Professor professor;
    private Disciplina disciplina;
    private Aluno aluno;

    public Avaliacao(String data, double nota, Professor professor, Disciplina disciplina, Aluno aluno) {
        this.data = data;
        this.nota = nota;
        this.professor = professor;
        this.disciplina = disciplina;
        this.aluno = aluno;
    }

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	 @Override
	    public String toString() {
	        return "Avaliacao [data=" + data + ", nota=" + nota + ", professor=" + professor.getNome()
	                + ", disciplina=" + disciplina.getNome() + ", aluno=" + aluno.getNome() + "]";
	    }
    
    
    
}

