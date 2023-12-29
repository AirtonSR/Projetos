package com.mycompany.lojaonline;

import java.util.Scanner;

public class Cliente {
    private String nome;
    private Scanner scanner;
    private int idade;
    private String sexualidade;
    private int cep;
    private boolean ativo;
    private String carrinho = "";
    private float valor = 0;
    
    public Cliente() {
        this.scanner = new Scanner(System.in);
        this.ativo = false;
    }
    
    public void cadastrar(){
        System.out.println("Informe seu nome: ");
        nome = scanner.nextLine();
        System.out.println("Informe sua idade: ");
        idade = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Sexo: ");
        sexualidade = scanner.nextLine();
        System.out.println("Informe o cep: ");
        cep = scanner.nextInt();
        ativo = true;
    }
    
    protected void loja(){
        if(sexualidade.equals("Masculino")){
            System.out.println("1. R$300 Camisa Masculina Lacoste");
            System.out.println("2. R$500 Camisa Masculina Lacoste gola Polo");
            System.out.println("3. R$360 Sapato Lacoste Branco");
            System.out.println("4. R$565 Sapato Lacoste parceria netflix versão vermelha");
            System.out.println("5. Carrinho");
            int opcao = scanner.nextInt();
            if(opcao == 1){
                carrinho += "R$300 Camisa Masculina Lacoste\n";
                valor += 300;
                loja();
            }else if(opcao == 2){
                carrinho += "R$500 Camisa Masculina Lacoste gola Polo\n";
                valor += 500;
                loja();
            }else if(opcao == 3){
                carrinho += "R$360 Sapato Lacoste Branco\n";
                valor += 360;
                loja();
            }else if(opcao == 4){
                carrinho += "R$565 Sapato Lacoste parceria netflix versão vermelha\n";
                valor += 565;
                loja();
            }else if(opcao == 5){
                carrinho();
            }
        }else if(sexualidade.equals("Feminino")){
            System.out.println("1. R$400 Camisa Feminina Lacoste");
            System.out.println("2. R$200 Camisa Feminina Lacoste gola polo");
            System.out.println("3. R$257 Sapato vans Tamanho 35-37");
            System.out.println("4. Carrinho");
            int opcao = scanner.nextInt();
            if(opcao == 1){
                carrinho += "R$400 Camisa Feminina Lacoste";
                valor += 400;
                loja();
            }else if(opcao == 2){
                carrinho += "R$200 Camisa Feminina Lacoste gola polo";
                valor += 200;
                loja();
            }else if(opcao == 3){
                System.out.println("Informe seu numero: ");
                int num = scanner.nextInt();
                if(num == 35){
                    carrinho = "R$257 Sapato vans Tamanho 35";
                    valor += 257;
                    loja();
                }else if(num == 36){
                    carrinho = "R$257 Sapato vans Tamanho 36";
                    valor += 257;
                    loja();
                }else if(num == 37){
                    carrinho += "R$257 Sapato vans Tamanho 37";
                    valor += 257;
                    loja();
                }
            }else if(opcao == 4){
                carrinho();
            }
        }
    }
    
    protected void carrinho(){
        System.out.println("" + this.getCarrinho());
        System.out.println("Valor: " + this.valor);
        System.out.println("Continua comprando ou pagamento");
        System.out.println("c - continua, p - pagemento");
        char opcao = scanner.next().charAt(0);
        
        switch (opcao) {
            case 'c':
                loja();
            case 'p':
                pagamento();
            default:
        }
    }
    
    private void pagamento(){
        System.out.println("---Endereço---");
        this.endereco();
        System.out.println("Valor: " + this.valor);
        System.out.println("1. Cartão");
        System.out.println("2. Boleto");
        System.out.println("3. Pix");
        int opcao = scanner.nextInt();
        
        if(opcao == 1){
            System.out.println("1. Cartão de credito");
            System.out.println("2. Cartão de debito");
            int op = scanner.nextInt();
            if(op == 1){
                System.out.println("Pagamento concluido no cartão de crédito");
            }else if(op == 2){
                System.out.println("Pagamento concluido no cartão de débito");
            }
        }else if(opcao == 2){
            System.out.println("Gerando boletoo........");
            System.out.println("Numeração: 20001 10020 25322 33333 2 100000321234");
        }else if (opcao == 3){
            System.out.println("Pix: (85) 98632-3212");
            
        }
    }
    
    public void endereco(){
        if(cep == 60830700){
            System.out.println("Cidade: Fortaleza");
            System.out.println("Bairro: Messejana");
            System.out.println("Rua: Nenê Arruda");
        }else if(cep == 61883-556){
            System.out.println("Cidade: Itaitinga");
            System.out.println("Bairro: Ponta da Serra\n"
                    + "Rua: Marcionilha Nunes do Nascimento");
        }
    }

    public String getCarrinho() {
        return carrinho;
    }

    public float getValor() {
        return valor;
    }
}
