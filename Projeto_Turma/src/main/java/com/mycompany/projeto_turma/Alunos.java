package com.mycompany.projeto_turma;

import java.util.Scanner;

public class Alunos extends Notas{
    private CadastroAluno entrar;
    private Scanner scanner;
    private Notas nota;
    private int menu;

    public Alunos(CadastroAluno entrar, Notas nota) {
        this.entrar = entrar;
        this.scanner = new Scanner(System.in);
        this.nota = nota;
    }
    
    public void fazerLogin(String login, String senha) {
        if (login.equals(this.entrar.getLogin()) && senha.equals(this.entrar.getSenha())) {
            do{
                System.out.println("1. Para ver notas e faltas");
                System.out.println("3. Sair");
                System.out.println("\n");
                
                menu = scanner.nextInt();

                if(menu == 1){
                    System.out.println("Primeiro Bimestre: " + this.nota.getNotaFinal1());
                    System.out.println("Segundo Bimestre: " + this.nota.getNotaFinal2());
                    System.out.println("Terceiro Bimestre: " + this.nota.getNotaFinal3());
                    System.out.println("Quarto Bimestre: " + this.nota.getNotaFinal4());
                    System.out.println("Quantidade de faltas: " + this.nota.getFaltas());
                    this.nota.NotaRe();
                    
                    
                   
                }
            }while(menu != 3);
           
        }else if (login.equals(this.entrar.getLogin()) && !senha.equals(this.entrar.getSenha())) {
            System.out.println("Senha não confere");
        }else if (!login.equals(this.entrar.getLogin()) && senha.equals(this.entrar.getSenha())) {
            System.out.println("Usuário incorreto");
        }else {
            System.out.println("Tem algo errado");
        }
    }
    
    protected void notas(){
        System.out.println("Nome: " + this.entrar.getNome());
        System.out.println("Primeiro Bimestre: " + this.nota.getNotaFinal1());
        System.out.println("Segundo Bimestre: " + this.nota.getNotaFinal2());
        System.out.println("Terceiro Bimestre: " + this.nota.getNotaFinal3());
        System.out.println("Quarto Bimestre: " + this.nota.getNotaFinal4());
        System.out.println("Quantidade de faltas: " + this.nota.getFaltas());
        this.nota.getNotaRe();
        
    }
}
