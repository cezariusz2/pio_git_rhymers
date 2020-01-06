package edu.kis.vh.nursery.list;

/**
 * class which represents linked list
 * works only with integers
 */
public class IntLinkedList {

	Node last;
	int i;

	/**
	 * method adds node to the list and set its value
	 * @param i - value of element to push
	 */
	public void push(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.next = new Node(i);
			last.next.prev = last;
			last = last.next;
		}
	}

	/**
	 * @return true if list is empty
	 */
	public boolean isEmpty() {
		return last == null;
	}

	/**
	 * @return in this case always false
	 */
	public boolean isFull() {
		return false;
	}

	/**
	 * @return value of the last element in list or -1 in case of empty list
	 */
	public int top() {
		if (isEmpty())
			return -1;
		return last.value;
	}

	/**
	 * this method removes last element
	 * @return value of the last element in list
	 */
	public int pop() {
		if (isEmpty())
			return -1;
		int ret = last.value;
		last = last.prev;
		return ret;
	}

}
