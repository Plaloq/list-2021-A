package uaslp.ingenieria.labs.list;

class Node {
    private int data;
    private Node previous;
    private Node next;

    Node(int data){
        this.data=data;
    }

    public int getData() {
        return data;
    }

    public void setData(int dato) {
        this.data = dato;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
