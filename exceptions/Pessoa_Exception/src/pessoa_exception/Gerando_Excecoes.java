/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pessoa_exception;
/**
 *
 * @author a1625381
 */
public class Gerando_Excecoes extends Exception{
    
           
        Gerando_Excecoes(String msg) {
            super(msg);  
        }
        
        public Gerando_Excecoes() {
           super("Idade inválida");
        }
    
}
