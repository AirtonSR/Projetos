package com.mycompany.projeto_turma;

import java.util.Scanner;

public class Professores extends Notas{
    private CadastroProfessores entrar;
    private Scanner scanner;
    private CadastroAluno aluno;
    int menu;
    private String usuario;
    private String senha;
    

    public Professores(CadastroProfessores entrar, CadastroAluno aluno) {
        this.entrar = entrar;
        this.aluno = aluno;
        this.scanner = new Scanner(System.in);
    }

    public void fazerLogin() {
        do{
        System.out.println("Informe o usuário: ");
        usuario = scanner.nextLine();
        System.out.println("Informe a senha: ");
        senha = scanner.nextLine();
        if (usuario.equals("Airton") && senha.equals("1234")) {
            System.out.println("Acesso concedido");
             do{
                System.out.println("Insira da nota do aluno: " + this.aluno.getNome());
                System.out.println("1. Inserir notas do primeiro bimestre");
                System.out.println("2. Inserir notas do segundo bimestre");
                System.out.println("3. Inserir notas do terceiro bimestre");
                System.out.println("4. Inserir notas do querto bimestre");
                System.out.println("5. Olha se aluno esta aprovado");
                System.out.println("6. Para continuar");
                System.out.println("\n");
                menu = scanner.nextInt();  
                if(menu == 1){
                    this.notaBimestre1();
                }else if(menu == 2){
                    this.notaBimestre2();
                }else if(menu == 3){
                    this.notaBimestre3();
                }else if(menu == 4){
                    this.notaBimestre4();
                }else if(menu == 5){
                    this.getNotaRe();
                    System.out.println("\n");
                }
            }while(menu != 6);
             break;
        }else if(usuario.equals("Airton") && !senha.equals("1234")){
            System.out.println("Senha incorreta");
        }else if(senha.equals("1234") && !usuario.equals("Airton")){
            System.out.println("Usuario Incorreto");
        }else if(!usuario.equals("Airton") && !senha.equals("1234")){
            System.out.println("Usuario e senha incorreto");
        }
        
        }while(true);

    }
}
    


