package sistermaAcademico;

import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa {
    private List<Matricula> matriculas = new ArrayList<>();
    private List<Frequencia> frequencias = new ArrayList<>();

    
    
    public Aluno(String nome) {
        super( nome);
    }
    

    public List<Matricula> getMatriculas() {
		return matriculas;
	}

	public void setMatriculas(List<Matricula> matriculas) {
		this.matriculas = matriculas;
	}

	public List<Frequencia> getFrequencias() {
		return frequencias;
	}

	public void setFrequencias(List<Frequencia> frequencias) {
		this.frequencias = frequencias;
	}



	public void matricularDisciplina(Disciplina disciplina) {
        Matricula matricula = new Matricula(this, disciplina);
        matriculas.add(matricula);
    }


	public void matricularCurso(Curso curso, long nMatricula) {
        Matricula matricula = new Matricula(this, curso, nMatricula);
        matriculas.add(matricula);
    }

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Aluno =");
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}






	


	
	
	
	
	
}
