package com.bridgelabz;
public class LinkedListMain {
    public static void main(String[] args) {
        System.out.println("WELCOME TO LINKED LIST PROBLEMS USING GENERICS");
        LinkedList<Integer> list = new LinkedList<>();

        // Adding elements to the Linked List
        list.add(56);
        list.add(30);
        list.add(70);

        // Removing the last element from the Linked List
        list.popLast();

        // Printing the Linked List
        list.printList();
        }
    }