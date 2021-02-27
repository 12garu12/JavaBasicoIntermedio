package com.company;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CarritoDeLaCompraTest {

    @Test
    public void shouldReturnTheCountOfAllItems() throws Exception {

        CarritoBuilder builder = new CarritoBuilder(30);
        CarritoDeLaCompra carritoDeLaCompra = builder.build();
        Assert.assertEquals(30, carritoDeLaCompra.contarNumeroProductos());
    }

    @Test
    public void shouldCalculateTotalPrice() throws Exception {
        CarritoBuilder builder = new CarritoBuilder(60, 5);
        CarritoDeLaCompra carritoDeLaCompra = builder.build();
        Assert.assertEquals(300, carritoDeLaCompra.CalcularPrecioTotal());
    }

    @Test
    public void shouldCalculateTotalPriceLambda() throws Exception{
        CarritoBuilder builder = new CarritoBuilder(80, 5);
        CarritoDeLaCompra carritoDeLaCompra = builder.build();
        Assert.assertEquals(400, carritoDeLaCompra.calcularPrecioTotalLambda());
    }


    @Test
    public void shouldCalculateTotalPriceRefMethod() throws Exception {
        CarritoBuilder builder = new CarritoBuilder(60, 5);
        CarritoDeLaCompra carritoDeLaCompra = builder.build();
        Assert.assertEquals(300, carritoDeLaCompra.calcularPrecioTotalLambda());
    }

    @Test
    public void shouldCalculateTotalDiscount() throws Exception {
        CarritoBuilder builder = new CarritoBuilder(20, 100);
        CarritoDeLaCompra carritoDeLaCompra = builder.build();
        Assert.assertEquals(100, carritoDeLaCompra.calcularDescuentoTotal(100));
    }
    @Test
    public void shouldCalculateTotalDiscountLambda() throws Exception {
        CarritoBuilder builder = new CarritoBuilder(20, 100);
        CarritoDeLaCompra carritoDeLaCompra = builder.build();
        Assert.assertEquals(100, carritoDeLaCompra.CalcurDescuentoTotalLambda(100));
    }

}