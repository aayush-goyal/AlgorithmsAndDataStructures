package LinkedLists.SinglyLinkedList;

public class BasicOperationsImplementation {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        LinkedList.Node<Integer> head = new LinkedList.Node<>(1);
        linkedList.head = head;
        LinkedList.Node<Integer> second = new LinkedList.Node<>(2);
        head.next = second;
        second.next = new LinkedList.Node<>(3);

        linkedList.traversal();

        linkedList.insertionAtTheBeginning(0);
        linkedList.insertionAtTheEnd(5);
        linkedList.insertionAfterANode(3, 4);
        linkedList.insertionAtTheBeginning(-1);
        linkedList.insertionAtTheEnd(7);
        linkedList.insertionAfterANode(5, 6);
        linkedList.deletionAtTheBeginning();
        linkedList.deletionAtTheEnd();
        linkedList.deletionAtNodeWithData(4);
        linkedList.deletionAtNodeWithData(6);

        linkedList.traversal();
        System.out.println(linkedList.length());

        linkedList.deletionAtAGivenPosition(4);
        linkedList.traversal();
        linkedList.insertionAtAGivenPosition(4, 8);
        linkedList.traversal();
        System.out.println(linkedList.lengthRecursive(linkedList.head));
    }

}