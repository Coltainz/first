public class LinkedList {
    
    private Node head;
    private Node tail;

    public void append(String add)
    {
        Node newNode = new Node(add);

        if(head == null)
            head = newNode;
        else
            tail.next = newNode;

        tail = newNode;
    }

    public void displayList()
    {
        Node current = head;

        while(current != null)
        {
            System.out.println(current.data);
            current = current.next;
        }
    }
}
