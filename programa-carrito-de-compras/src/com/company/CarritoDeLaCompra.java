package com.company;

import java.util.Collection;

public class CarritoDeLaCompra {

    private Collection<Integer> precios;

    public CarritoDeLaCompra(Collection<Integer> precios){
        this.precios = precios;
    }

    public int CalcularPrecioTotal(){
        int precioTotal = 0;
        for (Integer precio : precios) {
            precioTotal += precio;
        }
        return precioTotal;
    }

    public int contarNumeroProductos(){
        return precios.size();
    }

    public int calcularPrecioTotalLambda(){
        int precioToTal = this.precios.stream().mapToInt(Integer::intValue).sum();
        return precioToTal;
    }

    public long calcularDescuentoTotal(int cantidadConDescuento){

        long descuentoTotal = 0;

        for(Integer precio : precios){
            if(precio >= cantidadConDescuento){
                descuentoTotal += (cantidadConDescuento*5)/100;
            }
        }
        return descuentoTotal;
    }

    public long CalcurDescuentoTotalLambda(int cantidadConDescuento){
        long descuentoTotal = 0;
        Long numeroDeDescuentos = this.precios.stream().filter(precio -> precio.intValue() >= cantidadConDescuento).count();
        descuentoTotal = (cantidadConDescuento * 5 / 100) * numeroDeDescuentos;
        return descuentoTotal;
    }

}
