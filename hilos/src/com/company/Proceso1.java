package com.company;

public class Proceso1 extends Thread{

    // Metodo obligatorio para utilizar los hilos en java
    @Override
    public void run() {
        for (int i = 0; i < 5 ; i++) {
            System.out.println("Proceso 1");
        }
    }
}
