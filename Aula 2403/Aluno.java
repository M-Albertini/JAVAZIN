import java.util.ArrayList;

public class Aluno { //Declaro a classe aluno
     
    String nome;
    int idade;
    
public class  main {
    
    public static void main (String[] args) {
            
        ArrayList<Aluno> alunos = new ArrayList<>(); // Declaro o array list

        Aluno aluno1 =new Aluno(); // crio o objeto aluno1 usando as variaveis da classe aluno
        aluno1.nome = "Maria";
        aluno1.idade = 34;
        
        
        Aluno aluno2 =new Aluno(); // criação do objeto 2
        aluno2.nome = "Henrrique";
        aluno2.idade = 34;

    
        Aluno aluno3 =new Aluno();  // criação do objeto 3
        aluno3.nome = "Freeza Maria";
        aluno3.idade = 12;

        alunos.add(aluno1); //adiciono as informações do objetos aluno no array list 
        alunos.add(aluno2); //adiciono as informações do objetos aluno2 na lista de array/\
        alunos.add(aluno3);

        for (Aluno a: alunos){ //O for atua varrendo o array list tento a informação guardada dentro do "a"
            System.out.println(a.nome);
            // System.out.println(a.idade); // para exibir a informação
        }
    }
}
}
