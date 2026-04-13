public class Exercicio10 {

  public static void main(String[] args) {
    Usuario u = new Usuario("Cleiton", "cleiton@email.com", "123456");

    System.out.println("Nome: " + u.getNome());
    System.out.println("Email: " + u.getEmail());
    System.out.println("Senha: " + u.getSenha());
  }
}

class Usuario {
  private String nome;
  private String email;
  private String senha;

  public Usuario(String nome, String email, String senha) {
    this.nome = nome;
    this.email = email;

    if (senha != null && senha.length() >= 6) {
      this.senha = senha;
    } else {
      System.out.println("Erro: senha deve ter pelo menos 6 caracteres.");
      this.senha = "";
    }
  }

  public String getNome() {
    return nome;
  }

  public String getEmail() {
    return email;
  }

  public String getSenha() {
    return senha;
  }
}