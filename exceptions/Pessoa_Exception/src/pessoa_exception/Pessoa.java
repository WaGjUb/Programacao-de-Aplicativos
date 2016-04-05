package pessoa_exception;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author a1625381
 */
public class Pessoa {
        public int idade;
        
         
    public void setIdade(int id) throws Gerando_Excecoes
    {
        if (id < 0)
        {
            throw new Gerando_Excecoes();    
        }
        
       try
       {
        this.idade = id;
       }
       catch(Exception e) 
               {
                   System.out.println(e.toString());
               }
    }  
}
