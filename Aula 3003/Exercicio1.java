class pessoa{
        String nome;
        int idade;
    }
    
    class Funcionario extends pessoa{
        double salario;
    }

public class Exercicio1 {
      public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario();


        funcionario1.nome = "Henrique";
        funcionario1.idade = 25;
        funcionario1.salario = 5000;

        System.out.println(funcionario1.nome);
        System.out.println(funcionario1.idade);
        System.out.println(funcionario1.salario);
    }
}


  