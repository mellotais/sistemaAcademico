package sistermaAcademico;

import java.util.ArrayList;

public class Teste {
    public static void main(String[] args) {
        // Criando um professor
        Professor professor1 = new Professor("João");
        Professor professor2 = new Professor("Pedro");
        Professor professor3 = new Professor("Simão");
        Professor professor4 = new Professor("Marcos");

        // Criando um aluno
        Aluno aluno1 = new Aluno("Alice");
        Aluno aluno2 = new Aluno("Ana");
        Aluno aluno3 = new Aluno("Jonas");
        Aluno aluno4 = new Aluno("Francisco");

        // Criando um curso e cordenador
        Curso curso1 = new Curso("Ciência da Computação", professor1);
        Curso curso2 = new Curso("Fisica", professor2);
        Curso curso3 = new Curso("Matematica", professor3);
      

        // Criando uma fase
        Fase fase1 = new Fase("1º");
        Fase fase2 = new Fase("2º");
        Fase fase3 = new Fase("3º");
        Fase fase4 = new Fase("4º");

        // Criando disciplinas
        Disciplina disciplina1 = new Disciplina("POO");
        Disciplina disciplina2 = new Disciplina("Banco de Dados");
        Disciplina disciplina3 = new Disciplina("Estrutura de Dados");
        Disciplina disciplina4 = new Disciplina("Matematica Discreta");
        Disciplina disciplina5 = new Disciplina("Fisica");


        //Adicionar fase nos cursos
        curso1.adicionarFase(fase1);
        curso1.adicionarFase(fase2);
        curso1.adicionarFase(fase3);
        curso1.adicionarFase(fase4);
        
        
        //Adicionar disciplina nos cursos
        curso1.adicionarDisciplina(disciplina1);
        curso1.adicionarDisciplina(disciplina2);
        curso1.adicionarDisciplina(disciplina3);
        curso1.adicionarDisciplina(disciplina4);
        curso1.adicionarDisciplina(disciplina5);
        
        
        // Adicionando professores às disciplinas
        disciplina1.adicionarProfessor(professor1);
        disciplina2.adicionarProfessor(professor4);
        disciplina3.adicionarProfessor(professor3);
        disciplina4.adicionarProfessor(professor3);
        disciplina5.adicionarProfessor(professor2);


        // Matriculando o aluno em cursos mostrando n matricula
        aluno1.matricularCurso(curso1, 123); 
        aluno2.matricularCurso(curso2, 456); 
   

        
        // Matriculando o aluno em disciplinas
        aluno1.matricularDisciplina(disciplina1); //POO
        aluno1.matricularDisciplina(disciplina2); // BD
        aluno1.matricularDisciplina(disciplina4); //Matematica Discreta
        
        aluno2.matricularDisciplina(disciplina2); //BD
        aluno2.matricularDisciplina(disciplina2); //BD
        
        aluno3.matricularDisciplina(disciplina1); //POO
        
        aluno4.matricularDisciplina(disciplina4); // matematica discreta

        
        // Adicionando disciplinas à fase
        fase1.adicionarDisciplina(disciplina5);//Fisica
  
        fase2.adicionarDisciplina(disciplina1);//POO
        fase2.adicionarDisciplina(disciplina2);//BD
        
        
        fase3.adicionarDisciplina(disciplina4);//Matematica Discreta
     
        
        fase4.adicionarDisciplina(disciplina3); //Estrutura de Dados
 

        // Criando disciplinas ofertadas
        DisciplinaOfertada oferta1 = new DisciplinaOfertada("POO", "2023-10-20", true, false);
        disciplina1.registrarOferta(oferta1);
        
        DisciplinaOfertada oferta2 = new DisciplinaOfertada("BD", "2023-10-20", true, false);
        disciplina2.registrarOferta(oferta2);
        
        DisciplinaOfertada oferta3 = new DisciplinaOfertada("Estrutura de Dados", "2023-10-20", true, false);
        disciplina3.registrarOferta(oferta3);
        
        DisciplinaOfertada oferta4 = new DisciplinaOfertada("Matematica Discreta", "2023-10-20", true, false);
        disciplina4.registrarOferta(oferta4);
        
        DisciplinaOfertada oferta5 = new DisciplinaOfertada("Fisica", "2023-10-20", true, false);
        disciplina4.registrarOferta(oferta5);
        
   
        
        // Registrando uma frequência
        Frequencia frequencia = new Frequencia("2023-10-26", true, aluno1, disciplina1, professor1);
        
        // Registrando uma avaliação
        Avaliacao avaliacao = new Avaliacao("2023-10-26", 9.5, professor1, disciplina1, aluno1); // Nota 9.5

        
        
        
        // Exibindo informações do aluno
        System.out.println("Aluno: " + aluno1.getNome());
        System.out.println("Número de matrícula do aluno: " + aluno1.getMatriculas().get(0).getNMatricula());
        
        
        System.out.println();
        
        
        // Exibindo informações do curso
        System.out.println("Curso do aluno: " + aluno1.getMatriculas().get(0).getCurso().getNome());

        
        System.out.println();
        
        // Exibindo as fases do curso
        System.out.println("Fases do curso:");
        for (Fase fase : curso1.getFases()) {
            System.out.println(fase.getNome());
        }
        
        System.out.println();
        
        // Exibindo as disciplinas em que o aluno está matriculado
        System.out.println("Disciplinas matriculadas pelo aluno:");
        for (Matricula matricula : aluno1.getMatriculas()) {
            if (matricula.getDisciplina() != null) {
                System.out.println("Nome da disciplina: " + matricula.getDisciplina().getNome());
            }
        }

        System.out.println();
       

        // Exibindo os professores das disciplinas do curso1
        System.out.println("Professores das disciplinas no curso1:");
        for (Disciplina disciplina : curso1.getDisciplinas()) {
            System.out.println("Disciplina: " + disciplina.getNome());
            System.out.print("Professores:");
            for (Professor professor : disciplina.getProfessores()) {
                System.out.println(professor.getNome());
            }
        }

        System.out.println();

        System.out.println("Frequência registrada:");
        System.out.println(frequencia);

        
        System.out.println();
        
        System.out.println("Avaliação registrada:");
        System.out.println(avaliacao);


    } 
}