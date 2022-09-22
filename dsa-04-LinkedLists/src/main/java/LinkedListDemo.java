public class LinkedListDemo {

    public static void main(String[] args) {

        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4); // they are not yet connected right now, they are separate objects

        System.out.println("next address : " + node1.next); // null

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        System.out.println("node1's address is : " + node1 + " node1's next address is " + node1.next);
        System.out.println("node2's address is : " + node2 + " node2's next address is " + node2.next);
        System.out.println("node3's address is : " + node3 + " node3's next address is " + node3.next);
        System.out.println("node4's address is : " + node4 + " node4's next address is " + node4.next);

//        System.out.println(node1.next.id + " ID of the second node");

        Node current;
        Node head = node1;
        current = head;

        while (current != null) {

            System.out.println("ID of the current node is: " + current.id);
            current = current.next;
        }

    }
}
