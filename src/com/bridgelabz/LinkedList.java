package com.bridgelabz;
     class SortedLinkedList<T extends Comparable<T>> {
        private Node head;
        private int size;

        public SortedLinkedList() {
            this.head = null;
            this.size = 0;
        }

        private class Node {
            T data;
            Node next;

            public Node(T data) {
                this.data = data;
                this.next = null;
            }
        }

        public void add(T data) {
            Node newNode = new Node(data);
            if (head == null || data.compareTo(head.data) < 0) {
                newNode.next = head;
                head = newNode;
            } else {
                Node current = head;
                while (current.next != null && data.compareTo(current.next.data) > 0) {
                    current = current.next;
                }
                newNode.next = current.next;
                current.next = newNode;
            }
            size++;
        }

        public int size() {
            return size;
        }

        public void printList() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }