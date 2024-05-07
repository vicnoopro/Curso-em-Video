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
public class Lutador {
    
    private String nome, nacionalidade,categoria;
    private int idade, vitorias, derrotas, empates;
    private double altura,peso;

    public Lutador(String nome, String nacionalidade, int idade, int vitorias, int derrotas, int empates, double altura, double peso) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
        this.altura = altura;
        this.setPeso(peso);
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
      
        if(this.getPeso() < 52.2){
            this.categoria = "Inválido";
        }
        else if (this.getPeso() <= 70.3)
        {
            this.categoria = "Leve";
        }
        else if (this.getPeso() <= 83.9){
            this.categoria = "Médio";
        }
        else if (this.getPeso() <= 120.2){
            this.categoria = "Pesado";
        }
        else{
            this.categoria = "Inválido";
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
        this.setCategoria();
    }
    
    public void Apresentar(){
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.println("CHEGOU A HORA! VAMOS APRESENTAR O LUTADOR "+this.getNome());
        System.out.println("Diretamente de "+this.getNacionalidade()+"!");
        System.out.println("com "+this.getIdade()+" anos e "+this.getAltura()+"m de altura");
        System.out.println("Pesando "+this.getPeso()+"kg");
        System.out.println(this.getVitorias()+" vitorias "+this.getDerrotas()+" derrotas e "+this.getEmpates()+" empates!");
    }
    
    public void Status(){
        
        System.out.println(this.getNome()+" é um peso "+this.getCategoria());
        System.out.println("Ganhou "+this.getVitorias()+" lutas, perdeu "+this.getDerrotas()+" e fez "+this.getEmpates()+" empates.");
        
    }
    
    public void GanharLuta(){
        
        this.setVitorias(this.getVitorias()+1);
    }
    
    public void PerderLuta(){
        this.setDerrotas(this.getDerrotas()+1);
    }
    
    public void EmpatarLuta(){
        this.setEmpates(this.getEmpates()+1);
        
    }
}
