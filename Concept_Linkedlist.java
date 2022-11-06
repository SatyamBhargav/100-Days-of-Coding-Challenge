public class Concept_Linkedlist {

    public Node head;
    public Node tail;
    public int size;
    public Concept_Linkedlist() {
        this.size = 0;
    }

    /*
     *  bellow code is a box which represent a node which can contain a single value
     * i.e. only head or single element in LL or can contain value + next (i.e. a pointer)
     */


    public class Node {

        public int value; // data of a node
        public Node next; // pointer of a node contain the address of next node

        public Node(int value) {
            this.value = value;    // using this function we can insert just value
                                  // which can be used for insertion at the beginning and end
        }

        public Node(int value, Node next) {  
            this.value = value; // this function is used for insertion in the middile of a specific point
            this.next = next;  // as it contain next pointet        
        }        
    }

    public void insertFirst(int val) {
        Node node = new Node(val);   // create an object of class Node for inserting an element 
        node.next = head;    // setting inserted elemet address to head
        head = node;    // setting inserted element data to head

        if (tail == null) {        // checking if tail == null
            tail = head;          // if true set head element to tail
        }
        size++;      // increase the size of the linked list         
    }

    public void insertend(int val) {
        Node node = new Node(val);
        tail.next = node;              // setting tail address to new element
        tail = node;                  // setting new element to tail

        if (tail == null) {             // if tail element is null i.e. LL is empty
            insertFirst(val);           // then insert first element
            return;                     // then exit the if statement
        }
        size++;                         // increase the LL size
    }

    public void insert(int val, int index) {
        if (index == 0) {                       // check if index is 0 the LL is empty
            insertFirst(val);
            return;
        }
        if (index == size) {                // check if index is equal to LL size 
            insertend(val);                 // if true then insert element at the end
            return;
        }

        // if none of the above then the following 

        Node temp = head;                   // creating a temp variable and setting head value to it
        for (int i = 1; i < index; i++) {   // now traversing from first element till the given index
            temp = temp.next;               // and setting its address to the temp pointer
        }
        
        Node node = new Node(val,temp.next);        // creating a new node  
        temp.next = node;                           // setting the value of new node to temp
        size++; 

    }

    void display(){
        Node temp = head;                           // creating new temp and giving head value to it
        while (temp != null) {
            System.out.print(temp.value + " -> ");     // printing the value    
            temp = temp.next;                           // setting temp address to next node address
        }
        System.out.print("END");
    }

    public void deletefist(){
        int val = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        System.out.println(val);
        size--;
    }

    public void deleteend(){
        int val = tail.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        System.out.println(val);
        size--;
    }


    public static void main(String[] args) {
        Concept_Linkedlist list = new Concept_Linkedlist();
        list.insertFirst(3);
        list.insertFirst(5);
        list.insertFirst(6);
        list.insertFirst(9);
        list.insertend(10);
        list.insert(100, 3);
        list.deletefist();

        list.display();
    }


}
