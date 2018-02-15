package com.anncode.util;

import com.anncode.internal.CalculadoraHelper;

public class Calculadora {

    CalculadoraHelper calculadoraHelper = new CalculadoraHelper();
    public int suma(int i, int j){
        return calculadoraHelper.suma(i,j);
    }

    public int suma(double i, double j){
        return (int)(i+j);
    }
}
