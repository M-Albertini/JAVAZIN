public class Exercicio03 {

  public static void main(String[] args) {
    Produto produto = new Produto();

    produto.setNome("Mouse");
    produto.setPreco(0);

    System.out.println("Nome: " + produto.getNome());
    System.out.println("Preço: " + produto.getPreco());
  }
}

class Produto {
  private String nome;
  private double preco;

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public double getPreco() {
    return preco;
  }

  public void setPreco(double preco) {
    if (preco > 0) {
      this.preco = preco;
    } else {
      System.out.println("Erro: preço deve ser maior que 0.");
    }
  }
}