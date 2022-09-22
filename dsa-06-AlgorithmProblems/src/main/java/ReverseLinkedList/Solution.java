package ReverseLinkedList;

public class Solution {
    public static void main(String[] args) {
        MySinglyLinkedList list = new MySinglyLinkedList();

        for (int i = 0; i < 10; i++) list.add(i);
        list.printNodes();
        System.out.println("After reverse in one pass");
        reverse(list);
        list.printNodes();
    }

    static void reverse(MySinglyLinkedList list) {

        // create two pointers

        Node prev = list.head;
        Node current = list.head.next;

        while (current != null) {

            Node nextNode = current.next;
            current.next = prev; // change the direction of current to prev
            prev = current; // move prev to right to current
            current = nextNode; // move current to right on the next node

        }

        // adjust head & tail

        list.tail = list.head;
        list.tail.next = null;
        list.head = prev;

    }
}
