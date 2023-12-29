package com.mycompany.projeto_turma;

public class Projeto_Turma {

    public static void main(String[] args) {
        
        CadastroProfessores c2 = new CadastroProfessores();
        
        CadastroAluno c3 = new CadastroAluno("Gustavo", 20, "Masculino", "Benicio", "Gustavo", "1234");
        
        Professores p1 = new Professores(c2, c3);
        
        p1.fazerLogin();
        
        Alunos a1 = new Alunos(c3, p1);
        
        a1.fazerLogin("Gustavo", "1234");
        
        CadastrarDiretor cd = new CadastrarDiretor();
        
        Diretor d1 = new Diretor(c2, c3, p1, cd);
        
        d1.fazerLogin();
        
    }
}
