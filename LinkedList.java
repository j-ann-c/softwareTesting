package Linked;

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


		Node nodePtr = list.head;
		Node prevNode = null;
   		//boolean flag = false;

   		if (nodePtr == null)
   			return false;


   		if(nodePtr.data == data) {
   			list.head = nodePtr.next;
   			return true;
   		}


       while (nodePtr.next != null && nodePtr.data != data) {
            prevNode = nodePtr;
            nodePtr = nodePtr.next;
        }

        if (nodePtr.next == null) {
            return false;
        }

        if (nodePtr.data == data) {
            prevNode.next = nodePtr.next;
        	return true;

        }

      	return false;


    }



/******************************************************
*	int size(int): returns the number of elements in this list.
********************************************************/

			public int size(LinkedList list)
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


}
