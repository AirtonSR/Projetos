package com.mycompany.projeto_turma;

import java.util.Scanner;

public class Diretor extends Alunos{
    private CadastroProfessores nome;
    private Professores notas;
    private CadastroAluno nomeAluno;
    private Scanner scanner;
    private int menu;
    private CadastrarDiretor diretor;
    private String usuario;
    private String senha;

    public Diretor(CadastroProfessores nome, CadastroAluno entrar, Notas nota, CadastrarDiretor diretor) {
        super(entrar, nota);
        this.scanner = new Scanner(System.in);
        this.nome = nome;
        this.diretor = diretor;
        System.out.println("Acesso concedido");
            System.out.println("Nome do professor: " + this.nome.getNome());
            System.out.println("Turma: "  + this.nome.getTurma());
            this.notas();
    }
   
   public void fazerLogin(){
        do {
        System.out.println("Informe o usuário: ");
        usuario = scanner.nextLine();
        System.out.println("Informe a senha: ");
        senha = scanner.nextLine();

        if (usuario.equals("Airton") && senha.equals("1234")) {
            System.out.println("Acesso concedido");
            System.out.println("Nome do professor: " + this.nome.getNome());
            System.out.println("Turma: "  + this.nome.getTurma());
            this.notas();
            break;
        } else if (usuario.equals("Airton") && !senha.equals("1234")) {
            System.out.println("Senha incorreta");
        } else if (!usuario.equals("Airton") && senha.equals("1234")) {
            System.out.println("Usuário incorreto");
        } else {
            System.out.println("Usuário e senha incorretos");
        }

        } while (true);

   }
}
