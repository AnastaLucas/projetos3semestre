/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.armas;

/**
 *
 * @author lucas.amsantos4
 */
public class Arco extends Arma{
    public Arco() {
        super.dano = 2;
        super.modelo = "Arco";
        super.escudo = false;
    }
    
    @Override
    public int dano(){
        return this.dano;
    }
}
