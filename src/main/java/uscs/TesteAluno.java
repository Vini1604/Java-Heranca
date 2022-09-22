package uscs;

public class TesteAluno {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Jose", "Rua Antonio Marques, 30", "568.234.981-15", "3.698.222-8");
        Aluno a1 = new Aluno("Pedro", "Rua Almeida, 20", "456.876.123-12", "4.687.098-2", 59751, 4.5, 8.0, 10);
        Aluno a2 = new Aluno("Francisco", "Rua Almeida, 34", "123.465.891-12", "4.687.456-2", 59751, 4.5, 1.0, 5);
        p1.ImprimePessoa();
        System.out.println("");
        a1.ImprimeAluno();
        a1.ImprimeFaltas();
        a1.Resultado();
        System.out.println("");
        a2.ImprimeAluno();
        a2.ImprimeFaltas();
        a2.Resultado();
    }
}
