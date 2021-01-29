package Queue;

public class MyQueue {
    public class ArrayQueue{
        private int front;
        private int rear;
        private int capacity;
        private int[] array;
        private ArrayQueue(int size){
            capacity=size;
            front=-1;
            rear=-1;
            array=new int[size];
        }
    }
}
