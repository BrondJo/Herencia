package org.example;

/**
 * @author joelbrondo
 */
public class Main {
    public static void main(String[] args) {

        Vehiculo auto = new Vehiculo("Toyota", "Corolla", 2020);
        Coche autito = new Coche("Ford", "Mustang", 2021, 5000);

        System.out.println("Marca: "+auto.getMarca());
        System.out.println("Modelo: "+auto.getModelo());
        System.out.println("Año: "+auto.getAnio());
        auto.acelerar();
        auto.frenar();
        System.out.println("----------------------------");
        System.out.println("Marca: "+autito.getMarca());
        System.out.println("Modelo: "+autito.getModelo());
        System.out.println("Año: "+autito.getAnio());
        System.out.println("Cilindrada: "+autito.getCilindrada());
        autito.acelerar();



    }
}