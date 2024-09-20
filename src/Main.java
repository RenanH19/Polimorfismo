import polimorfismo.dominio.*;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario01 = new Desenvolvedor("Ronaldo", 1500, 2005, "Ronaldo19" , "1234");
        Funcionario funcionario02 = new AssistenteAlmoxerifado("Natalia", 2100, 2002, new ArrayList<Itens>());
        Funcionario funcionario03 = new Vendedor("Amanda", 2400, 2000, new ArrayList<Cliente>());

        funcionario01.idadeAtual();
        funcionario01.imprime();
        System.out.println("--------------------------");
        funcionario02.imprime();
        System.out.println("--------------------------");
        funcionario03.imprime();
        System.out.println("--------------------------");


        if(funcionario02 instanceof AssistenteAlmoxerifado){
            funcionario02.imprime();
        }

        new Main().imprimir(funcionario01);
        new Main().imprimir(funcionario02);
        new Main().imprimir(funcionario03);

    }

    public void imprimir(Funcionario funcionario){
        funcionario.imprime();
    }
}