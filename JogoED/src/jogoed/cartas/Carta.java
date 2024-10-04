/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jogoed.cartas;

/**
 *
 * @author lucas.amsantos4
 */
public class Carta {

    public Carta getPokemon() {
        return pokemon;
    }

    public void setPokemon(Carta pokemon) {
        this.pokemon = pokemon;
    }

    public Carta getProximo() {
        return proximo;
    }

    public void setProximo(Carta proximo) {
        this.proximo = proximo;
    }
    
    public Carta(Carta pokemon){
        this.pokemon = pokemon;
        this.proximo = null;
    }
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAtq() {
        return atq;
    }

    public void setAtq(int atq) {
        this.atq = atq;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    private Carta pokemon;
    private Carta proximo;
    
    private String nome;
    private int atq;
    private int def;
    private String tipo;



    public Carta(String nome, int atq, int def, String tipo) {
        this.nome = nome;
        this.atq = atq;
        this.def = def;
        this.tipo = tipo;
    }    
    
    public void status(){
        String status = ""+nome+" Tipo:"+tipo+" "
                + "atq - "+atq+"   def - "+def+"\n";
        System.out.println(status); 
    }
    //Novo metodo feito para retornar valores das cartas
    public Carta copia() {
        return new Carta(this.nome, this.atq, this.def, this.tipo);  // Cria uma nova carta com os mesmos atributos
    }

    
}
