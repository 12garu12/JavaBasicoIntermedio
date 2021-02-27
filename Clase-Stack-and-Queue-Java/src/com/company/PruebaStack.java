package com.company;

import java.util.Stack;

public class PruebaStack {
    /*
    vamos a hablar de la clase Stack. La clase Stack extiende a la clase Vector para implementar una estructura de datos
    de tipo pila. Funciona como las pilas que conocéis y básicamente tiene los métodos push (apilar), pop (desapilar),
    peek (cima) y empty (esta vacia).
    */

    public static void main(String[] args) {
	// write your code here

        Stack<Number> pila = new Stack<>(); // Se crea una instancia de la clase Stack;

        // Coloca cada elemento en orden indexado.
        pila.push(10);
        pila.push(6);
        pila.push(2);
        pila.push(5);
        pila.push(1);

        // Elimina el ultimo elemento de la pila y devuelve ese objeto como el valor de esta función.
        pila.pop();

        //Mira el objeto en la parte superior de esta pila sin quitarlo de la pila, osea el del indice mayor.
        System.out.println(pila.peek());

        //Prueba si esta pila está vacía, y retorna un booleano.
        System.out.println(pila.empty());

        // Devuelve la posicion en orden ascendente empezando por el ultimo indice que es el numero 1.
        System.out.println(pila.search(5));

        // Elimina el elemento segun su indice.
        System.out.println(pila.remove(0));

        // agrega un elemento al final de la pila osea el ultimo indice.
        System.out.println(pila.add(15));

        System.out.println(pila.equals(pila));

        for (int i = 0; i < pila.size(); i++) {
            System.out.println( i + ": " + pila.get(i) + " search: " + pila.search(pila.get(i)));
        }


    }
}
