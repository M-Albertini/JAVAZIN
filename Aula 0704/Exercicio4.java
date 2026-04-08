
/*
Enunciado
• Crie uma classe ContaBancaria com:
– titular
– saldo
• Construtor deve iniciar saldo com valor
informado 
 */
import java.util.Scanner;

class ContaBancaria {

    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        setSaldo(saldo);//Aqui já inicia saldo com valor
    }

    public String getTitular() {

        return titular;//Retorna para quem chamaou o valor de titular
    }

    public double getSaldo() {
        return saldo;
    }

    public void setTitular(String titular) {

        this.titular = titular;

    }

    public void setSaldo(double saldo) {
        if (saldo >= 0){
            this.saldo= saldo;
        }else{
            System.out.println("Saldo invalido!");
            this.saldo=saldo;
        }

    }

}

public class Exercicio4 {

    public static void main(String[] args) {

        Scanner scannerentrada = new Scanner(System.in);

        System.out.println("Qual nome do titular?");
        String titular = scannerentrada.nextLine();

        System.out.println("Qual saldo inicial?");
        double saldo = scannerentrada.nextDouble();

        ContaBancaria objetocontabancaria = new ContaBancaria(titular, saldo);

        System.out.println("Saldo inicial:" + objetocontabancaria.getSaldo());
    }
}
