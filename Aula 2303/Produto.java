// Criando a classe (sem valor na variavel)
public class Produto {

    static String nome;
    Double preco;
    int quantidade;

    //Se não criar esse metodo ele não pega os valores
   void Imprimir() {
        System.out.println("O produto é: " + this.nome);
        System.out.println("O produto é: " + preco);
        System.out.println("O produto é: " + quantidade);
    }
  
public static void main (String[] args){
    //Instancia o produto
    Produto produto1 = new Produto();
    //Atribuindo os valores par as variaveis dentro do objeto 
    produto1.nome = "Impressora";
    produto1.preco = 49.99;
    produto1.quantidade = 2;
    
    produto1.Imprimir();    //Chama para exibir em tela
}
};