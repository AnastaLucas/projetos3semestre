/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.armas;

/**
 *
 * @author lucas.amsantos4
 */
public class EscudoPequeno extends Escudo{

    public EscudoPequeno() {
        this.defesa = 1;
        this.modelo = "Escudo Pequeno";
    }
    
    
    @Override
    public int defesa(){
        return this.defesa;
    }
}
