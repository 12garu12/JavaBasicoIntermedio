package com.company.enteros;

import java.security.PublicKey;
import java.util.Arrays;
import java.util.List;

public class Enteros {


    public static void main(String[] args) {

        int[] arr = {2, 4, 34, 64, 29, 100, 1};

        // Organiza la matriz de menor a mayor
        int[] arrSorted = Arrays.stream(arr).sorted().toArray();

        // Obtiene el numero mayor de un array
        int max = Arrays.stream(arr).max().getAsInt();

        // Obtine el numero menor de un array
        int min = Arrays.stream(arr).min().getAsInt();

        // obtiene la suma de todos los
        int sum = Arrays.stream(arr).sum();

        // cuenta los elementos del array
        int count = (int) Arrays.stream(arr).count();







    }

}
