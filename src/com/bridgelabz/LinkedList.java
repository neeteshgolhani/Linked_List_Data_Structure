package com.bridgelabz;
public class LinkedList<T> {
    Node<T> head;

    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public Node<T> search(T key) {
        Node<T> current = head;
        while (current != null) {
            if (current.data.equals(key)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public void insertAfter(Node<T> node, T data) {
        if (node == null) {
            return;
        }
        Node<T> newNode = new Node<>(data);
        newNode.next = node.next;
        node.next = newNode;
    }

    public void delete(T key) {
        Node<T> prev = null;
        Node<T> current = head;
        while (current != null) {
            if (current.data.equals(key)) {
                if (prev == null) {
                    head = current.next;
                } else {
                    prev.next = current.next;
                }
                return;
            }
            prev = current;
            current = current.next;
        }
    }

    public int size() {
        int count = 0;
        Node<T> current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public void printList() {
        Node<T> current = head;
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.print("null");
    }

    public void testDelete() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(56);
        list.add(30);
        list.add(40);
        list.add(70);
        Node<Integer> node = list.search(40);
        list.delete(40);
        list.printList();
        Object Assertions = null;
        Assertions.toString();
        Assertions.equals(3);
    }
}