package com.mycompany.sistemabancario;

public class Cliente {
    protected String nome;
    protected int numeroConta;
    protected float saldo;
    protected String senha;
    
    public void cadastrar(String Nome, int Numero){
        this.nome = Nome;
        this.numeroConta = Numero;
    }
    
    public void depositar(float valor){
        if(valor > 0){
            saldo += valor;
        }else{
            System.out.println("Deposite o valor inteiro");
        }
    }
    
    public void sacar(float valor){
        if(valor < saldo && valor > 0){
            this.saldo -= valor;
        }else{
            System.out.println("Deposite!!");
            System.out.println("Valor Atual: " + this.saldo);
        }
    }
    
    public void saldo(){
        System.out.println("Saldo: " + this.saldo);
    }
}
