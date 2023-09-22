package ru.mirea.pract02var5;

import java.lang.*;

public class TestFact {
    public static void main(String[] args){
        Fact f1 = new Fact(10);
        f1.calculateFactorial();
        System.out.println(f1);
    }
}