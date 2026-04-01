class Aluno{

    String nome;
    int idade;

    public Aluno (String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
}

public class Exercicio2 {

    public static void main(String[] args) {
        Aluno a= new Aluno("Duda", 24);
        System.out.println(" O nome é :" + a.nome);
        System.out.println(" O nome é :" + a.idade);
    }
}