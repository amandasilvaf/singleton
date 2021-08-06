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
public class SaqueNotas {
      
    BancoDados conexao;
    
    public SaqueNotas(){
        conexao = BancoDados.instanciar();
        
    }
    
    public void sacar_valor(double valor){
        double saldo = conexao.saldo_atual();
        System.out.println("Realizando saque: " + valor +  ", sendo saldo: " + saldo);
        
        if(valor > 0){
            if(saldo >= valor){
                 saldo = saldo - valor;
                 System.out.println("O saldo atual agora é: " + saldo);
            }else{
                System.out.println("Não há saldo suficiente para sacar o valor informado.");
            }
        }else{
            System.out.println("O valor informado para o saque é inválido.");
        }   
    }
    
    
    
    
    
    
    
}
