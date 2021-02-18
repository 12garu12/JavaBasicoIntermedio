package com.clases.estadosdeunhilo;

public class HiloProceso extends Thread{


    @Override
    public void run() {
        for (int i = 0; i <= 5 ; i++) {

            System.out.println(i + " " + this.getName());

            try {
                HiloProceso.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Error en el hilo " + e);
                e.printStackTrace();
            }
        }
        System.out.println();
    }



    public void message(){
        System.out.println("termino el proceso");
    }
}
