package chapter05queues;

// This is the most popular implementation and keeps a spot vacant always (front points to that) to check if queue is empty or full
public class MyCircularQueue {

    int[] arr;
    int front;
    int rear;
    int size;
    /** Initialize your data structure here. Set the size of the queue to be k. */
    public MyCircularQueue(int k) {
        arr = new int[k + 1];
        front = 0;
        rear = 0;
        size = k + 1;
    }

    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
        if(isFull()) {
            return false;
        }
        rear = (rear + 1) % size;
        arr[rear] = value;
        return true;
    }

    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
        if(!isEmpty()) {
            front = (front + 1) % size;
            arr[front] = 0;
            return true;
        }
        return false;
    }

    /** Get the front item from the queue. */
    public int Front() {
        if(!isEmpty()) {
            return arr[(front + 1)%size];
        }
        return -1;
    }

    /** Get the last item from the queue. */
    public int Rear() {
        if(!isEmpty()) {
            return arr[rear];
        }
        return -1;
    }

    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
        return (rear == front);
    }

    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
        return ((rear + 1) % size == front);
    }
}
