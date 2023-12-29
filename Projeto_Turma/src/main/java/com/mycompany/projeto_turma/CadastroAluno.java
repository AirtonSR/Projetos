package com.mycompany.projeto_turma;

public class CadastroAluno {
    private String nome;
    private int idade;
    private String sexo;
    private String nomeResponsavel;
    private String login;
    private String senha;

    public CadastroAluno(String nome, int idade,String sexo, String nomeResponsavel, String login, String senha) {
        this.setNome(nome);
        this.setIdade(idade);
        this.setNomeResponsavel(nomeResponsavel);
        this.setLogin(login);
        this.setSenha(senha);
        this.setSexo(sexo);
      
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
        this.idade = idade;
    }
    
    public String getNomeResponsavel() {
        return nomeResponsavel;
    }

    public void setNomeResponsavel(String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    
    
    
}
