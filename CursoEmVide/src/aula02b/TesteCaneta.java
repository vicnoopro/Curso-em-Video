/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02b;

import java.util.Scanner;

/**
 *
 * @author victo
 */
public class TesteCaneta {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        Caneta c1 = new Caneta();
        Caneta c2 = new Caneta();
        
        System.out.println("Insira a cor da caneta 1: ");
        String cor = entrada.next();
        c1.setCor(cor);
        
        
        System.out.println("Insira a cor da caneta 2: ");
        String cor2 = entrada.next();
        c2.setCor(cor2);
        
        System.out.println("Insira a ponta da caneta 1: ");
        float ponta = entrada.nextFloat();
        c1.setPonta(ponta);
        
        System.out.println("Insira a ponta da caneta 2: ");
        float ponta2 = entrada.nextFloat();
        c2.setPonta(ponta2);
        
        System.out.println("Insira o modelo da caneta 1: ");
        String modelo = entrada.next();
        c1.setModelo(modelo);
        
        System.out.println("Insira o modelo da caneta 2: ");
        String modelo2 = entrada.next();
        c2.setModelo(modelo2);
        
        c1.setTampada(false);//a caneta 1 está tampada
        c2.setTampada(true);// a caneta 2 está tampada
        
        c1.tampar();// a caneta 1 foi tampada
        c2.destampar();// a caneta 2 foi destampada
        
        
        c1.rabiscar();//a caneta 1 está tampada, não sendo possível rabiscar
        c2.rabiscar();
        
        c1.status();
        c2.status();
        
    }
    
}
