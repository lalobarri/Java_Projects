package model;

public abstract class MaterialBibliografico {
    //Se define como una clase abstracta
    protected String codigo;
    protected String titulo;
    protected boolean disponible;
    
    //Se define almenos un método abstractato
    public abstract boolean puedePrestarse();

    // Se generó similar al método toString
    // Investigar sobre el meptodo toString...
    public String toString() {
        return "MaterialBibliografico [codigo=" + codigo 
        + ", titulo=" + titulo 
        + ", disponible=" + disponible+ "] \n";
    }
    //Método para construir objetos de la clase: MaterialBibliogrfico
    public MaterialBibliografico(String cod, String titulo, boolean disponible) {

        this.codigo = cod;
        this.titulo = titulo;
        this.disponible = disponible;
        
    }

    public String getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }
    //En el caso de los atribito booleano en lugar de Get será is
    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    

} //Cierra la clase
