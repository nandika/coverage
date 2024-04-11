package com.example;

/**
 * Hello world!
 */
public class App {

    private  String s;
    public App(String s) {
        this.s = s;
    }
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int substract(int a, int b){
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a/b;
    }
}
