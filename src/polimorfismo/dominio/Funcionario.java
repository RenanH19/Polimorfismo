package polimorfismo.dominio;

import java.time.LocalDate;

public class Funcionario {
    private String nome;
    private int salario;
    private int anoNascimento;

    LocalDate dataAtual = LocalDate.now();

    public Funcionario(String nome, int salario, int anoNascimento) {
        this.nome = nome;
        this.salario = salario;
        this.anoNascimento = anoNascimento;
    }

    public Funcionario() {

    }

    public int idadeAtual(){
        return (anoNascimento - dataAtual.getYear());
    }

    public void imprime() {
        System.out.println("Nome " + nome);
        System.out.println("Salario " + salario);
        System.out.println("dataNascimento " + anoNascimento);
    }
}
