// Implementation of singly linked list

public class SinglyLinkedList{
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }       
    }

    // Create head and tail for the linked list
    Node head, tail = null;

    // Add a node to the end of the linked list
    public void addNode(int data){
        Node newNode = new Node(data);

        // Check if linked list is empty
        if(head == null){
            head = newNode;
        
            newNode.next = null;
        }else{
            tail.next = newNode;
        }

        tail = newNode;

    }

    // Add a data after a given data
    public void insertAfter(int dataAfter, int data){
        System.out.println(String.format("Head: %s\nTail:%s",head.data,tail.data));
        if(head == null){
            System.out.println(String.format("The list is empty! Use addNode(%s)", data));
            return;
        }
        Node newNode = new Node(data);

        Node tempHead = head;

        while(tempHead !=null && tempHead.data != dataAfter){
            tempHead = tempHead.next;
        }

        if(tempHead == null){
            System.out.println("The given data is not found in the list!");
            return;
        }

        if(tempHead.next == tail){
       
         tail.next = tail;
         tail = newNode;

        }else if(tempHead == tail){
            addNode(data);
        }
        
        else{
            newNode.next = tempHead.next;
            tempHead.next = newNode;
        }
        System.out.println(String.format("Head: %s\nTail:%s",head.data,tail.data));
    }

    // Delete a node from end of the  linked list
    public void deleteNode(){
        if(tail == null){
            System.out.println("List is empty");
            return;
        }

        Node tempHead = head;

        while(tempHead.next != tail){
            tempHead = tempHead.next;
        }

        System.out.println(tail.data);
        tail = tempHead;
        tail.next = null;

    }

    // Delete a node from the linked list using a given data
    public void deleteDataNode(int data){
        if(tail == null){
            System.out.println("List is empty");
            return;
        }

        
        Node prevNode = head;

        while(prevNode.next.data != data){
            prevNode = prevNode.next;
        }

        if(prevNode.next == tail){
            tail = prevNode;
            tail.next = null;
           
        }else{

        Node nextNode = prevNode.next.next;
        prevNode.next = nextNode;
        }
        System.out.println(data);
    }

    public void printList(){

        if(head == null){
            System.out.println("The list is empty!");
            return;
        }
        Node tempHead = head;
        while(tempHead != null){
            System.out.println(tempHead.data);
            tempHead= tempHead.next;
        }
    } 

    // Remove duplicate elements in sorted list
    // Space Complexity: O(1)
    // Time Complexity: O(n)
    public void removeDuplicate(){

        Node currentNode = head;
        // This loop executes O(1) times
        while(currentNode != null){
            Node nextNode = currentNode.next;
            // Skip through duplicate nodes 
            // This loop executes O(n) times
            while(nextNode!= null && currentNode.data == nextNode.data){
                nextNode = nextNode.next;
            }

            if(nextNode == tail){
                currentNode.next = nextNode;
                nextNode.next = null;
                return;
            }

            if(nextNode == null){
                tail = currentNode;
                currentNode.next = null;
                return;
            }

            currentNode.next = nextNode;

            currentNode = nextNode;
        }
        

    }
}