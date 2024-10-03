package org.example;

public class Calculator {

    public int summ(int a, int b){
        int result;
        result = a + b;
        System.out.printf("Сумма %d и %d равна %d",a ,b, result);
        return result;
    }

    public int sub(int a, int b){
        int result;
        result = a - b;
        System.out.printf("Разница %d и %d равна %d",a ,b, result);
        return result;
    }

}
