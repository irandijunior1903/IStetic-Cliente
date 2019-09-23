package ufpb.br.trigger.istetic.geral;

import java.util.ArrayList;

import ufpb.br.trigger.istetic.usuario.Usuario;

public class GerenciaLogin {

    private ArrayList<Usuario> users;
    //Será utilizado banco de dados

    private GerenciaLogin() { }

    void cadastrarUsuario(){
        //TODO cadastrar usuário;
    }
    void excluirCadastro() {
        //TODO opção de excluir conta (do usuário);
    }
    void pesquisarUsuario() {
        //TODO pesquisar usuário pelo nome
    }
    void exibirUsuario () {
        //TODO visualizar usuários da aplicação;
    }
    public void setUsers(ArrayList<Usuario> users) {
        this.users = users;
    }
}
