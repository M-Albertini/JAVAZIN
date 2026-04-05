//Atividade herança
/*Exercício 1 - Crie uma classe Veiculo com atributos como modelo e ano. Em seguida, crie duas subclasses, Carro e Moto, que herdam de Veiculo, 
cada um deve possuir pelo menos 2 atributos e um metodo a mais. */
import java.util.Scanner;

class Veiculo{
    String modelo;
    int ano;    

        void mostrarDados(){
            System.out.println("Modelo: " + modelo);
            System.out.println("Ano: " + ano);
        }
}

class Carro extends Veiculo {
    int porta,QntPortas;
    String lugares;

    void ligaAr(){
        System.out.println("Ar-condicionado ligado");
    }

}
class Moto extends Veiculo {
    int cilindrada;
    int rodas;
    int QntRodas;

    void empinar(){
        System.out.println("A moto está empinando");
    }
}

public class Exercicio1 {
    public static void main(String[] args) {
        
    Moto ObjetoMoto = new Moto();  //Quando crio o objeto com base na classe moto, ele já cria com as variaveis e metodos dentro da classe que ela herda Veiculos
    Carro ObjetoCarro =  new Carro();
    
    Scanner Scaninfosveiculo = new Scanner(System.in);
    System.out.println("Qual o modelo da moto");
    ObjetoMoto.modelo = Scaninfosveiculo.nextLine();//Recebe as informações
    
    System.out.println("Qual ano da moto?");
    ObjetoMoto.ano= Scaninfosveiculo.nextInt();//Salva dentro da  variavel ano herdada da classe veiculo
    Scaninfosveiculo.nextLine();


    System.out.println("Quantas cilindradas?");
    ObjetoMoto.cilindrada = Scaninfosveiculo.nextInt();
    Scaninfosveiculo.nextLine();

    do{
        System.out.println("Modelo de 2 rodas?");
        System.out.println("1 - Sim ");
        System.out.println("2 - Não ");
        ObjetoMoto.rodas = Scaninfosveiculo.nextInt();
        Scaninfosveiculo.nextLine();
    }while (ObjetoMoto.rodas != 1 && ObjetoMoto.rodas != 2); //Enquanto não for igual a 1 ou 2 é verdadeiro, então executa dnv

    if (ObjetoMoto.rodas == 1) {
        
        ObjetoMoto.QntRodas = 2;

    }else{
        
        System.out.println("Quantas rodas?");
        ObjetoMoto.QntRodas = Scaninfosveiculo.nextInt();
        Scaninfosveiculo.nextLine();
    }


        System.out.println("===Carro===");
        System.out.println("Qual modelo do carro?");
        ObjetoCarro.modelo = Scaninfosveiculo.nextLine();
        
        System.out.println("Qual ano do carro?");
        ObjetoCarro.ano = Scaninfosveiculo.nextInt();
        Scaninfosveiculo.nextLine();

      do{
        System.out.println("Modelo de 4 portas?");
        System.out.println("1 - Sim ");
        System.out.println("2 - Não ");
        ObjetoCarro.porta = Scaninfosveiculo.nextInt();
        Scaninfosveiculo.nextLine();

        }while (ObjetoCarro.porta != 1 && ObjetoCarro.porta != 2); //Enquanto não for igual a 1 ou 2 é verdadeiro, então executa dnv

         if (ObjetoCarro.porta == 1) {
        
        ObjetoCarro.QntPortas = 4;

         }else{
        
        System.out.println("Quantas portas?");
        ObjetoCarro.QntPortas = Scaninfosveiculo.nextInt();
        Scaninfosveiculo.nextLine();
        }

        System.out.println("Quantos lugares?");
        ObjetoCarro.lugares = Scaninfosveiculo.nextLine();


        System.out.println("==Carro==");
        ObjetoCarro.mostrarDados();// Objeto criado com base na classe carro pegou da classe veiculo para imprimir
        System.out.println("Quantidade de portas: " + ObjetoCarro.QntPortas );
        System.out.println("lugares: " + ObjetoCarro.lugares);
        ObjetoCarro.ligaAr();

        System.out.println("==Moto==");
        ObjetoMoto.mostrarDados();// Objeto criado com base na classe moto pegou da classe veiculo para imprimir
        System.out.println(ObjetoMoto.QntRodas + " Rodas");
        System.out.println(ObjetoMoto.cilindrada + " Cilindradas");
        ObjetoMoto.empinar();       
        
        //System.out.println("Chegou aqui");

    }
}
