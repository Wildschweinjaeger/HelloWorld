
package com.arkansascodingacademy.example;

public class HelloWorld {

    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld();
        String phrase = helloWorld.sayHello();
        System.out.println(phrase);
        phrase = helloWorld.harrisonSayHello();
        System.out.println(phrase);
    }
    
    private String sayHello() {
        return "Hello World!";
    }
    
    private String harrisonSayHello() {
        return "Hello from Allie";
    }
}
