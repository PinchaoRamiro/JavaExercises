package modulo2;
public class Book {
  private String titulo;
  private String autor;
  private int year;

  public Book(String titulo, String autor, int year) {
      this.titulo = titulo;
      this.autor = autor;
      this.year = year;
  }

  // Métodos getters
  public String getTitulo() {
      return titulo;
  }

  public String getAutor() {
      return autor;
  }

  public int getYear() {
      return year;
  }

  @Override
  public String toString() {
      return "Book{\n" +
              "titulo='" + titulo + '\n' +
              "autor='" + autor + '\n' +
              "year=" + year +
              '}';
  }
}
