package service;

import model.*;

import java.util.ArrayList;

public class BibliotecaService {

    private ArrayList<Alumno> alumnos;
    private ArrayList<MaterialBibliografico> materiales;
    private ArrayList<Prestamo> prestamos;

    public BibliotecaService() {

        alumnos = new ArrayList<>();
        materiales = new ArrayList<>();
        prestamos = new ArrayList<>();
    }

    public void agregarAlumno(Alumno alumno) {

        alumnos.add(alumno);
    }

    public void agregarMaterial(
            MaterialBibliografico material) {

        materiales.add(material);
    }
    //Se definen los cuatro parámetros necesario para el prestamo
    public void realizarPrestamo(String fechaPrestamo, String fechaDevolucion,
            Alumno alumno,
            MaterialBibliografico material) {

        if (!material.puedePrestarse()) {

            System.out.println("Este material no puede prestarse");

            return;
        }

        prestamos.add(
                new Prestamo(fechaPrestamo, fechaDevolucion, alumno, material));

        material.setDisponible(false);

        System.out.println("Préstamo registrado");
    }

    public void mostrarMateriales() {

        for (MaterialBibliografico material : materiales) {
           //En esta sección se comprueba el Polimorfismo
           // instanceof compara que tipo de instancia es el objeto
           if (material instanceof Libro) 
                System.out.println((Libro)material); // Casting de un objeto
           else if(material instanceof Revista)
                System.out.println((Revista)material);
           else if(material instanceof Periodico)
                System.out.println((Periodico)material);
           else
                System.out.println((Tesis)material);

            System.out.println("------------------");
        }
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public ArrayList<MaterialBibliografico> getMateriales() {
        return materiales;
    }
}