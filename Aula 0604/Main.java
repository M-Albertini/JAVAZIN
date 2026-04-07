import java.util.ArrayList;

// Classe pai
class Produto {
    public String nome;
    public double preco;

    Produto(String nome, double preco) {// construtor, é chamado na classe filha
        this.nome = nome;
        this.preco = preco;
    }
}

// Classe filha
class ProdutoFisico extends Produto {
    double peso;

    ProdutoFisico(String nome, double preco, double peso) {
        super(nome, preco); // Chama o construtor da classe Pai.
        this.peso = peso;
    }
}

// Classe filha
class ProdutoDigital extends Produto {
    double tamanhoArquivo;

    ProdutoDigital(String nome, double preco, double tamanhoArquivo) {
        super(nome, preco); // chamando o construtor da classe Pai
        this.tamanhoArquivo = tamanhoArquivo;
    }
}

class Carrinho {

    ArrayList<Produto> produtos = new ArrayList<>();

    void AdicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    void listarProdutos(){
        for(Produto p: produtos){
            System.out.println("Nome: " + p.nome);
            System.out.println("Preço: " + p.preco);
       
       if(p instanceof ProdutoFisico){
        ProdutoFisico pf= (ProdutoFisico)p;
        System.out.println("Peso: " + pf.peso + "kg");
        }
        if (p instanceof ProdutoDigital) {
        ProdutoDigital pd =(ProdutoDigital) p;
        System.out.println("Tamanho do arquivo: "+ pd.tamanhoArquivo + "Mb");
        
    }
       
       
        }

    

    void calcularTotal() {
        double total =0;
        for(Produtos p: produtos){
            total +=p.preco;
        }
        System.out.println("total de compras: R$: " + total);
    }



    }

}

public class Main {

    public static void main(String[] args) {
        ProdutoFisico p1 = new ProdutoFisico("Notebook", 3000, 2.5);
        ProdutoDigital p2 = new ProdutoDigital("Curso De Java", 500, 1500);

        Carrinho carrinho = new Carrinho();

        carrinho.AdicionarProduto(p1);
        carrinho.AdicionarProduto(p2);

        carrinho.listarProdutos();
        carrinho.calcularTotal();

    }
}