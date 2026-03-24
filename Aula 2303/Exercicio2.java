public class Exercicio2 {

    String marca, modelo;
    double velocidade;

    void acelerar(){

        System.out.println("O carro esta acelerando!");

    }
    void ExibirInformacao(){
        System.out.println("O modelo é: " + modelo  + "\n" +  "A marca é:" + marca + "\n" + " A velocidade é: " + velocidade + "Km/h");
    }

    public static void main(String[] args) {
        
        Exercicio2 carrin = new Exercicio2();

        carrin.marca ="Volks";
        carrin.modelo = "GolG3";
        carrin.velocidade = 1;

        carrin.acelerar();
        carrin.ExibirInformacao();
    }
}