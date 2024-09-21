package com.mascota.gestion;

public class Gato extends Mascota{

    public Gato(String nombre, String especie, String raza, int edad, String tamaño, String color, String estadoDeSalud) {
        super(nombre, especie, raza, edad, tamaño, color, estadoDeSalud);
        
    }

    @Override
    public void hacerSonido() {
        System.out.println("Miauuu");
    }

    @Override
    public void alimentar() {
        System.out.println("El gato lo están alimentando");
    }

    @Override
    public void cuidar() {
        System.out.println("Al gato lo están cepillando");
    }

}
