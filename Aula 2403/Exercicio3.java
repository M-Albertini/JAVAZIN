import java.util.ArrayList;
import java.util.Scanner;

class Produto {

    String nprod;
    double preco;
};

class pedido {
    String nome;

    int Npedido = 0;

};
class carrinho{

    ArrayList<pedido> carrinhos =new ArrayList<>(); // criando um array para lincar em 
}

public class Exercicio3 {

    public static void main (String[] args) {
            
            class menu {
                System.out.println("====================");
                System.out.println("1- Fazer pedido");
                System.out.println("2- Cadastrar produto");
                System.out.println("3- Consultar pedido");
                System.out.println("====================");
            };

                int i =0;

                Exercicio3.menu();
           
                ArrayList<pedido> ped = new ArrayList<>(); //Criando um array list para pedidos 
                ArrayList<Produto> prod = new ArrayList<>(); //Array list declarado
           
                for  (i =0; i<2; i++){ //Usa o i para repetir 3 vezes
                
                pedido f = new pedido();
                Produto p = new Produto();// instanciando (criando) o objeto p para funcionar como um mini array guardando em apenas um lugar
                
                Scanner entrada = new Scanner(System.in); // atribui o valor que o usuario digitar
                System.out.println("Qual o produto"); //pergunta para o usuario o qu quer
                      
                p.nprod = entrada.nextLine(); //nprod recebe o valor, que é armazenado no objeto "p" 

                Scanner entrada2 = new Scanner(System.in); 
                System.out.println("Qual o preço");

                p.preco = entrada2.nextInt();//preco recebe o valor e já armazena em p

                f.Npedido = i;

                prod.add(p);
                ped.add(f);
            }
    
            

    for(Produto a:prod)
    {
        System.out.println(a.nprod);
        System.out.println(a.preco);
}
}
}
