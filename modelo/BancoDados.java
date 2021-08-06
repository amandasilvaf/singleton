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
    
    private static BancoDados INSTANCIA = new BancoDados();
    
    private BancoDados(){
        System.out.println("Criando novo Banco de Dados.");
        System.out.println("Conectando a base de dados");
    }
    
    public static BancoDados instanciar(){ 
        return INSTANCIA;
    }
    
    public void conecte(){
       
    }
    
    public double saldo_atual(){
        return 100;
    }
    
    public void cadastrar(String nome){
        System.out.println("cadastrando" + nome +  " no banco de dados.");
    }
    
}
