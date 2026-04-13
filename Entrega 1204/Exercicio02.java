public class Exercicio02 {

  public static void main(String[] args) {
    ContaBancaria conta = new ContaBancaria();

    conta.setTitular("Cleiton");
    conta.setSaldo(1000);

    System.out.println("Titular: " + conta.getTitular());
    System.out.println("Saldo: " + conta.getSaldo());
  }
}

class ContaBancaria {
  private String titular;
  private double saldo;

  public String getTitular() {
    return titular;
  }

  public void setTitular(String titular) {
    this.titular = titular;
  }

  public double getSaldo() {
    return saldo;
  }

  public void setSaldo(double saldo) {
    if (saldo >= 0) {
      this.saldo = saldo;
    } else {
      System.out.println("Erro: saldo não pode ser negativo.");
    }
  }
}