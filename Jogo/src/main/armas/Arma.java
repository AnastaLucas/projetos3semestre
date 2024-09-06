/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.armas;

/**
 *
 * @author lucas.amsantos4
 */
public abstract class Arma {

    public String getModelo() {
        return modelo;
    }

    public int getDano() {
        return dano;
    }

    public boolean isDuasMaos() {
        return escudo;
    }
    String modelo;
    int dano;
    boolean escudo;
    
    public abstract int dano();
}
