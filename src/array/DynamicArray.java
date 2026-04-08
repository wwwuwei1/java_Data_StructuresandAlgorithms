package array;

public class DynamicArray {
    private int size = 0;
    private int capacity = 8;
    private int[] array = new int[capacity];

    //插入
    public void add(int index, int element){
        if(index >= 0 && index <= size){
            System.arraycopy(array, index, array, index + 1, size - index);
        }
        array[index] = element;
        size++;
    }

    public void addLast(int element){
        add(size, element);
    }

    public int get(int index){
        return array[index];
    }

    public void forEach(){
        for(int i = 0; i < size; i++){
            System.out.println(array[i]);
        }
    }
}
