
public class LinkedList{
	Node head;

    // Static so that its accessible by main class
	static class Node{
		int data;
		Node next;

		Node(int d){
			data = d;
			next = null;
		}
	}

    // Time complexity of insertAfter() is O(1)
    public void push(int data){
    	Node newNode = new Node(data);   // creates new Node
    	newNode.next = head;
    	head = newNode;
    }

    // Inserts a new node after the given prev_node.
    // Time complexity of insertAfter() is O(1)
    public void insertAfter(int data,Node prevNode){
    	Node newNode = new Node(data);

    	newNode.next = prevNode.next;
    	prevNode.next = newNode.next;
    }

    // Time complexity of append is O(n) coz of the need to traverse the whole list.
    public void append(int data){
    	Node newNode = new Node(data);
    	

    	if (head == null){  // if Node is the only one present
    	 	head = newNode; 
    	 	return; 
    	} 

    	Node startNode = head;
    	while(startNode.next!=null){    // loop until last Node
    		startNode = startNode.next;
    	};

    	startNode.next = newNode;
    }

    public void deleteNode(int data){
    	Node newNode = new Node(data);
    	Node startNode = head,prev=null;

    	while(startNode!= null && startNode.data!=newNode.data){
    		prev =startNode ;
    		startNode = startNode.next;
    	};
    	

        // If key was not present in linked list 
        if (startNode == null) return; 
  
        // Unlink the node from linked list 
        prev.next = startNode.next; 

    }
    // List traversal
	public void printList(){
		Node startNode = head;
		while(startNode!=null){
			System.out.println("Data" + startNode.data);
			startNode = startNode.next;
		}

	}

	public static void main(String[] args) {
		LinkedList llist = new LinkedList();
		
		llist.append(2);
		llist.push(1);
		llist.append(3);
		llist.push(4);
		llist.printList();
		llist.deleteNode(2);
		llist.printList();
	}
}