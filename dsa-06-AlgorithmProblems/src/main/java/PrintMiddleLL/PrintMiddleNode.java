package PrintMiddleLL;

public class PrintMiddleNode {

    public static void main(String[] args) {

        MySinglyLinkedList sll = new MySinglyLinkedList();

        for (int i = 1; i <= 6; i++) {
            sll.add(i);
        }
        printMiddle(sll);
    }

    public static void printMiddle(MySinglyLinkedList sll) {

        // create two pointers
        Node a = sll.head; // single jump
        Node b = sll.head; // double jump

        // iterate over the linked list
        while (b != sll.tail && b.next != sll.tail) { // b.next!=null &&  b.next.next != null => would be used if only head node was provided instead of the linked list

            a = a.next;
            b = b.next.next;

        }

        // b is located either on tail or right before tail
        if (b == sll.tail) System.out.println(a.id); //  odd number of nodes (on tail)
        else System.out.println(a.id + ", " + a.next.id); // even number of nodes (before tail)
    }

}
