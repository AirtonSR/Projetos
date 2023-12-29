package com.mycompany.projeto_turma;

import java.util.Scanner;

public abstract class Notas {
    private float nota1;
    private float nota2;
    private float nota3;
    private float nota4;
    private int faltas;
    private Scanner scanner;
    private float notaRe;
    private boolean continuar = true;

    public Notas() {
        this.scanner = new Scanner(System.in);
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    protected void notaBimestre1() {
        do {
            System.out.println("Insira a nota Bimestral do aluno:");
            nota1 = scanner.nextFloat();

            if (nota1 < 0 || nota1 > 10) {
                System.out.println("Informe uma nota entre 0 e 10.");
            }

        } while (nota1 < 0 || nota1 > 10);

        do {
            System.out.println("Insira a nota parcial do aluno:");
            float parcial1 = scanner.nextFloat();

            if (parcial1 < 0 || parcial1 > 10) {
                System.out.println("Informe uma nota entre 0 e 10.");
            } else {
                this.nota1 = (nota1 + parcial1) / 2;
                break;
            }

            }while(true);
        
        this.registrarFaltas();
    
    }


    protected void notaBimestre2() {
        float nota7;
        do{
            System.out.println("Insira a nota bimestral do aluno:");
            nota7 = scanner.nextFloat();
            if(nota7 > 10 || nota7 < 0){
                System.out.println("Informe a nota entre 0 e 10");
            }
        }while(nota2 > 10 || nota2 < 0);
        
        do{
            System.out.println("Insira a nota parcial do aluno");
            float parcial2 = scanner.nextFloat();
            if(parcial2 > 10 || parcial2 < 0){
                System.out.println("Informe a nota entre 0 e 10");
            }else{
                this.nota2 = (nota7 + parcial2)/2;
                break;
            }
            
        }while(true);
        
        this.registrarFaltas();
    }

    protected void notaBimestre3() {
        
        do{
            System.out.println("Insira a nota do 3º bimestredo aluno ");
            nota3 = scanner.nextFloat();
            if(nota3 > 10 || nota3 < 0){
                System.out.println("Informe a nota entre 0 e 10");
            }
        }while(nota3 > 10 || nota3 < 0);
        
        do{
            System.out.println("Insira a nota parcial do 3º bimestre:");
            float parcial3 = scanner.nextFloat();
            if(parcial3 > 10 || parcial3 < 0){
                System.out.println("Informe a nota entre 0 e 10");
            }else{
                this.nota3 = (nota3 + parcial3) / 2;
                break;
            }
            
        }while(true);
      
        this.registrarFaltas();
        
    }

    protected void notaBimestre4() {
        do{
            System.out.println("Insira a nota bimestral do 4º bimestre:");
            nota4 = scanner.nextFloat();
            if(nota4 > 10 || nota4 < 0){
                System.out.println("Informe uma nota entre 0 e 10");
            }
        }while(nota4 > 10 || nota4 < 0);
        
        do{
            System.out.println("Informe a nota parcial do 4º bimestre");
            float parcial4 = scanner.nextFloat();
            if(parcial4 > 10 || parcial4 < 0){
                System.out.println("Informe uma nota entre 0 e 10");
            }else{
                this.nota4 = (nota4 + parcial4)/2;
                break;
            }
        }while(true);
        
        this.registrarFaltas();
    }

    protected void registrarFaltas() {
        System.out.println("Insira as faltas do aluno neste bimestre:");
        int novasFaltas = scanner.nextInt();
        this.faltas += novasFaltas;
    }

    public float getNotaFinal1() {
        return nota1;
    }

    public float getNotaFinal2() {
        return nota2;
    }

    public float getNotaFinal3() {
        return nota3;
    }

    public float getNotaFinal4() {
        return nota4;
    }

    public int getFaltas() {
        return faltas;
    }

    public float getNotaRe() {
        return notaRe;
    }
    
    public String NotaRe() {
        
        notaRe = (nota1 + nota2 + nota3 + nota4)/4;
        if(notaRe < 6 && notaRe > 0){
            System.out.println("Você esta de recuperação");
            System.out.println("Sua nota final foi: " + this.notaRe);
            
            do{
                System.out.println("Quer fazer a recuperação paralela? s - sim, n - não");
                char menu = scanner.next().charAt(0);
            
                switch (menu) {
                    case 's':
                        System.out.println("Quanto e 10 + 10 / 5 * 23: ");
                        float resposta = scanner.nextFloat();
                        if(resposta == 43){
                            System.out.println("Parabens você passou de ano");
                            System.out.println("Aproveite as ferias");
                        }else{
                            System.out.println("Infelizmente esta reprovado");
                        }
                        break;

                    case 'n':
                        System.out.println("Ja que não quer fazer a recuperação paralela!!! Adeus !!!");
                        continuar = false;
                        break;
                    default:
                        System.out.println("Informe");
                }
                
            }while(continuar);
        }
        else if(notaRe >= 6 && notaRe <= 10){
            System.out.println("Voce esta aprovado");
            System.out.println("Nota final: " + this.notaRe);
        }else if(notaRe == 0){
            System.out.println("Ainda não foi colocado suas notas");
        }else{
            System.out.println("Tem algo errado");
        }
             
            

        
        return "Nota final: " + this.notaRe;
    }

    
 
}
