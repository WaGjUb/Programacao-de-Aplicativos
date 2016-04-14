/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usandojframe;

/**
 *
 * @author a1625381
 */
public class Pessoa {
        
    private String nome;
    private int idade;
    
    public Pessoa(String nome, int idade)
    {
        this.nome = nome;
        this.idade = idade;
    }
    
    public Object[] obterDados()
    {          
        return(new Object[]{nome,idade});
    }
        
    
}
