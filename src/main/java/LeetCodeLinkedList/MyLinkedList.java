package LeetCodeLinkedList;

public class MyLinkedList {
    private int size;
    private SinglyListNode head;

    public MyLinkedList(){
        size = 0;
        head = new SinglyListNode(0);
    }

    //Add the new node with value val, before the first node in the linked list.
    //After the insertion the new node will be the first node of the linked list
    public void addAtHead(int val){
        addAtIndex(0,val);
    }

    //Append the new node with value val to the last element of the linked list
    public void addAtTail(int val){
        addAtIndex(size,val);
    }

    public void addAtIndex(int index, int val){
        //if the index is greater than the linkedlist length,
        //then node will not be inserted.
        if(index > size) return;

        //if the index is negative,
        //then the node will be inserted at the head
        if(index < 0) index = 0;

        //Find the predecessor of the node to be added
        SinglyListNode predNode = head;
        for (int i = 0; i < index; i++) {
            predNode = predNode.next;
        }

        //new node to be added
        SinglyListNode newNode = new SinglyListNode(val);
        //insert itself
        newNode.next = predNode.next;
        predNode.next = newNode;

        //increase the size of the linkedlist
        size = size + 1;

    }

    //Get the value of the index-th node in the linkedlist.
    //if the index is invalid, return -1.
    public int get(int index){
        //if index is invalid
        if(index < 0 || index >= size) {
            return -1;
        }

        SinglyListNode currNode = head;
        //index steps needed to move from sentinel node to wanted node
        for (int i = 0; i < index + 1; i++) {
            currNode = currNode.next;
        }
        return currNode.val;
    }

    public void deleteAtIndex(int index){
        //if the index is invalid, do nothing
        if(index < 0 || index >= size) return;

        //Find the predecessor of the node to be deleted
        SinglyListNode predNode = head;
        for (int i = 0; i < index; i++) {
            predNode = predNode.next;
        }

        //delete the node at index, predNode.next
        predNode.next = predNode.next.next;
    }
}
