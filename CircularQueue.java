class CircularQueue {

    int size = 4;
    String[] queue = new String[size];
    int front = -1;
    int rear = -1;

    // Enqueue operation
    void enqueue(String passenger) {

        // Check for overflow
        if ((rear + 1) % size == front) {
            System.out.println(passenger + " cannot be added queue overflow!");
            System.out.println();
            return;
        }

        // First element
        if (front == -1) {
            front = 0;
            rear = 0;
        } else {
            rear = (rear + 1) % size;
        }

        queue[rear] = passenger;

        System.out.println(passenger + " ENQUEUED");
        display();
    }

    // Dequeue operation
    void dequeue() {

        if (front == -1) {
            System.out.println("Queue Underflow!");
            return;
        }

        String passenger = queue[front];
        queue[front] = null;

        System.out.println(passenger + " DEQUEUED");

        // If only one element was present
        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % size;
        }

        display();
    }

    // Display queue
    void display() {

        System.out.print("Queue : ");

        if (front == -1) {
            System.out.println("Empty");
            System.out.println("Front = " + front + " Rear = " + rear);
            return;
        }

        int i = front;

        while (true) {
            System.out.print(queue[i]);

            if (i == rear)
                break;

            System.out.print(" <- ");
            i = (i + 1) % size;
        }

        System.out.println();
        System.out.println("Front = " + front + " Rear = " + rear);
        System.out.println();
    }

    public static void main(String[] args) {

        CircularQueue cq = new CircularQueue();

        // Enqueue passengers P1 to P5
        cq.enqueue("P1");
        cq.enqueue("P2");
        cq.enqueue("P3");
        cq.enqueue("P4");
        cq.enqueue("P5");

        // Dequeue two passengers
        cq.dequeue();
        cq.dequeue();

        // Enqueue P6 and P7
        cq.enqueue("P6");
        cq.enqueue("P7");
    }
}
