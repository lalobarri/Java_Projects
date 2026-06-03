package model;


public class Periodico extends MaterialBibliografico{
    private String fechaPub;
    private String nombre;
    private String seccion;

    //Constructor de la clase Periodico
    public Periodico(String cod, String titulo, boolean disponible, String fechaPub,
            String nombre, String seccion) {
        super(cod, titulo, disponible); //Invoca constructor Padre
        this.fechaPub = fechaPub;
        this.nombre = nombre;
        this.seccion = seccion;
    }

    //Método sobre-escrito: mostrarInfo

    @Override
    public String toString() {
        return "Periodico [codigo=" + codigo + ", fechaPub=" + fechaPub + ", titulo=" + titulo + ", nombre=" + nombre
                + ", disponible=" + disponible + ", seccion=" + seccion + "]";
    }

    @Override
    public boolean puedePrestarse() {
        // Si se puede prestar
        return true;
    }

    

    

    
    

}
