package ufpb.br.trigger.istetic.usuario;

import java.util.ArrayList;

import ufpb.br.trigger.istetic.geral.Endereco;

public class Usuario {
    private int codigoUsuario;
    private String name;
    private ArrayList<Endereco> endereco;
    private int idade;
    private String email;

    public Usuario() {
        this.codigoUsuario = 0;
        this.name = "";
        this.endereco = new ArrayList<>();
        this.idade = 0;
        this.email = "";
    }

    public Usuario(int codigoUsuario, String nome, Endereco endereco, int age, String email) {
        this.codigoUsuario = codigoUsuario;
        this.name = nome;
        this.endereco = new ArrayList<>();
        this.idade = age;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public ArrayList<Endereco> getEndereco() {
        return endereco;
    }

    public void setEndereco(ArrayList<Endereco> endereco) {
        this.endereco = endereco;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCodigoUsuario() {
        return codigoUsuario;
    }

    public void setCodigoUsuario(int codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }
}