class Pessoa {

    String nome;
    int idade;

    public Pessoa(String nome, int idade) {

        this.nome = nome;
        this.idade = idade;
    }
}

public class Exercicio1 {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Maria", 25);
        System.out.println(p.nome + "-" + p.idade);
    }
}
