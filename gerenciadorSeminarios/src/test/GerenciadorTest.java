package test;

import domain.Aluno;
import domain.Local;
import domain.Professor;
import domain.Seminario;

public class GerenciadorTest {
    public static void main(String[] args) {
        Local local = new Local("Rua das laranjeiras");
        Aluno aluno = new Aluno("Lucas", 27);
        Professor professor = new Professor("Marcos", "Filosofia");
        Aluno[] alunosParaSeminario = {aluno};
        Seminario seminario = new Seminario("O que é filosofia?", alunosParaSeminario, local);
        Seminario[] seminariosDisponiveis = {seminario};
        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();
    }
}
