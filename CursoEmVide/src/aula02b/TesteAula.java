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
public class TesteAula {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        Aula aula1 = new Aula();
        
        
        System.out.println("Insira o nome do professor: ");
        String nome = entrada.next();
        aula1.setDocente(nome);
        
        System.out.println("Insira a duração da aula (apenas os minutos):");
        String duracao = entrada.next();
        aula1.setDuracao(duracao);
        
        System.out.println("Insira a data da aula: ");
        String data = entrada.next();
        aula1.setData(data);
        
        System.out.println("Insira o tema da aula: ");
        String tema = entrada.next();
        aula1.setTema(tema);
        
        aula1.setDisponibilidade(true);//a aula está pronta para acontecer
        aula1.cancelarAula();//a aula foi cancelada
        
        aula1.assistir();
        
    }
}
