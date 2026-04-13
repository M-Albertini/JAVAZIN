public class Exercicio07 {

  public static void main(String[] args) {
    Produto p = new Produto("Teclado", -150);

    System.out.println("Nome: " + p.getNome());
    System.out.println("Preço: " + p.getPreco());
  }
}

class Produto {
  private String nome;
  private double preco;

  public Produto(String nome, double preco) {
    this.nome = nome;
    if (preco >= 0) {
      this.preco = preco;
    } else {
      System.out.println("Erro: preço não pode ser negativo.");
      this.preco = 0;
    }
  }

  public String getNome() {
    return nome;
  }

  public double getPreco() {
    return preco;
  }
}