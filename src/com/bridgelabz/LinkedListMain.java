package com.bridgelabz;
public class LinkedListMain {
    public static void main(String[] args) {
        System.out.println("WELCOME TO LINKED LIST PROBLEMS USING GENERICS");
        SortedLinkedList<Integer> list = new SortedLinkedList<>();
        list.add(56);
        list.add(30);
        list.add(40);
        list.add(70);
        list.printList(); // Output: 30 40 56 70

    }
}