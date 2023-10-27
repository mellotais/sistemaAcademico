package sistermaAcademico;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nome;
    private List<Fase> fases = new ArrayList<>();
    private Professor coordenador;
    private List<Disciplina> disciplinas = new ArrayList<>();

    public Curso(String nome) {
        this.nome = nome;
    }

    public Curso(String nome, Professor coordenador) {
        this.nome = nome;
        this.coordenador = coordenador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Fase> getFases() {
        return fases;
    }

    public void setFases(List<Fase> fases) {
        this.fases = fases;
    }

    public Professor getCoordenador() {
        return coordenador;
    }

    public void setCoordenador(Professor coordenador) {
        this.coordenador = coordenador;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public void adicionarFase(Fase fase) {
        fases.add(fase);
    }

    public void adicionarDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Curso [nome=");
        builder.append(nome);
        builder.append(", fases=");
        builder.append(fases);
        builder.append(", coordenador=");
        builder.append(coordenador);
        builder.append("]");
        return builder.toString();
    }
}
