/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02b;

/**
 *
 * @author victo
 */
public class Caneta {
    
    private String modelo, cor;
    private float ponta, carga;
    private boolean tampada;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public float getCarga() {
        return carga;
    }

    public void setCarga(float carga) {
        this.carga = carga;
    }


    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }
    
    public void rabiscar()
    {
        if(this.tampada == true)
        {
            System.out.println("Não é possível rabiscar pois a caneta está tampada"); 
        }
        
        else
        {
            System.out.println("Rabiscando...");
        }
    }
    
    public void tampar()
    {
        this.tampada=true;
    }
    
    public void destampar()
    {
        this.tampada=false;
    }
    
    public void status()
    {
        System.out.println("Uma caneta "+this.getCor());
        System.out.println("Está tampada? "+this.isTampada());
        System.out.println("Modelo: "+this.getModelo());
        System.out.println("Tamanho da ponta: "+this.getPonta());
        System.out.println("Quantidade de carga: "+this.getCarga());
        
        System.out.println("                                         ");
    }
}
