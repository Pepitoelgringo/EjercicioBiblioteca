public class Libro extends Publicacion {
    private boolean prestado=false;

    public Libro(String isbn, String titulo, int anio) {
        super(isbn, titulo, anio);
    }


    public void prestalibro() {
        if (!prestado) {
            prestado = true;
            System.out.println("Libro prestado");
        }
        else {
            System.out.println("Ese libro no se encuentra disponible en estos momentos");
        }
    }

    public void devuelvelibro() {
        if (prestado) {
            prestado = false;
            System.out.println("Libro devuelto");
        } else {
            System.out.println("Ese libro no esta prestado en este momento.");
        }
    }

    public boolean estaprestadolibro() {
        if (!prestado) {
            System.out.println("Ese libro no está prestado");
            return false;
        } else {
            System.out.println("Ese libro está prestado");
            return true;
        }
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }
}
