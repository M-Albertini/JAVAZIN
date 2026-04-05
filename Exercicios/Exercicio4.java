//Atividade herança
import java.util.Scanner;

class Veiculo{
    String modelo;
    int ano;    

    void mostrarDados(){
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }

    
    void imprimirInformacoes(){
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

    
    @Override //Avisa o compilador que teve uma subscrição
    void imprimirInformacoes(){ //Subscreve o metodo
        System.out.println("==Carro==");
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Quantidade de portas: " + QntPortas);
        System.out.println("Lugares: " + lugares);
    }
}

class Moto extends Veiculo {
    int cilindrada;
    int rodas;
    int QntRodas;

    void empinar(){
        System.out.println("A moto está empinando");
    }

    
    @Override // Sem isso é como se fosse um novo metodo sendo criado
    void imprimirInformacoes(){
        System.out.println("==Moto==");
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Rodas: " + QntRodas);
        System.out.println("Cilindrada: " + cilindrada);
    }
}

public class Exercicio4 {
    public static void main(String[] args) {
        
        Moto ObjetoMoto = new Moto();
        Carro ObjetoCarro =  new Carro();
        
        Scanner Scaninfosveiculo = new Scanner(System.in);

        System.out.println("Qual o modelo da moto");
        ObjetoMoto.modelo = Scaninfosveiculo.nextLine();
        
        System.out.println("Qual ano da moto?");
        ObjetoMoto.ano= Scaninfosveiculo.nextInt();
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
        }while (ObjetoMoto.rodas != 1 && ObjetoMoto.rodas != 2);

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

        }while (ObjetoCarro.porta != 1 && ObjetoCarro.porta != 2);

        if (ObjetoCarro.porta == 1) {
            ObjetoCarro.QntPortas = 4;
        }else{
            System.out.println("Quantas portas?");
            ObjetoCarro.QntPortas = Scaninfosveiculo.nextInt();
            Scaninfosveiculo.nextLine();
        }

        System.out.println("Quantos lugares?");
        ObjetoCarro.lugares = Scaninfosveiculo.nextLine();

        ObjetoCarro.imprimirInformacoes();
        ObjetoCarro.ligaAr();

        ObjetoMoto.imprimirInformacoes();
        ObjetoMoto.empinar();
    }
}