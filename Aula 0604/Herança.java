class Funcionario {
    String nome;
    double salario;

        public Funcionario(String nome, double salario){
            this.nome = nome;
            double bonus = salario * 0.10;
            this.salario = salario + bonus;
        }    
}

public class Herança {

    public static void main(String[] args) {
        
        Funcionario objFuncionario = new Funcionario("Carlos",2000 );//Cria o objeto e já atribui os valores para as variaveis da classe
        System.out.println("O nome é: " + objFuncionario.nome + "e o salario é: " + objFuncionario.salario);// chama o objeto que já possui os valores dentro do construtor
    }
}