package com.clases.sincronizaciondehilos;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Hilo1 hilo1 = new Hilo1();
        Hilo2 hilo2 = new Hilo2();
        Hilo3 hilo3 = new Hilo3();
        Hilo4 hilo4 = new Hilo4();

        hilo1.start();
        hilo1.sleep(60);

        hilo2.start();
        hilo2.sleep(10);

        hilo3.start();
        hilo3.sleep(10);

        hilo4.start();
        hilo4.sleep(10);

    }

}
