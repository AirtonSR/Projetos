package com.mycompany.sistemabancario;

public class Gerente extends Cliente{
    private Cliente nome;

    public Gerente(Cliente nome) {
        this.nome = nome;
    }
    
    protected void detalhes(){
        System.out.println("Nome: " + this.nome.nome);
        System.out.println("Numero da conta: " + this.nome.numeroConta);
        System.out.println("Saldo: " + this.nome.saldo);
    }

    @Override
    public void cadastrar(String Nome, int Numero) {
        super.cadastrar(Nome, Numero);
    }
    
    
    
    
}
