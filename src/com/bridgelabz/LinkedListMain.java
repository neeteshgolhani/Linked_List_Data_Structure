package com.bridgelabz;
public class LinkedListMain {
    public static void main(String[] args) {
        System.out.println("WELCOME TO LINKED LIST PROBLEMS USING GENERICS");
        LinkedList<Integer> list = new LinkedList<>();

        // Adding elements to the Linked List
        list.add(56);
        list.add(70);

        // Inserting element 30 between 56 and 70
        list.insert(30, 1);

        // Printing the Linked List
        list.printList();
    }
}