package model;
import model.MaterialBibliografico;

public class Libro extends MaterialBibliografico{

    private String autor;
    private String isbn;
    private String editorial;
    private int paginas;
    
    public Libro(String cod, String titulo, boolean disponible, String autor, String isbn,
            String editorial, int paginas) {
        super(cod, titulo, disponible);
        this.autor = autor;
        this.isbn = isbn;
        this.editorial = editorial;
        this.paginas = paginas;
    }

    @Override
    public String toString() {
        return "Libro [codigo=" + codigo + ", titulo=" + 
        titulo + ", autor=" + autor + ", disponible=" + disponible
                + ", isbn=" + isbn + ", editorial=" + editorial + ", paginas="
                + paginas + "]";
    }

    @Override
    public boolean puedePrestarse() {
        // El libro si se puede prestar
        return true;
    }

   
    
    

    


    
}
