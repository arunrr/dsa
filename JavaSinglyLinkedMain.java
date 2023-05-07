class JavaSinglyLinkedMain{
     public static void main(String[] args) {
        SinglyLinkedList linkedList = new SinglyLinkedList();

        linkedList.addNode(1);
        linkedList.addNode(2);
        linkedList.addNode(31);
        linkedList.addNode(41);
        linkedList.addNode(6);

        linkedList.printList();

        System.out.println("=============================");
        linkedList.deleteDataNode(6);


        System.out.println("=============================");
        linkedList.printList();

        System.out.println("=============================");
        linkedList.deleteNode();
        linkedList.deleteNode();

        System.out.println("=============================");
        linkedList.printList();

        System.out.println("=============================");
        linkedList.insertAfter(2, 20);
        linkedList.insertAfter(1, 30);


        System.out.println("=============================");
        linkedList.printList();

        linkedList.insertAfter(0, 10);

        System.out.println("=============================");
        linkedList.addNode(2);
        linkedList.addNode(3);
        linkedList.addNode(3);
        linkedList.addNode(5);
        linkedList.addNode(5);
        linkedList.printList();

        System.out.println("=============================");
        linkedList.removeDuplicate();
        linkedList.printList();

        
     

    }
}