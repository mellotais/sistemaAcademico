package sistermaAcademico;


public class Teste {

	public static void main(String[] args) {


		Aluno aluno1 = new Aluno("Tais");
		Aluno aluno2 = new Aluno("Joao");
		Aluno aluno3 = new Aluno("Ric");
		
		Curso curso1 = new Curso("BCC");
		Curso curso2 = new Curso("Mat");
		Curso curso3 = new Curso("Fis");
		
		Fase fase1 = new Fase("1fase");
		Fase fase2 = new Fase("2fase");
		Fase fase3 = new Fase("3fase");
		
		Matricula matricula1 = new Matricula(0002222);
		Matricula matricula2 = new Matricula(0002222);
		Matricula matricula3 = new Matricula(0002222);
		
	//	DisciplinaOfertada disciplina1 = new DisciplinaOfertada("Ingles");
		
		
		System.out.println("Nome Aluno "+ aluno1.getNome());
		System.out.println("Nome Curso "+ curso1.getNome());
		System.out.println("Nome Fase "+ fase1.getNome());
		System.out.println("Matricula "+ matricula1.getMatricula());
		
		System.out.println();
		
		System.out.println("Nome Aluno "+ aluno2.getNome());
		System.out.println("Nome Curso "+ curso2.getNome());
		System.out.println("Nome Fase "+ fase2.getNome());
		System.out.println("Matricula "+ matricula2.getMatricula());
		
		System.out.println();
		
		System.out.println("Nome Aluno "+ aluno3.getNome());
		System.out.println("Nome Curso "+ curso3.getNome());
		System.out.println("Nome Fase "+ fase3.getNome());
		System.out.println("Matricula "+ matricula3.getMatricula());
	}

}
