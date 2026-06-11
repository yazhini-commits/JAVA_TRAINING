package QUEUE;

public class QUEUE_USING_ARRAY {

     public static void main(String[] args) {
          ArrayQueue q = new ArrayQueue(5);

          q.enqueue(10);
          q.enqueue(20);
          q.enqueue(30);
          q.enqueue(40);

          System.out.print("Queue: ");
          q.display();

          System.out.println("Dequeued: " + q.dequeue());
          System.out.println("Dequeued: " + q.dequeue());

          q.enqueue(50);
          q.enqueue(60);

          System.out.print("Queue: ");
          q.display();

          System.out.println("Peek: " + q.peek());
     }
}

class ArrayQueue {
     private final int[] arr;
     private int front;
     private int rear;
     private int size;

     ArrayQueue(int capacity) {
          this.arr = new int[capacity];
          this.front = -1;
          this.rear = -1;
          this.size = 0;
     }

     boolean isEmpty() {
          return size == 0;
     }

     boolean isFull() {
          return size == arr.length;
     }

     void enqueue(int item) {
          if (isFull()) {
               System.out.println("Queue Overflow");
               return;
          }

          if (isEmpty()) {
               front = 0;
               rear = 0;
          } else {
               rear = (rear + 1) % arr.length;
          }

          arr[rear] = item;
          size++;
     }

     int dequeue() {
          if (isEmpty()) {
               System.out.println("Queue Underflow");
               return -1;
          }

          int item = arr[front];

          if (size == 1) {
               // After removing last element
               front = -1;
               rear = -1;
          } else {
               front = (front + 1) % arr.length;
          }

          size--;
          return item;
     }

     int peek() {
          if (isEmpty()) {
               System.out.println("Queue is empty");
               return -1;
          }
          return arr[front];
     }

     void display() {
          if (isEmpty()) {
               System.out.println("Queue is empty");
               return;
          }

          int idx = front;
          for (int i = 0; i < size; i++) {
               System.out.print(arr[idx] + (i == size - 1 ? "" : " <- "));
               idx = (idx + 1) % arr.length;
          }
          System.out.println();
     }
}
