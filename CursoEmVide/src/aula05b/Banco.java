/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05b;

/**
 *
 * @author victo
 */
public class Banco {

    private String dono, numConta, tipo;
    private double saldo;
    private boolean status;

    public Banco(String dono, String numConta) {
        this.dono = dono;
        this.numConta = numConta;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void AbrirConta(String tipo) {

        if ("cp".equals(tipo)) {
            System.out.println("Você abriu uma conta poupança!");
            this.saldo = this.saldo + 300;
            System.out.println("Nome: "+this.getDono());
            System.out.println("Número da conta: "+this.getNumConta());
            System.out.println("Saldo disponível: R$" + this.getSaldo());

            this.status = true;
            System.out.println("Conta Ativa.");
               System.out.println("                         ");
        } else {
            
            System.out.println("Você abriu uma conta corrente!");
            this.saldo = this.getSaldo() + 150;
             System.out.println("Nome: "+this.getDono());
            System.out.println("Número da conta: "+this.getNumConta());
            System.out.println("Saldo dísponível: R$" + this.getSaldo());
            this.status = true;
            System.out.println("Conta Ativa.");
               System.out.println("                         ");
        }

    }

    public void FecharConta() {

        if (this.saldo != 0) {
            System.out.println("Sua conta possui dinheiro. Não foi possível fechar a conta.");
            this.status = true;
            System.out.println("Conta Ativa.");
               System.out.println("                         ");
        } else {
            System.out.println("Conta fechada com sucesso!");
            this.status = false;
            System.out.println("Conta Inativa.");
               System.out.println("                         ");
        }
    }

    public void Deposita(double quantidade) {

        this.saldo = this.saldo + quantidade;

        System.out.println("Saldo dísponível pós depósito: R$");
    }

    public void Saca(double quantidade) {
        if (this.saldo < quantidade)
        {
            System.out.println("Não é possível sacar essa quantia;");
        }
        
        else{
             this.saldo = this.saldo - quantidade;
            System.out.println("Saque autorizado. Saldo atual pós saque: R$"+this.getSaldo());
        }
       
    }
  
    public void verificar(String tipo){
        
        if ("cp".equals(tipo)) {
            System.out.println("Relatório:");
           
            System.out.println("Nome: "+this.getDono());
            System.out.println("Número da conta: "+this.getNumConta());
            System.out.println("Saldo disponível: R$" + this.getSaldo());

            this.status = true;
            System.out.println("Conta Ativa.");
            System.out.println("                         ");
        } else {
            
            System.out.println("Relatório");
             System.out.println("Nome: "+this.getDono());
            System.out.println("Número da conta: "+this.getNumConta());
            System.out.println("Saldo dísponível: R$" + this.getSaldo());
            this.status = true;
            System.out.println("Conta Ativa.");
               System.out.println("                         ");
        }

    }
}
