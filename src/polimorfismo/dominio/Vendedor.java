package polimorfismo.dominio;

import java.util.ArrayList;

public class Vendedor extends Funcionario {
    ArrayList<Cliente> clientes;

    public Vendedor(String nome, int salario, int anoNascimento, ArrayList<Cliente> clientes) {
        super(nome, salario, anoNascimento);
        this.clientes = clientes;
    }

    public Vendedor(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    @Override
    public void imprime() {
        super.imprime();
        if (!clientes.isEmpty()) {
            for (Cliente cliente : clientes) {
                System.out.println(cliente);
            }
        }
    }

    public void vender(){
        System.out.println("Vender");
    }
}
