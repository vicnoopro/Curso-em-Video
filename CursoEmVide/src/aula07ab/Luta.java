/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula07ab;

/**
 *
 * @author victo
 */
public class Luta {
    
    private String desafiado, desafiante;
    private int rounds;
    private boolean aprovada;

  Lutador L;
    
    public Luta(String desafiado, String desafiante, int rounds, boolean aprovada) {
        this.desafiado = desafiado;
        this.desafiante = desafiante;
        this.rounds = rounds;
        this.aprovada = false;
        
    }

    public Luta(Lutador L) {
        this.L = L;
    }
    
    public String getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(String desafiado) {
        this.desafiado = desafiado;
    }

    public String getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(String desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
    
    public void MarcarLuta(){
        
    }
    
    public void lutar(){
        
        
        
    }
}
