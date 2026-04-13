public class Exercicio04 {

  public static void main(String[] args) {
    ContaBancaria conta = new ContaBancaria("Cleiton", 1000);

    System.out.println("Titular: " + conta.getTitular());
    System.out.println("Saldo: " + conta.getSaldo());
  }
}

class ContaBancaria {
  private String titular;
  private double saldo;

  public ContaBancaria(String titular, double saldo) {
    this.titular = titular;
    if (saldo >= 0) {
      this.saldo = saldo;
    } else {
      System.out.println("Erro: saldo não pode ser negativo.");
      this.saldo = 0;
    }
  }

  public String getTitular() {
    return titular;
  }

  public double getSaldo() {
    return saldo;
  }
}