package com.bridgelabz;

public class LinkedListMain {
    public static void main(String[] args) {
        System.out.println("WELCOME TO LINKED LIST PROBLEMS USING GENERICS");

        LinkedList<Integer> list = new LinkedList<>();
        list.add(56);
        list.add(30);
        list.add(70);
        System.out.println(list.get(0)); // prints 56
        System.out.println(list.get(1)); // prints 30
        System.out.println(list.get(2)); // prints 70
    }
}