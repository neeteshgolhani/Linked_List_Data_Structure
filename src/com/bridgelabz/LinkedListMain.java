package com.bridgelabz;
public class LinkedListMain {
    public static void main(String[] args) {
        System.out.println("WELCOME TO LINKED LIST PROBLEMS USING GENERICS");
        LinkedList<Integer> list = new LinkedList<>();
        list.add(56);
        list.add(30);
        list.add(40);
        list.add(70);
        Node<Integer> node = list.search(40);
        list.delete(40);
        list.printList();
        System.out.println();
        System.out.println("Size: " + list.size());
    }
}