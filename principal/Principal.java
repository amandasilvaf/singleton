/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ads3.principal;

import ads3.modelo.*;
/**
 *
 * @author amanda
 */
public class Principal {
    public static void main(String[] args) {
        BancoDados.instanciar();
        
        System.out.println("Cadastrar Cliente");
        Cadastro cad = new Cadastro();
        cad.cadastrar("Amanda Ferreira");
        
        System.out.println("Verificar Saldo");
        Extrato ext = new Extrato();
        ext.retirar_extrato("Geovani Pereira");
        
        System.out.println("Sacar valor");
        SaqueNotas saque = new SaqueNotas();
        saque.sacar_valor(50.5);
        
    }
    
}
