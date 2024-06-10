package com.keyin;

public class Main {
    public static void main(String[] args) {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.insertInLinkedList(1, 0);
        singleLinkedList.insertInLinkedList(2, 1);
        singleLinkedList.insertInLinkedList(3, 2);
        singleLinkedList.insertInLinkedList(4, 3);
        singleLinkedList.insertInLinkedList(5, 1);
        singleLinkedList.traverseLinkedList();
        singleLinkedList.searchNode(4);
        singleLinkedList.deleteNode(3);
        singleLinkedList.traverseLinkedList();
    }
}

// Author: Matthew Menchinton
