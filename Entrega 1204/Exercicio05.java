public class Exercicio05 {

  public static void main(String[] args) {
    Livro livro = new Livro("O Hobbit", "Tolkien", 310);

    System.out.println("Título: " + livro.getTitulo());
    System.out.println("Autor: " + livro.getAutor());
    System.out.println("Páginas: " + livro.getPaginas());
  }
}

class Livro {
  private String titulo;
  private String autor;
  private int paginas;

  public Livro(String titulo, String autor, int paginas) {
    this.titulo = titulo;
    this.autor = autor;
    this.paginas = paginas;
  }

  public String getTitulo() {
    return titulo;
  }

  public String getAutor() {
    return autor;
  }

  public int getPaginas() {
    return paginas;
  }
}