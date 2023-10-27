package sistermaAcademico;


public class DisciplinaOfertada extends Disciplina {
    private String data;
    private boolean ativa;
    private boolean concluida;

    public DisciplinaOfertada(String nome, String data, boolean ativa, boolean concluida) {
        super(nome); 
        this.data = data;
        this.ativa = ativa;
        this.concluida = concluida;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("DisciplinaOfertada [ disciplina=");
        builder.append(getNome()); 
        builder.append(", data=");
        builder.append(data);
        builder.append(", ativa=");
        builder.append(ativa);
        builder.append(", concluida=");
        builder.append(concluida);
        builder.append("]");
        return builder.toString();
    }
}
