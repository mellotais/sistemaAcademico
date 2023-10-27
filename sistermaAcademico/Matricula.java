package sistermaAcademico;


public class Matricula {
	
    private long nMatricula;
    private Aluno aluno;
    private Disciplina disciplina;
    private Curso curso;

    public Matricula(Aluno aluno, Disciplina disciplina) {
        this.aluno = aluno;
        this.disciplina = disciplina;
    }
    
    public Matricula(Aluno aluno, Curso curso, long nMatricula) {
    	this.aluno = aluno;
    	this.curso = curso;
    	this.nMatricula = nMatricula;
    }

	public long getNMatricula() {
		return nMatricula;
	}

	public void setNMatricula(long nMatricula) {
		this.nMatricula = nMatricula;
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

	
	
	
	public long getnMatricula() {
		return nMatricula;
	}

	public void setnMatricula(long nMatricula) {
		this.nMatricula = nMatricula;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Matricula [idMatricula=");
		builder.append(nMatricula);
		builder.append(", aluno=");
		builder.append(aluno);
		builder.append(", disciplina=");
		builder.append(disciplina);
		builder.append("]");
		return builder.toString();
	}

	
}
