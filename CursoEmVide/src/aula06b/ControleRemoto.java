
package aula06b;

public class ControleRemoto {
    
    private int volume;
    private boolean ligado, tocando;

    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean isTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
    
    public void Ligar(){
        
        this.setLigado(true);
    }

    public void Desligar(){
        
        this.setLigado(false);
    }
    
    public void AbrirMenu(){
        System.out.println("------MENU------");
        System.out.println("Está ligado? "+this.isLigado());
        System.out.println("Está tocando? "+this.isTocando());
        System.out.print("Volume: "+this.getVolume()); 
        for (int i = 0; i<=this.getVolume(); i+=10){
            System.out.print("|");
        }
    }
    
    public void FecharMenu(){
        
        System.out.println("Fechando Menu...");
        
    }
    
    public void MaisVolume(){
        
        if (this.isLigado()==true){
        this.setVolume(this.getVolume()+1);
        }
    }
    
    public void MenosVolume(){
        
        if (this.isLigado()==true){
        this.setVolume(this.getVolume()-1);
         }
    }
    
    public void LigarMudo(){
        
        if ((this.isLigado() == true ) && (this.getVolume() > 0)){
            
            this.setVolume(0);
        }
        
    }
    
    public void DesligarMudo(){
        
        if((this.isLigado() == true )&& (this.getVolume() == 0)){
            this.setVolume(50);
        }
        
    }
    
    public void Play(){
        
        if ((this.isLigado() == true )&&(this.isTocando() == false)){// se ele estiver ligado e nao tocando
            
            this.setTocando(true);
        }
                
    }
    
    public void Pause (){
        
        if ((this.isLigado() == true )&&(this.isTocando() == true)){// se ele estiver ligado e tocando
            
            this.setTocando(false);
        }
    }
}
