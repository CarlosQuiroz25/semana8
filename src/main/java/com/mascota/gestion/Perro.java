package com.mascota.gestion;

public class Perro extends Mascota {

    public Perro(String nombre, String especie, String raza, int edad, String tamaño, String color,
            String estadoDeSalud) {
        super(nombre, especie, raza, edad, tamaño, color, estadoDeSalud);
        
    }

    @Override
    public void hacerSonido() {
        System.out.println("Guuaaauuu");
    }

    @Override
    public void alimentar() {
        System.out.println("El perro está comiendo");
    }

    @Override
    public void cuidar() {
        System.out.println("El perro lo están bañando");
    }

}
