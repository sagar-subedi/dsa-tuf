// User function Template for Java

// Node of a linked list
  class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}

class Solution {
    static boolean searchKey(int n, Node head, int key) {
        // Code here
        if(head==null) return false;
        Node currentNode = head;
        while(currentNode.next!=null){
            if(currentNode.data==key) return true;
            currentNode=currentNode.next;
        }
        return false;
    }
}