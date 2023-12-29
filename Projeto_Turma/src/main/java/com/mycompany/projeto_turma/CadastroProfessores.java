package com.mycompany.projeto_turma;

public class CadastroProfessores {
    private String nome;
    private String escolaridade;
    private int idade;
    private String sexo;
    private String login;
    private String senha;
    private boolean ativo;
    private String turma;

    public CadastroProfessores() {
        this.setNome("Airton");
        this.setIdade(24);
        this.setSexo("Masculino");
        this.setEscolaridade("Ensino superior");
        this.setLogin("Airton");
        this.setSenha("1234");
        this.setAtivo(true);
        this.setTurma("6° A");
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade >= 0) {
            this.idade = idade;
        } else {
            System.out.println("Idade inválida");
        }
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public String getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }
    
    
}
