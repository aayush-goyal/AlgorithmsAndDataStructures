package LinkedLists.SinglyLinkedList;

class LinkedList<T> {
    // head of the list
    Node<T> head;

    static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
        }
    }

    // Traversal
    void traversal() {
        LinkedList.Node node = head;
        while(node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    // Insertion methods
    void insertionAtTheBeginning(T data) {
        Node<T> new_node = new Node<>(data);
        new_node.next = head;
        head = new_node;
    }

    void insertionAfterANode(T prev_node_data, T data) {
        if(prev_node_data == null) {
            System.out.println("The data of the previous noe cannot be null.");
            return;
        }

        Node<T> prev_node = head;
        while(prev_node.data != prev_node_data)
            prev_node = prev_node.next;

        Node<T> new_node = new Node<>(data);
        new_node.next = prev_node.next;
        prev_node.next = new_node;
    }

    void insertionAtAGivenPosition(int position, T data) {
        if(position == 1) {
            insertionAtTheBeginning(data);
            return;
        }

        Node<T> node = head;
        Node<T> new_node = new Node<>(data);
        int count = 0;

        while(node.next != null) {
            count++;
            if(count == position-1) {
                new_node.next = node.next;
                node.next = new_node;
                return;
            }
            node = node.next;
        }
    }

    void insertionAtTheEnd(T data) {
        LinkedList.Node<T> new_node = new LinkedList.Node<>(data);

        if(head == null) {
            head = new_node;
            return;
        }

        new_node.next = null;
        Node<T> last = head;
        while(last.next != null)
            last = last.next;

        last.next = new_node;
    }

    // Deletion methods
    void deletionAtTheBeginning() {
        head = head.next;
    }

    void deletionAtNodeWithData(T data) {
        Node<T> prev_node = head;

        if(prev_node.next == null && prev_node.data == data) {
            deletionAtTheBeginning();
            return;
        }

        while(prev_node.next.data != data)
            prev_node = prev_node.next;

        prev_node.next = prev_node.next.next;
    }

    void deletionAtAGivenPosition(int position) {
        if(position == 1) {
            deletionAtTheBeginning();
            return;
        }

        Node<T> node = head;
        int count = 0;

        // 0 1 2 3 5 null
        while(node.next != null) {
            count++;
            if(count == position-1) {
                node.next = node.next.next;
                return;
            }
            node = node.next;
        }
    }

    void deletionAtTheEnd() {
        Node<T> last = head;

        if(last.next == null) {
            deletionAtTheBeginning();
            return;
        }

        while(last.next.next != null)
            last = last.next;
        last.next = null;
    }

    int length() {
        if(head == null) {
            return 0;
        } else if(head.next == null) {
            return 1;
        }

        Node<T> last = head;
        int count = 0;

        while(last != null) {
            count++;
            last = last.next;
        }

        return count;
    }

    int lengthRecursive(Node<T> node) {
        if(node == null) {
            return 0;
        } else {
            return 1 + lengthRecursive(node.next);
        }
    }
}