class JavaDoublyLinkedList{
    public static void main(String[] args) {
        DoublyLinkedList linkedList = new DoublyLinkedList();

        linkedList.addNode(1);
            linkedList.addNode(2);
            linkedList.addNode(31);
            linkedList.addNode(41);
            linkedList.addNode(6);
    
            linkedList.display();

            System.out.println();

            linkedList.deleteNode();
            linkedList.deleteNode();
            linkedList.display();

            System.out.println();

            linkedList.insertAfter(1, 20);
            linkedList.display();

            System.out.println();
            linkedList.displayReverse();


            System.out.println();
            linkedList.insertBefore(2, 30);
            linkedList.insertBefore(1, 10);
            linkedList.insertBefore(31, 100);

            linkedList.display();

            System.out.println();
            linkedList.deleteAfter(31);
            linkedList.deleteAfter(30);

            linkedList.display();

    
          
    }
}