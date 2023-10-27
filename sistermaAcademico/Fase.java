package sistermaAcademico;

import java.util.ArrayList;
import java.util.List;

public class Fase {
  
    private String nome;
    private List<Disciplina> disciplinas = new ArrayList<>();

    
    public Fase(String nome) {
        this.nome = nome;
    }
    
    
    
    public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}


	
	public void adicionarDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }


	@Override
	public String toString() {
		return "Fase [nome=" + nome + ", disciplinas=" + disciplinas + "]";
	}

	
}
