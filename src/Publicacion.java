public class Publicacion {
    private String isbn;
    private String titulo;
    private int anio;
    public Publicacion(String isbn, String titulo, int anio) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "Publicacion{" +
                "isbn='" + isbn + '\'' +
                ", titulo='" + titulo + '\'' +
                ", anio=" + anio +
                '}';
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
}