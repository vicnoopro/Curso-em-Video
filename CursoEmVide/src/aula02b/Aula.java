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
public class Aula {
    
    private String duracao, docente, data, tema;
    private boolean disponibilidade, assistida;

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getDocente() {
        return docente;
    }

    public void setDocente(String docente) {
        this.docente = docente;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }
    
    public void cancelarAula()
    {
        this.setDisponibilidade(false);
        System.out.println("A aula do dia foi cancelada.");
    }
    
    public void iniciarAula()
    {
        this.disponibilidade= true;
        System.out.println("A aula está começando. . .");
    }
    
    public void assistir ()
    {
        if (this.isDisponibilidade()== true){
             System.out.println("Você assistiu à aula.");
        }
        
        else{
            System.out.println("Não foi possível assistir a aula.");
        }
       
    }
}
