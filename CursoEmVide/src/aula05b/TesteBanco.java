/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05b;

import java.util.Scanner;

/**
 *
 * @author victo
 */
public class TesteBanco {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        
        
       System.out.println("Insira o nome do dono da conta: ");
        String nome = entrada.next();
        
        System.out.println("Insira o número da conta: ");
        String num = entrada.next();
        
        System.out.println("Insira o saldo da conta: ");
        double saldo = entrada.nextDouble();
        
       System.out.println("Para depositar, insira um valor: ");
        double deposito = entrada.nextDouble();
        
       System.out.println("Para sacar, insira um valor: ");
        double saque = entrada.nextDouble();
        
        System.out.println("Insira o tipo de conta a ser criada; cc para 'conta corrente' ou cp para 'conta poupança'.");
        String tipo = entrada.next();
        
        Banco objBanco = new Banco(nome, num);
        objBanco.setSaldo(saldo);
        
        objBanco.AbrirConta(tipo);
          objBanco.Deposita(deposito);
        objBanco.verificar(tipo);
      
       
      
        
    }
    
}
