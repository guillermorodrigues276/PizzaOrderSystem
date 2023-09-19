/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author guill
 */
public class Pessoa {
    
    private String nome;
    private String senha;
    
    public ArrayList<Pessoa> pessoas = new ArrayList<>();
    
    public void incluirPessoa(Pessoa pessoa) {
        pessoas.add(pessoa);
    }

    public ArrayList<Pessoa> getArrayPessoa() {
        return pessoas;
    }

    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
}
