package com.company.list;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListasJava {

    public static void main(String[] args) {
        List<Integer> prices = Arrays.asList(28, 28, 43, 56, 53);

        // sumar los elementos de la lista.
        int total = prices.stream().mapToInt(Integer::intValue).sum();

        //Organiza la lista en orden acendente
        prices = prices.stream().sorted().collect(Collectors.toList());



    }





}
