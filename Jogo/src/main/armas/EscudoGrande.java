/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.armas;

/**
 *
 * @author lucas.amsantos4
 */
public class EscudoGrande extends Escudo{
    public EscudoGrande() {
        this.defesa = 2;
        this.modelo = "Escudo Grande";
    }
    
    
    @Override
    public int defesa(){
        return this.defesa;
    }
}
