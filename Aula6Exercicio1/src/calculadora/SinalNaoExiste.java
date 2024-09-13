/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

/**
 *
 * @author lucas.amsantos4
 */
public class SinalNaoExiste extends Exception{
    public SinalNaoExiste(){
        super();
    }
    public SinalNaoExiste(String errorMessage){
        super(errorMessage);
        
    }
}
