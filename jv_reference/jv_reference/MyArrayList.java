//package ch03.util.list;

public class MyArrayList {
	final static int MAX_SIZE = 100;
    private int[] data;
    int length;

    public MyArrayList() {
        super();
        this.length = 0;
        data = new int[MAX_SIZE];
    }

    public MyArrayList(int size){
        this.length = 0;
        data = new int[size];
    }

    /**
     * �迭�� �������� �����͸� �߰��Ѵ�.
     * @param data
     */
    public void add(int data){
        int size = this.data.length;
        //���� �迭�� ���̿� ����� ������ ����� �������� ���ο� �迭�� �����Ѵ�.
        if(this.length == size){
            copyArray(data, size);
        } else {
            this.data[this.length] = data;
        }
        //
        this.length++;
    }

    /**
     * �迭�� Ư���ε����� �����͸� �߰��Ѵ�.
     * @param data
     */
    public void add(int index, int data){
        int size = this.data.length;
        //���� �迭�� ���̿� ����� ������ ����� �������� ���ο� �迭�� �����Ѵ�.
        if(this.length == size){

            copyArrayWithIndex(index, data, size);

        } else {
            //�迭�� �ε����� �߽����� �ڷ� ��ĭ�� �̵��Ѵ�.
            for(int i = this.length-1; i > index-1; i--){
                this.data[i+1] = this.data[i];
            }

            this.data[index-1] = data;
        }
        //
        this.length++;
    }

    /**
     * �迭�� ������ ������ ����
     */
    public void remove(){

        if(this.length == 0) { throw new ArrayIndexOutOfBoundsException(); }

        this.data[this.length-1] = 0;

        this.length--;
    }

    /**
     * Ư�� �ε����� �����͸� �����Ѵ�.
     * @param index
     */
    public void remove(int index){
        if(this.length == 0) { throw new ArrayIndexOutOfBoundsException(); }

        this.data[index -1] = 0;

        //������ ���� �����ͷ� ���ʴ�� ä���.
        for(int i = index - 1; i < this.length-1; i++){
            this.data[i] = this.data[i+1];
        }

        this.length--;
    }

    /**
     * �迭����޼ҵ�
     * @param data
     * @param size
     */
    private void copyArray(int data, int size) {
        int newSize = size + 1;
        int[] newArray = new int[newSize];

        newArray[newSize-1] = data;

        for(int i = 0; i < size; i++){
            newArray[i] = this.data[i];
        }

        this.data = new int[newSize];

        for(int i = 0; i < newArray.length; i++){
            this.data[i] = newArray[i];
        }
    }

    /**
     * Ư�� �ε��� �迭����޼ҵ�
     * @param index
     * @param data
     * @param size
     */
    private void copyArrayWithIndex(int index, int data, int size) {
        int newSize = size + 1;
        int[] newArray = new int[newSize];

        newArray[index-1] = data;

        //�ε����� �߽����� ���������� ����
        for(int i = 0; i < index-1; i++){
            newArray[i] = this.data[i];
        }

        //�ε����� �߽����� ���ĵ����� ����
        for(int i = newSize-1; i > index-1; i--){
            newArray[i] = this.data[i-1];
        }

        this.data = new int[newSize];

        for(int i = 0; i < newArray.length; i++){
            this.data[i] = newArray[i];
        }
    }

    public int get(int index){
        return this.data[index];
    }

}
