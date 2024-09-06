/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.armas;

/**
 *
 * @author lucas.amsantos4
 */
public class Punhos extends Arma{
    public Punhos() {
        super.dano = 1;
        super.modelo = "Punhos";
        super.escudo = true;
    }
    
    @Override
    public int dano(){
        return this.dano;
    }
}
