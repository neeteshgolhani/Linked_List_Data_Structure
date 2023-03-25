package com.bridgelabz;

import java.util.HashMap;

public class LinkedList<T> {
    Node<T> head;

    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void printList() {
        Node<T> current = head;
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.print("null");
    }
}