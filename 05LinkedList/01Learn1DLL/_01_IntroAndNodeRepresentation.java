public class _01_IntroAndNodeRepresentation {
    public static void main(String[] args) {
        
    }

    
    class Node{
        int data;
        Node next;

        Node(int x){
            data = x;
            next = null;
        }
    }


    Node insertAtEnd(Node head, int x) {
        Node newNode = new Node(x);
        // If the list is empty, return the new node as the head
        if (head == null) {
            return newNode;
        }
        // code here
        Node currentNode = head;
        while(currentNode.next!=null){
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
        return head;
    }
}
