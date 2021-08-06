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
        conexao = new BancoDados();
    }
    
    public void sacar_valor(double valor){
        double saldo = conexao.saldo_atual();
        System.out.printf("Realizando saque: $d, sendo saldo: %d", valor, saldo);
        
        if(valor > 0){
            if(saldo >= valor){
                 // calculo de notas do saque..
                 System.out.printf("Sacando: R$ %d", valor);
                 saldo = saldo - valor;
            }else{
                System.out.println("Não há saldo suficiente para sacar o valor informado.");
            }
        }else{
            System.out.println("O valor informado para o saque é inválido.");
        }   
    }
    
    
    
    
    
    
    
}
