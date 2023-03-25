package com.bridgelabz;

import java.util.HashMap;

public class LinkedList<T> {
    private Node<T> head;
    private HashMap<Integer, Node<T>> map;
    private int size;

    public LinkedList() {
        head = null;
        map = new HashMap<>();
        size = 0;
    }

    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            map.put(0, newNode);
        } else {
            Node<T> currentNode = head;
            int index = 0;
            while (currentNode.getNext() != null) {
                currentNode = currentNode.getNext();
                index++;
            }
            currentNode.setNext(newNode);
            map.put(index + 1, newNode);
        }
        size++;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return map.get(index).getData();
    }
}