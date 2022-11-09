public class Doubly_Circular_Linked_list {

    Node head;
    Node tail;


    public class Node {

        int value;
        Node next;
        Node prev;

        Node(int value){
            this.value = value;
        }

        Node(Node prev, int value, Node next){
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }

    void insertFirst(int val){
        Node node = new Node(val);
        if (head == null) {
            node.next = head;
            node.prev = tail;
            head = node;
            tail = node;
            return;
        }

        if (head != null) {
            node.next = head;
            node.prev = tail;
            head.prev = node;
            head.next = node;
            head = node;
        }
    }

    void insertEnd(int val){
        Node node = new Node(val);
        if (tail == null) {
            insertFirst(val);
        }

        node.prev = tail;
        tail.next = node;
        node.next = head;
        tail = node;
    }

    void insert(int val, int index){
        Node node = new Node(val);
        Node element = head;
        for (int i = 1; i < index; i++) {
            element = element.next;
        }
        node.next = element.next;
        node.prev = element;
        element.next.prev = node;
        element.next = node;

        /*
        bellow code help us to verify our code

        System.out.println(element.value);
        System.out.println(element.next.value);
        System.out.println(element.next.prev.value);
        System.out.println(element.next.next.value);
        System.out.println(element.next.next.prev.value);
        */
    }

    void delete(int val){
        if (head.value == val) {
            head = head.next;
            head.prev = tail;

            /*
            code verifier
            System.out.println(head.value);
            System.out.println(head.prev);
            System.out.println(head.next.value);
            */
        }

        if (tail.value == val) {
            tail = tail.prev;
            tail.next = head;
        }

        Node element = head;
        do {
            if (element.value == val) {
                element.next.prev = element.prev;
                element.prev.next = element.next;
            }
            element = element.next;
        }while(element != head);
        
    }

    void display(){
        Node temp = head;
        do {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }while (temp != head);
        System.out.println("END");
    }

    public static void main(String[] args) {
        Doubly_Circular_Linked_list dll = new Doubly_Circular_Linked_list();
        dll.insertFirst(6);
        dll.insertFirst(5);
        dll.insertFirst(4);
        dll.display();

        
        /*
        for code verification

        System.out.println(dll.head.value);
        System.out.println(dll.tail.value);
        System.out.println(dll.head.next.value);
        System.out.println(dll.tail.next);
        System.out.println(dll.head.prev);
        System.out.println(dll.tail.prev.value);
        
        dll.insert(2, 2);
        dll.display();
        System.out.println(dll.tail.next.value);
        System.out.println(dll.head.prev.value);
        dll.delete(10);
        dll.display();
        dll.delete(12);
        dll.display();
        dll.delete(2);
        dll.display();
        System.out.println(dll.tail.next.value);
        System.out.println(dll.head.prev.value);
        */
    }
    
}