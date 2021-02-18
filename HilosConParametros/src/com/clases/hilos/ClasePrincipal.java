package com.clases.hilos;

public class ClasePrincipal {

    public static void main(String[] args) {
	// write your code here
        Proceso hilo1 = new Proceso("hilo1");
        Proceso hilo2 = new Proceso("hilo2");
        Proceso hilo3 = new Proceso("hilo3");

        hilo1.setNumInte(5);
        hilo2.setNumInte(10);
        hilo3.setNumInte(8);

        hilo1.start();
        hilo2.start();
        hilo3.start();
    }
}
