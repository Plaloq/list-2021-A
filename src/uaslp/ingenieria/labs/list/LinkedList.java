package uaslp.ingenieria.labs.list;

/**
 * Lista doblemente ligada
 */
public class LinkedList {
    private Node head;
    private Node tall;
    private int size;

    public void add(int data){
        Node node = new Node(data);

        node.setPrevious(tall);

        if(tall != null){
            tall.setNext(node);
        }

        if(head == null){
            head = node;
        }

        tall =node;
        size++;
    }

    public int getSize() {
        return size;
    }
}
