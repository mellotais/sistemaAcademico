package sistermaAcademico;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private String nome;
    private List<Professor> professores = new ArrayList<>();
    private List<DisciplinaOfertada> disciplinasOfertadas = new ArrayList<>();

    public Disciplina(String nome) {
        this.nome = nome;
    }

    public Disciplina(String nome, List<Professor> professores, List<DisciplinaOfertada> disciplinasOfertadas) {
        this.nome = nome;
        this.professores = professores;
        this.disciplinasOfertadas = disciplinasOfertadas;
    }
    

    public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Professor> getProfessores() {
		return professores;
	}

	public void setProfessores(List<Professor> professores) {
		this.professores = professores;
	}
	
	public List<DisciplinaOfertada> getDisciplinasOfertadas() {
        return disciplinasOfertadas;
    }

    public void setDisciplinasOfertadas(List<DisciplinaOfertada> disciplinasOfertadas) {
        this.disciplinasOfertadas = disciplinasOfertadas;
    }



    
    
	public void adicionarProfessor(Professor professor) {
        professores.add(professor);
    }

	public void registrarOferta(DisciplinaOfertada disciplinaOfertada) {
        disciplinasOfertadas.add(disciplinaOfertada);
    }

	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Disciplina [nome=");
		builder.append(nome);
		builder.append(", professores=");
		builder.append(professores);
		builder.append(", disciplinasOfertadas=");
		builder.append(disciplinasOfertadas);
		builder.append("]");
		return builder.toString();
	}


	
	
	
}
