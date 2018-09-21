//package ch03.util.list;

public class LinkedListTest {

    public static void main(String[] args) {
        int[] array =  {66, 33, 99, 55, 88, 22, 24, 77};

        //MyArrayList�׽�Ʈ
        System.out.println("<<<<<<<<<<<< MyArrayList�׽�Ʈ >>>>>>>>>>>>>");

        MyArrayList myArrayList = new MyArrayList(array.length);

        for(int i = 0; i < array.length; i++){
            myArrayList.add(array[i]);
        }

        myArrayList.add(18);
        System.out.println("������ �ε����� '18'�߰�");

        for(int i = 0; i < myArrayList.length; i++){
            System.out.print(myArrayList.get(i) + ", ");
        }

        System.out.println("");
        System.out.println("MyArrayList�� ������:"+ myArrayList.length);
        System.out.println("");
        System.out.println("");

        myArrayList.add(3, 20);
        System.out.println("3��° �ε����� '20'�߰�");
        for(int i = 0; i < myArrayList.length; i++){
            System.out.print(myArrayList.get(i) + ", ");
        }

        System.out.println("");
        System.out.println("MyArrayList�� ������:"+ myArrayList.length);
        System.out.println("");
        System.out.println("");

        myArrayList.remove();

        System.out.println("������ �ε��� ����");
        for(int i = 0; i < myArrayList.length; i++){
            System.out.print(myArrayList.get(i) + ", ");
        }

        System.out.println("");
        System.out.println("MyArrayList�� ������:"+ myArrayList.length);
        System.out.println("");
        System.out.println("");

        myArrayList.remove(3);
        System.out.println("3��° �ε��� ����");
        for(int i = 0; i < myArrayList.length; i++){
            System.out.print(myArrayList.get(i) + ", ");
        }

        System.out.println("");
        System.out.println("MyArrayList�� ������:"+ myArrayList.length);
        System.out.println("");
        System.out.println("");

        System.out.println("<<<<<<<<<<<< MyLinkedList�׽�Ʈ >>>>>>>>>>>>>");

        MyLinkedList myLinkedList = new MyLinkedList();
        Node node = null;

        printData(array);
        System.out.println("");
        for(int i = 0; i < array.length; i++){
            node = new Node();
            node.setData(array[i]);
            myLinkedList.add(node);
        }

        System.out.println("LinkedList size : " + myLinkedList.getSize());
        System.out.println("");

        Node lastNode =  myLinkedList.get();

        System.out.println("Last Node data : "+ lastNode.getData());
        System.out.println("");

        Node addNode = new Node();
        addNode.setData(100);

        myLinkedList.add(3, addNode);
        System.out.println("3��° �ε����� ���ο� ��带 �߰��Ѵ�.");
        myLinkedList.printList();
        System.out.println("");
        System.out.println("");

        System.out.println("3��° �ε����� ��带 �����Ѵ�.");
        myLinkedList.remove(3);
        myLinkedList.printList();

    }

    public static void printData(int[] data){
        System.out.println("<<�� ������ ���>>");
        for(int i = 0; i < data.length; i++){
            System.out.print(data[i] +", ");
        }
        System.out.println("");
    }

}
