/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ads3.modelo;

/**
 *
 * @author amanda
 */
public class Cadastro {
    
    BancoDados conexao;
    
    public Cadastro(){
        conexao = new BancoDados();
    }
    
    public void cadastrar(String nome){
        conexao.cadastrar(nome);
        System.out.printf("%s cadastrado(a) com sucesso!", nome);
    }
    
}
