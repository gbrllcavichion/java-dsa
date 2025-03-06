package org.session4;

public class Main {

    public static void main(String[] args) {

        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(4);

        myLinkedList.reverse();

        System.out.println("\nLinked List:");
        myLinkedList.printList();


    }

}

