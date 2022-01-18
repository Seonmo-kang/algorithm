
package leetcode;

/**
 * LinkedList - Single Linked List
 */
public class MyLinkedList {
    int length;
    Node head;
    /**
     * Node
     */
    public class Node {
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    MyLinkedList(){
        this.length = 0;
        this.head = null;
    }
    int get(int index){
        int count = 0;
        Node node = head;
        if(index<0 || index>this.length){
            return -1;
        }else{
            while(count!=index){
                node = node.next;
                count++;
            }
            return node.val;
        }
    }
    void addAtHead(int val){
        Node newNode = new Node(val);
        newNode.next = this.head;
        this.head = newNode;
        length++;
    }
    void addAtTail(int val){
        if(this.length==0){
            addAtHead(val);
            return;
        }
        Node newNode = new Node(val);
        Node temp = head;
        while (head.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.next = null;
        length++;
        return; 
    }
    void addAtIndex(int index,int val){
        if(index>length){
            break;

        }else if(index==length){
            addAtTail(val);

        }else if(index==0){
            addAtHead(val);

        }else{
            int count = 0;
            Node newNode = new Node(val);
            Node temp = head;
            while(count!=index){
                temp = temp.next;
                count++;
            }
            temp.next = newNode;
            this.length++;

        }
        return;
        
    }
    void deleteAtIndex(int index){
        if(index>this.length || index<0){
            break;
        }
        Node temp = head;
        if(index==0){
            head = temp.next;
        }else{
            Node temp2 = head;
            Node pre = null;
            int counter=0;
            while(counter != index){
                temp2 = temp2.next;
                counter++;
            }
            pre.next = temp2.next;
        }
        return;
    }

}