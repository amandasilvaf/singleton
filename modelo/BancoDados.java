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
public class BancoDados {
    
    public BancoDados(){
        
    }
    
    public void conecte(){ 
        System.out.println("Conectando a base de dados");
    }
    
    public double saldo_atual(){
        return 100;
    }
    
    public void cadastrar(String nome){
        System.out.printf("cadastrando $s no banco de dados.", nome);
    }
    
}
