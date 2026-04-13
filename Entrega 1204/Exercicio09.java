public class Exercicio09 {

  public static void main(String[] args) {
    Pedido pedido = new Pedido(1, 250.50);

    System.out.println("Número: " + pedido.getNumero());
    System.out.println("Valor: " + pedido.getValor());
  }
}

class Pedido {
  private int numero;
  private double valor;

  public Pedido(int numero, double valor) {
    this.numero = numero;
    this.valor = valor;
  }

  public int getNumero() {
    return numero;
  }

  public double getValor() {
    return valor;
  }
}