package com.mascota.gestion;

public class Main {
    public static void main(String[] args) {
        Perro perro = new Perro("Daniel", "Canino", "labrador", 3, "mediano", "Café", "Saludable");
        perro.hacerSonido();
        perro.alimentar();
        perro.cuidar();
        perro.mostrarInformacion();

        System.out.println("****************************");

        Gato gato = new Gato("Pepe", "Manchado", "Ojos verdes", 5, "Pequeño", "Blanco", "Enfermo");
        gato.hacerSonido();
        gato.alimentar();
        gato.cuidar();
        gato.mostrarInformacion();

        System.out.println("****************************");

        Pajaro pajaro = new Pajaro("Juan", "Emplumado", "Pico corto", 6, "Pequeño", "Amarillo", "Saludable");
        pajaro.hacerSonido();
        pajaro.alimentar();
        pajaro.cuidar();
        pajaro.mostrarInformacion();

        System.out.println("****************************");

        Tortuga tortuga = new Tortuga("Lina", "De mar", "Dientona", 20, "Mediano", "Marrón", "Crítico");
        tortuga.hacerSonido();
        tortuga.alimentar();
        tortuga.cuidar();
        tortuga.mostrarInformacion();
    }
}