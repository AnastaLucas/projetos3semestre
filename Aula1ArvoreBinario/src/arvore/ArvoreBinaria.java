/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arvore;

/**
 *
 * @author lucas.amsantos4
 */
public class ArvoreBinaria {
    private No raiz;
    
    public ArvoreBinaria(){
        this.raiz = null;
    }
    
    public void insere(double valor){
        if(raiz==null){
            this.raiz = new No(valor);
        }else{
            No temp = this.raiz;
            boolean valorInserido = false;
            do{
                if(temp.getValor() == valor) valorInserido = true;
                
                if(valor>temp.getValor() && temp.getDireita()==null){
                    temp.setDireita(new No(valor));
                    valorInserido = true;
                }else if(valor<temp.getValor() && temp.getEsquerda() == null){
                    temp.setEsquerda(new No(valor));
                    valorInserido = true;
                }else if(valor>temp.getValor() && temp.getDireita()!= null){
                    temp = temp.getDireita();
                    
                }else if(valor<temp.getValor() && temp.getEsquerda() != null){
                    temp = temp.getEsquerda();
                   
                }
            }while(valorInserido != true);
        }
    }
    public void imprimiPreOrdem(){
        buscaPreOrdem(this.raiz);
    }
    private void buscaPreOrdem(No aux){
        //Raiz Esquerda Direita
    }
    
    public void imprimiInOrdem(){
        buscaInOrdem(this.raiz);
    }
    private void buscaInOrdem(No aux){
        // Esqueda Raiz Direita
        if(aux != null) buscaInOrdem(aux.getEsquerda());
        if(aux != null) System.out.println(aux.getValor());
        if(aux != null) buscaInOrdem(aux.getDireita());
    }
}
