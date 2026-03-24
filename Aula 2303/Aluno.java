public class Aluno {
 
    String nome;
    int idade;
    String curso;
    String cpf;

    void apresentar(){
        System.out.println("Meu nome:" + nome);
        System.out.println("Minha idade é:" + idade);
        System.out.println("Meu curso é:" + curso);
        System.out.println("O numero do meu CPF é: " + cpf);

    }
    void estudar(){
       System.out.println("O aluno esta estudando!");
    }



public static void main (String[] args) {
        //Instanciando o objeto aluno
    Aluno aluno1 = new Aluno();

    aluno1.nome = "Maria Eduarda";
    aluno1.idade = 34;
    aluno1.curso = "ADS";
    aluno1.cpf ="042225917";

    aluno1.apresentar();
    aluno1.estudar();
    
}
}
