
class Queue{
	int elements[];
	int front,rear = -1;
	int elements_size;

	public Queue(int size){
		elements = new int[size];
		elements_size = size;
	};

	// Add data to queue
	public void enqueue(int x){
		if(front==-1)front++;
		if(rear==elements_size-1){
			System.out.println("List is full");
		}else{
		
			elements[++rear] = x;	
		}
	};

	// Remove top element from queue
	public int dequeue(){
		if(isEmpty()){
			System.out.println("Queue is empty");
			System.exit(1);
		}
		return elements[++front];
	};

	// Return top element from queue
	public int peek(){
		if(isEmpty()){
			System.out.println("Queue is empty");
			System.exit(1);
		}
		return elements[front];
	}

	// Check if queue is empty
	public boolean isEmpty(){
		if(front==-1 && rear==-1){
			return true;
		}
		return false;
	}

	// Display elements in queue
	public void display(){
		int i;
		for( i = front; i <= rear; i++){
			System.out.println(elements[i]);
        }
	};

	public static void main(String args[]){
		Queue queue = new Queue(5);
		queue.enqueue(45);
		queue.enqueue(20);
		queue.enqueue(90);

		queue.dequeue();
		System.out.println(queue.peek());

		queue.display();
	};
}