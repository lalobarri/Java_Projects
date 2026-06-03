package model;

public class Tesis extends MaterialBibliografico {

    private String autor;
    private String carrera;

    public Tesis(
            String codigo,
            String titulo,
            String autor,
            String carrera) {

        super(codigo, titulo, true);

        this.autor = autor;
        this.carrera = carrera;
    }

    @Override
    public boolean puedePrestarse() {
        return false;
    }

    @Override
    public String toString() {
        return "Tesis [autor=" + autor + ", carrera=" + carrera + ", codigo=" + codigo + ", titulo=" + titulo
                + ", disponible=" + disponible + "]";
    }

    

}