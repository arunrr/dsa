public class DoublyLinkedList{
    class Node{
        int data;
        Node next, prev;

        Node(int data){
            this.data = data;
        }
    }

    Node head, tail = null;

    public void addNode(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            head.prev = tail.prev = null;
            tail.next = head.next = null;
            return;
        }else{
            tail.next = newNode;
            newNode.prev = tail;
        }

        
        tail = newNode;
        tail.next = null;
    }

    public void deleteNode(){
        if(head == null){
            System.out.println("The list is empty!");
            return;
        }

        
        tail = tail.prev;
        tail.next = null;

    }

    public void deleteAfter(int nextTo){
        if(head == null){
            System.out.println("The list is empty!");
            return;
        }

        Node tempHead = head;
        while(tempHead != null && tempHead.data != nextTo){
            tempHead = tempHead.next;
        }

        // If there is no nextTo data
        if(tempHead == null){
            System.out.println("The given data is not found in the list");
            return;
        }

        // If the data to delete is last element
        if(tempHead == tail){
            System.out.println("No node present after "+ nextTo + " !");
            return;
        }

        Node nextOfDeleteNode = tempHead.next.next;
        tempHead.next = nextOfDeleteNode;
        nextOfDeleteNode.prev = tempHead; 
    }

    public void insertBefore(int prevTo, int data){
      
        
        // Find the node with prevTo data
        Node tempTail = tail;
        while(tempTail != null && tempTail.data != prevTo){
            tempTail = tempTail.prev;
        }

        // Check if prevTo is present in the list
        if(tempTail == null){
            System.out.println("The given data is not found in the list");
            return;
        }


        Node newNode = new Node(data);
        // Add a new node next to the prevTo data node
        if(tempTail == head){
            newNode.prev = head.prev;
            newNode.next =  head;
            head.prev = newNode;
            head = newNode;
            return;
        }   

       
        newNode.prev = tempTail.prev;
        newNode.next = tempTail;
        tempTail.prev.next = newNode;
        tempTail.prev = newNode;
       
    }

    public void insertAfter(int nextTo, int data){
        
        // Find the node with nextTo data
        Node tempHead = head;
        while(tempHead != null && tempHead.data != nextTo){
            tempHead = tempHead.next;
        }

        // Check if nextTo is present in the list
        if(tempHead == null){
            System.out.println("The given data is not found in the list");
            return;
        }

        // Add a new node next to the nextTo data node

        if(tempHead == tail){
            addNode(data);
            return;
        }

        Node newNode = new Node(data);
        newNode.next = tempHead.next;
        tempHead.next.prev = newNode;
        tempHead.next = newNode;
        newNode.prev = tempHead;
    }

    public void display(){
        Node tempHead = head;

        if(tempHead == null){
            System.out.println("The list is empty");
            return;
        }

        while(tempHead != null){
            System.out.print(tempHead.data);
            System.out.print(" -> ");
            tempHead = tempHead.next;
        }
        System.out.print("null\n");
    }

    public void displayReverse(){
        Node tempTail = tail;

        if(tempTail == null){
            System.out.println("The list is empty");
            return;
        }
        System.out.print("null");
        System.out.print(" -> ");

        while(tempTail != null){
            System.out.print(tempTail.data);
            if(tempTail == head){
                break;
            }
            System.out.print(" -> ");
            tempTail = tempTail.prev;
        }

        System.out.println(" ");
        
    }
}