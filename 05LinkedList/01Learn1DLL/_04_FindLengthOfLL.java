public class _04_FindLengthOfLL {
    /*Complete the function below*/

class Node{
    int data;
    Node next;
    Node(int a){  data = a; next = null; }
}


class Solution {
    // Function to count nodes of a linked list.
    public int getCount(Node head) {
        // code here
        if(head==null) return 0;
        int currentCount = 1;
        Node currentNode = head;
        while(currentNode!=null && currentNode.next!=null){
            currentCount++;
            currentNode=currentNode.next;
        }
        return currentCount;
        
    }
}    
    
}
