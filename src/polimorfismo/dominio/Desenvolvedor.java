package polimorfismo.dominio;

public class Desenvolvedor extends Funcionario{
    private String loginUsuario;
    private String senhaUsuario;

    public Desenvolvedor(String nome, int salario, int anoNascimento, String loginUsuario, String senhaUsuario) {
        super(nome, salario, anoNascimento);
        this.loginUsuario = loginUsuario;
        this.senhaUsuario = senhaUsuario;
    }

    public Desenvolvedor(String loginUsuario, String senhaUsuario) {
        this.loginUsuario = loginUsuario;
        this.senhaUsuario = senhaUsuario;
    }

    @Override
    public void imprime(){
        super.imprime();
        System.out.println("Login do usuário: " + loginUsuario);

    }

    public void logar(){
        System.out.println("logou");
    }

}
