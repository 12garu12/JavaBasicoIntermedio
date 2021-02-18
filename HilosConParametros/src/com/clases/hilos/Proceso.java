package com.clases.hilos;

public class Proceso extends Thread{

    private int numInteger;

    public Proceso(String nombreHilo){
        super(nombreHilo);
    }


    @Override
    public void run() {
        for (int i = 0; i <= numInteger; i++) {
            System.out.println(i + " --> " +this.getName());
        }
        System.out.println();
    }

    public void setNumInte(int numInteger) {
        this.numInteger = numInteger;
    }

}
