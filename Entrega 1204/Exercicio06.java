public class Exercicio06 {

  public static void main(String[] args) {
    Funcionario f = new Funcionario("Cleiton", 2000);

    System.out.println("Nome: " + f.getNome());
    System.out.println("Salário com bônus: " + f.getSalario());
  }
}

class Funcionario {
  private String nome;
  private double salario;

  public Funcionario(String nome, double salario) {
    this.nome = nome;
    this.salario = salario * 1.10;
  }

  public String getNome() {
    return nome;
  }

  public double getSalario() {
    return salario;
  }
}