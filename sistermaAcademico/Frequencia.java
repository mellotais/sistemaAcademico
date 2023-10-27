package sistermaAcademico;


public class Frequencia {
    
	
	private String data;
    private boolean presenca;
    private Aluno aluno;
    private Disciplina disciplina;
    private Professor professor;

    public Frequencia(String data, boolean presenca, Aluno aluno, Disciplina disciplina, Professor professor) {
        this.data = data;
        this.presenca = presenca;
        this.aluno = aluno;
        this.disciplina = disciplina;
        this.professor = professor;
    }

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public boolean isPresenca() {
		return presenca;
	}

	public void setPresenca(boolean presenca) {
		this.presenca = presenca;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	@Override
    public String toString() {
        return "Frequencia [data=" + data + ", presenca=" + presenca + ", aluno=" + aluno.getNome()
                + ", disciplina=" + disciplina.getNome() + ", professor=" + professor.getNome() + "]";
    }
    
    
    
}
