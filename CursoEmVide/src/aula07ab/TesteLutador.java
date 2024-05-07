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
public class TesteLutador {
    public static void main(String[] args) {
        
        Lutador L[] = new Lutador[6];
        L[0] = new Lutador("Pretty Boy","França",31,11,2,1,1.75,68.9);
        L[1] = new Lutador("Putscript","Brasil", 29, 14, 2,3,1.68,57.8);
        L[2] = new Lutador("Snapshadow","Estados Unidos",35, 12,2,1,1.65,80.9);
        L[3] = new Lutador("Dead Code","Austrália",28,13,0,2,1.93,81.6);
        L[4] = new Lutador("OfoCobol","Brasil", 37,5,4,3,1.70,119.3);
        L[5] = new Lutador("Nerdaart","Estados Unidos", 30, 12,2,4,1.81,105.7);
       
        L[0].Apresentar();
        
    }
    
}
