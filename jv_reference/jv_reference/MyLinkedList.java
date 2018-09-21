//package ch03.util.list;

public class MyLinkedList {

    private Node head;
    private int size;

    public MyLinkedList(){
        head = null;
        size = 0;
    }

    /**
     * Ư�� �ε����� ���ο� ��带 �߰��Ѵ�.
     * @param index
     * @param newNode
     */
    public void add(int index, Node newNode){
        //ù��° ����� ���
        Node nextNode = null;
        if(index == 0 ){
            if(this.head == null){
                this.head = new Node();
                this.head.setNext(newNode);
            } else{
                nextNode = this.head.getNext();
                newNode.setNext(nextNode);
                this.head.setNext(newNode);
            }

        } else {
            //ù��° ��尡 �ƴѰ��
            if( index < 0 || index > this.size-1 ) {throw new IndexOutOfBoundsException();}

            Node p = this.head;

            for(int i = 0; i < index-1; i++){

                p = p.getNext();

                if(index < this.size) nextNode = p.getNext();

            }
                if(nextNode != null) newNode.setNext(nextNode);

                p.setNext(newNode);
        }

        this.size++;
    }

    /**
     * ���������� ���ο� ��带 �߰��Ѵ�.
     * @param index
     * @param newNode
     */
    public void add(Node newNode){
        //ù��° ����� ���
        if(this.head == null){
            this.head = new Node();
            this.head.setNext(newNode);

        } else {
            Node p = this.head;
            for(int i = 0; i < this.size; i++){
                p = p.getNext();
            }
                p.setNext(newNode);
        }

        this.size++;
    }

    /**
     * �ش� index�� ��带 �����Ѵ�.
     * @param index
     * @param node
     */
    public void remove(int index){
        //
        Node headNode = this.head;
        if(headNode == null){System.out.println("������ �����Ͱ� �����ϴ�.");}
        Node p = headNode;

        for(int i = 0; i < index-1; i++){
            p = p.getNext();
        }
        p.setNext(p.getNext().getNext());
        this.size--;
        //
    }

    /**
     * ������ ��带 �����Ѵ�.
     * @return
     */
    public Node get(){

        if(this.head == null) throw new IndexOutOfBoundsException();
        Node p = head;

        for(int i = 0; i < this.size; i++){
            p = p.getNext();
        }

        return p;
    }

    public void printList(){
        System.out.println("<<LinkedList Data���>>");
        if(this.head != null){
            Node p = this.head;
            for(int i = 0; i < size; i++){
                p = p.getNext();
                if(p != null) System.out.print(p.getData()+", ");
            }
        }
    }

    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }

}
