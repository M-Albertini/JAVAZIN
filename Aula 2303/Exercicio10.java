public class Exercicio10 {
    //Aqui declaro todas as variaveis que vou usar
    String nome,cidade, disciplina;
    
    void ImprimirUniversidade(){
        System.out.println("Sua universidade é: " + nome);
        System.out.println("Ela é na cidade:" + cidade);
    }

    void ImprimirProfessor(){
        System.out.println(" Seu professe de: " + disciplina);
        System.out.println("Ele se chamna: "+ nome );
    }

    public static void main(String[] args) {
        //Instanciar o objeto (criar)

        Exercicio10 Universidade = new Exercicio10();  //Crio o objeto Universidade

        Universidade.nome = "Universidade Positivo"; //Insiro os valores nas variaveis dentro do objeto Universidade
        Universidade.cidade = "Cambe";

        Exercicio10 Professor = new Exercicio10();

        Professor.nome = "Detoni";
        Professor.disciplina = "Banco de dados";

        Professor.ImprimirProfessor(); //Chamo a impressão
        Universidade.ImprimirUniversidade();

    }
}
