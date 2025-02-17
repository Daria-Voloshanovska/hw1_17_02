

public class MyLinkedList implements MyList{
    private Node head = null;
    private Node tail = null;
    private int size =0;

    @Override
    public void add(Person element) {
        Node node =new Node(null, element, null);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.setNext(node);
            node.setPrev(tail);
            tail = node;
        }
        size++;
    }


    @Override
    public int size() {
        return size;
    }

    @Override
    public Person get(int index) {
        if (index < 0 || index>=size){
            return null;
        }
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return current.getValue();
    }

    @Override
    public void print() {
        Node node = head;
        while ( node !=null){
            System.out.println(node.getValue());
            node = node.getNext();
        }

    }
}
