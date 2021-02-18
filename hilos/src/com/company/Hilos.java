package com.company;

public class Hilos {

    public static void main(String[] args) {
	// write your code here

        Proceso1 hilo1 = new Proceso1(); // Esta clase se instancia directamente por que se hereda de la clase Thread.
        Proceso1 hilo3 = new Proceso1();
        Thread hilo2 = new Thread(new Proceso2()); // El proceso con la clase Proceso dos es por que implementa la interface Runnable.

        // Metodo para poder arrancar nuestros hilos
        hilo1.start();
        hilo3.start();
        hilo2.start();

    }
}
