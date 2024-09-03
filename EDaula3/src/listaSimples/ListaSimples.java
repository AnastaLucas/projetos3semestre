
package listaSimples;

public class ListaSimples {
    
    private No inicio;
    private No fim;
    private int tamanho;

    public ListaSimples() {
        this.inicio = null;
        this.fim = null;
        this.tamanho = 0;
    }
    public boolean listaVazia(){
        return tamanho()==0;
    }
    public int tamanho(){
        return this.tamanho;
    }
    
    private void inserePrimeiro(double valor){
        No aux = new No(valor);
        this.inicio = aux;
        this.fim = aux;
        tamanho = 1;
    }
    
    private void insereUltimo(double valor){
        No aux = new No(valor);
        this.fim.setProximo(aux);
        this.fim = aux;
        this.tamanho++;
    }
    
    private void insereInicio(double valor){
        No aux = new No(valor);
        aux.setProximo(inicio);
        this.inicio = aux;
        this.tamanho++;
    }
    
    public void insere(double valor){
        if(listaVazia()){
            inserePrimeiro(valor);
        }else{
            insereUltimo(valor);
        }
    }
    
    public void insere(double valor, int pos){
        No aux = new No(valor);
        No proxAnt = this.inicio;
        
        if(tamanho()>pos && pos>0 ){
            pos-=1;
            for(int i = 0; i<pos;i++){
                proxAnt = proxAnt.getProximo();
            }
            aux.setProximo(proxAnt.getProximo());
            proxAnt.setProximo(aux);
            
            this.tamanho++;
        }else if(pos==0){
            insereInicio(valor);
        }
        
    }
    
    public void imprimir(){
        No aux = this.inicio; 
        for(int i = 0; i<tamanho(); i++){
            System.out.printf("\n[%s] - %.2f ",i, aux.getValor());
            aux = aux.getProximo();
        }
    }
    public void remover(){
        removerUltimo();
    }
    public void remover(int pos){
        
        if(tamanho>pos && pos>0){
            removerSelecao(pos);
        }else if(pos == 0){
            removerPrimeiro();
        }
    }
    
    
    private void removerUltimo(){
        No rmv = this.inicio;
        No antRmv;
        for(int i = 1; i<tamanho() - 1;i++){
            rmv = rmv.getProximo();
        }
        
        antRmv = rmv.getProximo();
        rmv.setProximo(null);
        System.gc();
        this.tamanho--;
       
    }
    
    private void removerPrimeiro(){
        this.inicio = this.inicio.getProximo();
        No rmv = this.inicio;
        for(int i = 1; i<tamanho()-1;i++){
            rmv = rmv.getProximo();
        }
        this.tamanho--;
    }
    
    private void removerSelecao(int pos){
        No rmv = this.inicio;
        No antRmv = new No(rmv.getValor());
        for(int i = 0; i<pos;i++){
            antRmv = rmv;
            rmv = rmv.getProximo();
        }
        antRmv.setProximo(rmv.getProximo());
        rmv = null;
        System.gc();
        this.tamanho--;
    }
    
    
    
    // Exercicios propostos
    
    public int getIndex(double valor){
        No aux = this.inicio;
        int i;   
        for(i = 0; (aux.getValor()!= valor);i++ ){
            aux = aux.getProximo();
        }
        
        return i;
    }
   
    /*
    getIndex(valor)
    getValor(posicao)
    ordenar()
    inserirOrdenado()
    */
    
}
