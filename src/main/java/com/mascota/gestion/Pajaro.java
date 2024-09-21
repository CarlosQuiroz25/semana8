package com.mascota.gestion;

public class Pajaro extends Mascota{

    public Pajaro(String nombre, String especie, String raza, int edad, String tamaño, String color,
            String estadoDeSalud) {
        super(nombre, especie, raza, edad, tamaño, color, estadoDeSalud);
       
    }

    @Override
    public void hacerSonido() {
        System.out.println("Brrr Brrrr");
    }

    @Override
    public void alimentar() {
        System.out.println("Al pajaro lo están alimentando");
    }

    @Override
    public void cuidar() {
        System.out.println("Al pájaro lo están acostando");
    }

}
