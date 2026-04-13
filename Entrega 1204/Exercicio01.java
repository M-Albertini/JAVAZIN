public class Exercicio01 {

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();

        aluno1.setNome("Cleiton");

        aluno1.setIdade(-100);

        System.out.println("Nome: " + aluno1.getNome());
        System.out.println("Idade gravada: " + aluno1.getIdade());
    }
}

class Aluno {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade >= 0) {
            this.idade = idade;
        } else {
            System.out.println("Erro: A idade não pode ser negativa.");
        }
    }
}