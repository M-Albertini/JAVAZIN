class Animal {

    String nome ;
}

class Cachorro extends Animal {
    String raca;
}

public class Exercicio2 {

    public static void main(String[] args) {
    
        Cachorro cachorro1 = new Cachorro();
        
        cachorro1.nome =  "Magalu";
        cachorro1.raca = "Vira-Lata";

        System.out.println("O nome do cachorro é:" + cachorro1.nome);
        System.out.println("O nome do cachorro é:" + cachorro1.raca);

    }
    
}
