package com.bridgelabz;
public class LinkedListMain {
    public static void main(String[] args) {
        System.out.println("WELCOME TO LINKED LIST PROBLEMS USING GENERICS");
        LinkedList<Integer> list = new LinkedList<>();

        // Adding elements to the Linked List
        list.add(56);
        list.add(30);
        list.add(70);

        // Removing the first element from the Linked List
        list.pop();

        // Printing the Linked List
        list.printList();
    }
}