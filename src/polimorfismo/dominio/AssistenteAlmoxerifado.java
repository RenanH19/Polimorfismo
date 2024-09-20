package polimorfismo.dominio;

import java.util.ArrayList;

public class AssistenteAlmoxerifado extends Funcionario {
    ArrayList<Itens> itens;

    public AssistenteAlmoxerifado(ArrayList<Itens> itens) {
        this.itens = itens;
    }

    public AssistenteAlmoxerifado(String nome, int salario, int anoNascimento, ArrayList<Itens> itens) {
        super(nome, salario, anoNascimento);
        this.itens = itens;
    }

    @Override
    public void imprime(){
        super.imprime();
        System.out.println(itens);
    }

    public void tirarObjeto(int indice){
        if (itens.size() >= indice){
            System.out.println("Item removido" + itens.get(indice));
            itens.remove(indice);

        }

    }
}
