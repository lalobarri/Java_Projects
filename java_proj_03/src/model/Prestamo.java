package model;

import java.util.Arrays;

public class Prestamo {
    private String fechaPrestamo;
    private String fechaDevolucion;
    private boolean entregado; //Para ser llenado al momento de la entrega

    private Alumno alumno;
    private MaterialBibliografico material;

    public Prestamo(String fechaPrestamo, String fechaDevolucion, Alumno alumno, MaterialBibliografico material) {
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        this.alumno = alumno;
        this.material = material;
        this.entregado = false;
    }

    @Override
    public String toString() {
        return "Prestamo [fechaPrestamo=" + fechaPrestamo + ", fechaDevolucion=" + fechaDevolucion + ", alumno="
                + alumno + ", material=" + material + "Entregado: "+entregado+"]";
    }

    public void setEntregado(boolean entregado) {
        this.entregado = entregado;
    }
    public boolean isEntregado() {
        return entregado;
    }

    
    
}
