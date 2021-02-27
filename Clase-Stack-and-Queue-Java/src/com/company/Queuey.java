package com.company;


import java.util.LinkedList;
import java.util.Queue;

public class Queuey {

    LinkedList queue;

    public Queuey(){
        queue = new LinkedList();
    }

    public boolean isEmpty(){
        return queue.isEmpty();
    }

    public int size(){
        return queue.size();
    }

    public void enqueue(int n){
        queue.addLast(n);
    }

    public int dequeue(){
        return (int) queue.remove(0);
    }

    public int peek(){
        return (int) queue.get(0);
    }
    public static void main(String[] args) {

        Queuey cola = new Queuey();
        cola.enqueue(5);
        cola.enqueue(7);
        cola.enqueue(6);

        System.out.println("Primero en salir: " + cola.dequeue());
        System.out.println("echar un vistazo al segundo elemento: " +  cola.peek());
        System.out.println("Segundo en salir: " + cola.dequeue());
        System.out.println("Tercero en salir: " + cola.dequeue());


    }
}
