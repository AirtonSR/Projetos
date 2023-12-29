package com.mycompany.projeto_turma;

public class CadastrarDiretor {
    private String login;
    private String nome;
    private String senha;

    public CadastrarDiretor() {
        this.setNome("Jose Airton Silva Rodrigues");
        this.setLogin("Ailton");
        this.setSenha("1234");
    }
    
    

    protected String getLogin() {
        return login;
    }

    protected String getNome() {
        return nome;
    }

    protected String getSenha() {
        return senha;
    }

    protected void setLogin(String login) {
        this.login = login;
    }

    protected void setNome(String nome) {
        this.nome = nome;
    }

    protected void setSenha(String senha) {
        this.senha = senha;
    }
    
    
}
