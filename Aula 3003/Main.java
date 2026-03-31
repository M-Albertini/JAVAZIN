class Pessoa {
        String nome;
        int idade;
     }



class Aluno extends Pessoa{ //extend faz ela erdar as variaveis da classe pessoa

        String curso;
    }

class Professor extends Pessoa {
    String disciplina;

    
}


    public class Main{
     public static void main(String[] args) {
             
            Aluno aluno1 = new Aluno();

            aluno1.nome ="Ana;";
            aluno1.idade = 20;
            aluno1.curso ="ADS";

            System.err.println(aluno1.nome);
            System.err.println(aluno1.idade);
            System.err.println(aluno1.curso);
        }
    }

