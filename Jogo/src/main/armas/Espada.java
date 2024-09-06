/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.armas;

/**
 *
 * @author lucas.amsantos4
 */
public class Espada extends Arma{

    public Espada() {
        super.dano = 3;
        super.modelo = "Espada";
        super.escudo = true;
    }
    
    @Override
    public int dano(){
        return this.dano;
    }
}
