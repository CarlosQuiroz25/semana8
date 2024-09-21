package com.mascota.gestion;

public class Tortuga extends Mascota{

    public Tortuga(String nombre, String especie, String raza, int edad, String tamaño, String color,
            String estadoDeSalud) {
        super(nombre, especie, raza, edad, tamaño, color, estadoDeSalud);
        
    }

    @Override
    public void hacerSonido() {
        System.out.println("tss tss");
    }

    @Override
    public void alimentar() {
        System.out.println("La tortuga come lechuga");
    }

    @Override
    public void cuidar() {
        System.out.println("La tortuga la están bañando");
    }

}
