package model;

import java.beans.BeanProperty;

public class Alumno {
    private String matricula;
    private String nombre;
    private String carrera;
    private int cuatrimestre;
    private String correo;

    public Alumno(String matricula, String nombre, String carrera, int cuatrimestre, String correo) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.carrera = carrera;
        this.cuatrimestre = cuatrimestre;
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Alumno [matricula=" + matricula + ", nombre=" + nombre + ", carrera=" + carrera + ", cuatrimestre="
                + cuatrimestre + ", correo=" + correo + "]";
    }

    public String getMatricula() {
        return matricula;
    }

     public String mostrarInfo() {
        return "Alumno [matricula=" + matricula + ", nombre=" + nombre + ", carrera=" + carrera + ", cuatrimestre="
                + cuatrimestre + ", correo=" + correo + "]";
    }

    

    
}
