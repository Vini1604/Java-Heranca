/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uscs;

/**
 *
 * @author vinic
 */
public class Aluno extends Pessoa {
    int codigoMatricula;
    double notaP1;
    double notaP2;
    int faltas;
    
    public Aluno(){
        
    }
    public Aluno(String nome, String endereco, String cpf, String rg, int codigoMatricula, double notaP1, double notaP2, int faltas){
        super(nome, endereco, cpf, rg);
        this.codigoMatricula = codigoMatricula;
        this.notaP1 = notaP1;
        this.notaP2 = notaP2;
        this.faltas = faltas;
    }
    
    public void ImprimeAluno(){
        System.out.println("Aluno #" + codigoMatricula);
        super.ImprimePessoa();
        System.out.println("Nota P1: " + notaP1);
        System.out.println("Nota P2: " + notaP2);
    }
    
    public void ImprimeFaltas(){
        System.out.println("Aluno #" + codigoMatricula);
        System.out.println("Total faltas: " + faltas);
    }
    
    public void Resultado(){
        if (faltas > 10) {
            System.out.println("Reprovado por falta!!!");
        }
        else
        {
            double media = (notaP1 + notaP2) / 2.0;
            System.out.println("Media: " + media);
            if (media >= 7.0) {
                System.out.println("Aluno Aprovado");
            }
            else
            {
                if(media >= 3){
                    System.out.println("Aluno de Exame");
                }
                else
                {
                    System.out.println("Reprovado por Media");
                }
            }
        }
    }
    
}
