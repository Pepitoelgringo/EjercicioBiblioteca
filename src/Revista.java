public class Revista extends Publicacion {
    private int numerorevista;
    private boolean prestado=false;
    public Revista(String isbn, String titulo, int anio, int numerorevista) {
        super(isbn, titulo, anio);
        this.numerorevista = numerorevista;
    }
    public void prestarevista() {
        if (!prestado) {
            prestado = true;
            System.out.println("Revista prestada");
        }
        else {
            System.out.println("La revista ya se ha prestado a otra persona");
        }
    }

    public void devuelverevista() {
        if (prestado) {
            prestado = false;
            System.out.println("Revista devuelta");
        } else {
            System.out.println("Esa revista no esta prestada en este momento.");
        }
    }
    public boolean estaprestadorevista() {
        if (!prestado) {
            System.out.println("Esa revista no está prestada");
            return false;
        } else {
            System.out.println("Esa revista está prestada");
            return true;
        }
    }
    public int getNumerorevista() {
        return numerorevista;
    }

    public void setNumerorevista(int numerorevista) {
        this.numerorevista = numerorevista;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }
}
