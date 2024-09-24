
import java.util.*;
public class LL {
    node head;
    static class node {
        int size;
        String data;
        node next;

        node(String data) {
            this.data = data;
            this.next = null;
        }
    }
    // adding first and last
    public void addFirst(String data){
        node newNode = new node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void printList() {
        if (head == null) {
            System.out.println("list is empty");
        }
//        node newNode = new node(data);
//        if (head == null) {
//            head = newNode;
//            return;
//        }
        node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + ".");
            currNode = currNode.next;
        }
        System.out.println("NUll");
    }
    public void addLast(String data){
        node newNode = new node(data);
        if(head == null) {
            head = newNode;
            return;
        }
        node currNode = head;
        while(currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }


    public void deleteFirst(){
        if(head == null){
            System.out.println("The List is empty");
            return;
        }
        head = head.next;
    }
    public void deleteLast() {
        if (head == null) {
            System.out.println("The List is empty");
            return;
        }
        if(head.next == null){
            head = null;
            return;
        }
        node secondLast = head;
        node lastNode = head.next;
        while(lastNode.next != null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("a");
        list.addFirst("this");
        list.printList();
        list.addLast("list");
        list.printList();

        list.deleteFirst();
        list.printList();

        list.deleteLast();
        list.printList();


    }
}
