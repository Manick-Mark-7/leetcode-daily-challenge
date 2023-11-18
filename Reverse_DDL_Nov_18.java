package leetcode.binarySearch.daily_challenge;

public class Reverse_DDL_Nov_18 {

    class Node{
        int data;
        Node next, prev;
        Node(int data)
        {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node reverseDLL(Node  head) {
        Node curr = head, next = head;

        while (curr != null) {

            next = curr.next;

            curr.next = curr.prev;

            curr.prev = next;

            if (next == null)

                break;

            curr = next;

        }

        return curr;
    }
}
