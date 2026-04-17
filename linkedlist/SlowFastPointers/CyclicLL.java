package linkedlist.SlowFastPointers;

public class CyclicLL {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static Node head;

    public static void main(String[] args) {

        // Creating linked list: 10 -> 20 -> 30 -> 40
        head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        // Creating cycle: 40 -> 20
        head.next.next.next.next = head.next;

        System.out.println(isCyclic());
    }

    static boolean isCyclic() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;          // 1 step
            fast = fast.next.next;     // 2 steps

            if (slow == fast) {
                return true; // cycle found
            }
        }

        return false; // no cycle
    }
}