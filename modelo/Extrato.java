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
public class Extrato {
    
    BancoDados conexao;
    
    public Extrato(){
        conexao = BancoDados.instanciar();
   
    }
    
    public void retirar_extrato(String nome){
        double saldo = conexao.saldo_atual();
        System.out.println("Extraindo o extrato de " + nome );
        System.out.println("O valor do saldo atual é: " + saldo);
    }
    
}
