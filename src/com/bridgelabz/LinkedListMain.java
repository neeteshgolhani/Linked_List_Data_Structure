package com.bridgelabz;
public class LinkedListMain {
    public static void main(String[] args) {
        System.out.println("WELCOME TO LINKED LIST PROBLEMS USING GENERICS");
        LinkedList<Integer> list = new LinkedList<>();

        // Adding elements to the Linked List in the sequence 56->30->70
        list.add(56);
        list.add(30);
        list.add(70);

        // Printing the Linked List
        list.printList();
    }
}