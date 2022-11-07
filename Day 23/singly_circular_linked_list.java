public class singly_circular_linked_list {

    Node head;
    Node tail;

    public class Node {
        
        int value;
        Node next;

        Node(int value){
            this.value = value;
        }
        
        Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
        
    }

    void insert(int val){
        Node node = new Node(val);

        if (head == null) {
            head = node;
            tail = node;
            return;
        }

        tail.next = node;
        node.next = head;
        tail = node;
    }

    void delete(int val){
        Node temp = head;
        if (temp == null) {
            return;
        }

        if (temp.value == val) {
            head = head.next;
            tail.next = head;
            return;
        }

        do {
            Node n = temp.next;
            if (n.value == val) {
                temp.next = n.next;
                break;
            }
            temp = temp.next;
        } while (temp != head);
    }

    void display(){
        Node temp = head;
        if (head != null) {
            do {
                System.out.print(temp.value + " -> ");
                temp = temp.next;                
            } while (temp != head);
        }
        System.out.println("End");
    }

    public static void main(String[] args) {
        singly_circular_linked_list scll = new singly_circular_linked_list();

        scll.insert(1);
        scll.insert(2);
        scll.insert(3);
        scll.insert(4);
        scll.display();
        scll.delete(2);
        scll.display();
        
        System.out.println(scll.tail.value);
        System.out.println(scll.tail.next.value);
    }
    
}