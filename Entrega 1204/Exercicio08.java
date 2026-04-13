public class Exercicio08 {

  public static void main(String[] args) {
    Aluno aluno = new Aluno("Cleiton", 15);

    System.out.println("Nome: " + aluno.getNome());
    System.out.println("Nota: " + aluno.getNota());
  }
}

class Aluno {
  private String nome;
  private double nota;

  public Aluno(String nome, double nota) {
    this.nome = nome;
    if (nota >= 0 && nota <= 10) {
      this.nota = nota;
    } else {
      System.out.println("Erro: nota deve estar entre 0 e 10.");
      this.nota = 0;
    }
  }

  public String getNome() {
    return nome;
  }

  public double getNota() {
    return nota;
  }
}