package sistermaAcademico;

public class Professor extends Pessoa{

	public Professor(String nome) {
		super(nome);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Professor [toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
}
