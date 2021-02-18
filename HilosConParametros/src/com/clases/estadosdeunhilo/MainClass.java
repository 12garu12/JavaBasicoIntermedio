package com.clases.estadosdeunhilo;

public class MainClass {

    public static void main(String[] args) throws InterruptedException {

        HiloProceso hilo1 = new HiloProceso();
        HiloProceso hilo2 = new HiloProceso();

        hilo1.start();
        hilo1.sleep(4000);


        hilo2.start();

        hilo2.sleep(3000);
        hilo2.stop();
        hilo2.message();

    }
}
