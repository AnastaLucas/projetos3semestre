/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.monstros;

import main.armas.Arma;
import main.armas.Escudo;

/**
 *
 * @author lucas.amsantos4
 */
public class Goblin extends Inimigo{
    private Escudo escudo;
    
    public Goblin(Arma arma){
        super.nome = "Goblin";
        super.danoBase = 4;
        super.saude = 10;
        super.arma = arma;
    }
    
    public void escudo(Escudo escudo){
        this.escudo = escudo;
    }
    
    
    
}
