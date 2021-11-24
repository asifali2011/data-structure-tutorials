package com.datastructure.list.example;

import javax.swing.*;

public class LinkedList {

    Node head ;

    public void push(int data){

        Node new_node = new Node(data);

        new_node.setNext(head);
        head = new_node;

        System.out.println(head);
    }

    public void insertAfter(Node prevNode , int data){

        if(prevNode.getNext() == null){
            System.out.println("The given previous node cannot be null");
            return;
        }

        Node new_node = new Node(data);
        new_node.setNext(prevNode.getNext());
        prevNode.setNext(new_node);
    }

    public void deleteAfter(Node prevNode , int data){

        if(prevNode.getNext() == null){
            System.out.println("The given previous node cannot be null");
            return;
        }

        

    }

    public void iterateList(){

        Node n = head;
        while(n!=null){
         System.out.println(n.getData());
         n = n.getNext();
        }
    }


    public static void main(String args[]){

        LinkedList linkedList = new LinkedList();
        linkedList.push(1);
        linkedList.push(2);
        linkedList.push(3);

        linkedList.insertAfter(linkedList.head , 5);

        linkedList.iterateList();


    }




}
