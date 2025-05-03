package org.example;

public class Calculator {
    int a;
    int b;
    Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }
    int addition(){
        return a+b;
    }
    int Subtraction(){
        return a-b;
    }
    int Multiplication(){
        return a*b;
    }
    int Division(){
        return (a/b);
    }
}
