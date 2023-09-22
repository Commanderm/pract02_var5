package ru.mirea.pract02var5;

import java.lang.*;

public class Fact {

    private int n;
    double fact = 1;

    public Fact(int n){
        this.n = n;
    }

    public double calculateFactorial() {
        while (n != 0) {
            fact *= n;
            n--;
        }
        return fact;
    }

    public String toString() {
        return "Factorial number's is "+ fact;
    }
}
