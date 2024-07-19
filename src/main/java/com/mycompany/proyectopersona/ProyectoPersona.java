package com.mycompany.proyectopersona;

public class ProyectoPersona {
    public static void main(String[] args) {
        Doctor doctor = new Doctor("Juan Pérez", 45, "Cardiología");
        Deportista deportista = new Deportista("Ana Gómez", 28, "Fútbol");

        System.out.println("Información del Doctor:");
        doctor.mostrarInformacion();

        System.out.println("\nInformación del Deportista:");
        deportista.mostrarInformacion();
    }
}
