import java.util.ArrayList;
import java.util.Scanner;

class Produto {

    String nprod;
    double preco;
};

public class Exercicio2 {

    public static void main (String[] args) {
                int i =0;
           
                ArrayList<Produto> prod = new ArrayList<>(); //Array list declarado
           
                for  (i =0; i<2; i++){ //Usa o i para repetir 3 vezes

                Produto p = new Produto();// instanciando (criando) o objeto p para funcionar como um mini array guardando em apenas um lugar
                
                Scanner entrada = new Scanner(System.in); // atribui o valor que o usuario digitar
                System.out.println("Qual o produto"); //pergunta para o usuario o qu quer
                      
                p.nprod = entrada.nextLine(); //nprod recebe o valor, que é armazenado no objeto "p" 

                Scanner entrada2 = new Scanner(System.in); 
                System.out.println("Qual o preço");

                p.preco = entrada2.nextInt();//preco recebe o valor e já armazena em p

                prod.add(p);
            }
    
    
    for(Produto a:prod)
    {
        System.out.println(a.nprod);
        System.out.println(a.preco);
}
}
}
