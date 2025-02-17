public class Node {
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
