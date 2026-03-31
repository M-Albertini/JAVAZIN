class veiculo  {
    String marca;
    String modelo;
}
class carro extends veiculo{
    int portas;
}
class moto extends veiculo{
    int cilindradas;
}

public class Exercicio3 {

    public static void main(String[] args) {
        
    

    moto motona = new moto(); // declaro os objetos para unir as variaveis
    carro carrao = new carro();

    motona.marca = "Honda";
    motona.modelo ="Tornado";
    motona.cilindradas= 150;
    
    System.out.println("Marca da moto:" + motona.marca);
    System.out.println("Marca da moto:" + motona.modelo);
    System.out.println("Marca da moto:" + motona.cilindradas);

    carrao.marca= "Volks";
    carrao.modelo = "G3";
    carrao.portas = 4;

    System.out.println("Marca da moto:" + carrao.marca);
    System.out.println("Marca da moto:" + carrao.modelo);
    System.out.println("Marca da moto" + carrao.portas);

    }
}
