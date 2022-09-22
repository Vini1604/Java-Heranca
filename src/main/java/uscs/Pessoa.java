/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uscs;

/**
 *
 * @author vinic
 */
public class Pessoa {
    String nome;
    String endereco;
    String cpf;
    String rg;
    
    public Pessoa() {
    }

    public Pessoa(String nome, String endereco, String cpf, String rg) {
        this.nome = nome;
        this.endereco = endereco;
        this.cpf = cpf;
        this.rg = rg;
    }
    
    public void ImprimePessoa(){
        System.out.println("Dados:");
        System.out.println("Nome: " + nome);
        System.out.println("Endereco: " + endereco);
        System.out.println("CPF: " + cpf);
        System.out.println("RG: " + rg);
    }
}
