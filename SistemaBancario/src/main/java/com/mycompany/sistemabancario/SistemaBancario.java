package com.mycompany.sistemabancario;

public class SistemaBancario {

    public static void main(String[] args) {
        
        Cliente c1 = new Cliente();
        c1.cadastrar("Airton", 1234);
        c1.depositar(200);
        c1.saldo();
        c1.sacar(3300);
        c1.saldo();
        
        Gerente g1 = new Gerente(c1);
        g1.detalhes();
        g1.cadastrar("Francisco", 1234);
        g1.depositar(500);
        g1.saldo();
        
        Gerente g2 = new Gerente(g1);
        
        g2.detalhes();
       
        
    }
}
