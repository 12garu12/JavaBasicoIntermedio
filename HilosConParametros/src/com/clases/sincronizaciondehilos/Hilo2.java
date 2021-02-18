package com.clases.sincronizaciondehilos;

public class Hilo2 extends Thread{

    @Override
    public void run() {
        for (int i = 0; i <= 20 ; i++) {
            System.out.print("E");
            try {
                Hilo2.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Error en el hilo " +  this.getName());
            }
        }
    }

}
