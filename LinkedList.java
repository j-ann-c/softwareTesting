package assignment_1;

public class LinkedList {

	Node head;

/******************************************************
* bool add(LinkedList, int) : appends the specified node to the end of this
* list if e is not present in the list; returns true if a node is added to
* this list, false otherwise.
********************************************************/

	public boolean add(LinkedList list, int data)
	{
		// Create a new node with given data
        Node newNode = new Node(data);
        newNode.next = null;
        Node nodePtr = list.head;

        while (nodePtr != null) {
            if (data == nodePtr.data)
            {
            	return false;
            }
            nodePtr = nodePtr.next;
         }
        if (list.head == null) {
            list.head = newNode;
        }
        else {
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode;
        }
        return true;
	}



/******************************************************
*	bool remove(LinkedList, int): removes the first occurrence of the specified
*	element from this list, if it is present; returns true if a node is removed
* from this list, false otherwise.
********************************************************/

	public boolean remove(LinkedList list, int data)
	{
			 Node nodePtr = list.head, prevNode = null;
   		 boolean flag = false;

        if (nodePtr != null && nodePtr.data == data) {
            list.head = nodePtr.next;
            flag = true;
            return flag;
            }

          while (nodePtr != null && nodePtr.data != data) {
            prevNode = nodePtr;
            nodePtr = nodePtr.next;
        }

        if (nodePtr) {
            prevNode.next = nodePtr.next;
            return true;
        }

        if (!nodePtr)
            return false;

      	return flag;
    }



/******************************************************
*	int size(int): returns the number of elements in this list.
********************************************************/

			public static int size(LinkedList list)
				  {
				      Node nodePtr = list.head;
				      int size = 0;

				      while (nodePtr != null) {
				         size += 1;
				         nodePtr = nodePtr.next;
				      }
				      if (list.head == null) {
				          return 0;
				      }
				      else
				      	return size;
				  }


/******************************************************
* bool equals(LinkedList, LinkedList) : returns true if the input object
* represents the same linked list, false otherwise.
********************************************************/

	public boolean equals(LinkedList list1, LinkedList list2)
	{
		Node nodePtr1 = list1.head;
		Node nodePtr2 = list2.head;
		int size1 = list1.size(list1);
		int size2 = list2.size(list2);
		boolean flag = true;
		if (size1 != size2)
		{
			flag = false;
		}
		else
		{
		while (nodePtr1 != null) {
            if (nodePtr1.data != nodePtr2.data)
            {
            	flag = false;
            }
            nodePtr1 = nodePtr1.next;
            nodePtr2 = nodePtr2.next;
			}
		}
		return flag;
	}




/******************************************************
* void main (String[]) : Driver function
********************************************************/

	public static void main(String[] args)
	{
		int size1 = 0;
		int size2 = 0;
		boolean inserted;
		boolean present = false;
		boolean equal = false;
		LinkedList list1 = new LinkedList();
		LinkedList list2 = new LinkedList();

		inserted = list1.add(list1, 1);
		System.out.println("List1: First number added status: " + inserted);
		inserted = list1.add(list1, 2);
		System.out.println("List1: Second number added status: " + inserted);
		inserted = list1.add(list1, 3);
		System.out.println("List1: Third number added status: " + inserted);
		inserted = list1.add(list1, 4);
		System.out.println("List1: Fourth number added status: " + inserted);
		inserted = list1.add(list1, 4);
		System.out.println("List1: Fifth number added status(duplicate of #4): " + inserted);

		inserted = list2.add(list2, 1);
		System.out.println("List2: First number added status: " + inserted);
		inserted = list2.add(list2, 2);
		System.out.println("List2: Second number added status: " + inserted);
		inserted = list2.add(list2, 3);
		System.out.println("List2: Third number added status: " + inserted);
		inserted = list2.add(list2, 4);
		System.out.println("List2: Fourth number added status: " + inserted);


		System.out.print("\nList 1: ");
		list1.printList(list1);
		System.out.print("\nList 2: ");
		list2.printList(list2);

		present = list1.remove(list1, 1);

		System.out.println("\nThe attempted removed item was in the list: " + present);
		System.out.print("\nList 1: ");
		list1.printList(list1);
		System.out.print("\nList 2: ");
		list2.printList(list2);

		size1 = list1.size(list1);
		size2 = list2.size(list2);
		System.out.println("\nList one is " + size1 + " items long");
		System.out.println("\nList two is " + size2 + " items long");
		equal = list1.equals(list1, list2);
		System.out.println("\nStatus of the equality of the two tested lists: " + equal);
	}
}
