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
    @Override
    public Person remove(int index){
        if(index<0 || index >=size){
            return null;
        }
        Node nodeToRemove;

        if(index ==0){
            nodeToRemove = head;
            head = head.getNext();
            if(head !=null) {
                head.setPrev(null);
            }else{
                tail = null;
            }
        } else if (index == size -1) {
            nodeToRemove = tail;
            tail = tail.getPrev();
            tail.setNext(null);
        }
        else{
            nodeToRemove = head;
            for (int i = 0; i < index; i++) {
                nodeToRemove = nodeToRemove.getNext();
            }
            Node prevNode = nodeToRemove.getPrev();
            Node nextNode = nodeToRemove.getNext();
            prevNode.setNext(nextNode);
            nextNode.setPrev(prevNode);
        }
        size--;
        return nodeToRemove.getValue();
    }

    private static class Node{
        private Node prev;
        private Person value;
        private Node next;

        public Node(Node prev, Person value, Node next) {
            this.prev = prev;
            this.value = value;
            this.next = next;
        }

        public Node getPrev() {
            return prev;
        }

        public void setPrev(Node prev) {
            this.prev = prev;
        }

        public Person getValue() {
            return value;
        }

        public void setValue(Person value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}
