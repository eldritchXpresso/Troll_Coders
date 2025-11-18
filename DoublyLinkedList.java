public class DoublyLinkedList implements SimpleList {
	public class Node {
		Integer value = null;
		Node next = null;
		Node previous = null;

		public Node(Integer value) {
			this.value = value;
		}

		public Integer getValue() {
			return value;
		}

		public void setValue(Integer value) {
			this.value = value;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

		public Node getPrevious() {
			return previous;
		}

		public void setPrevious(Node previous) {
			this.previous = previous;
		}
	}

	// The beginning of the list
	private Node head = null;
	public Node tail = null;
	// The number of elements in the list
	private int size = 0;

	/**
	 * Removes the element at the specified position in this list.
	 * Shifts any subsequent elements to the left (subtracts one from their
	 * indices). Returns the value that was removed from the list.
	 *
	 * @param index - the index of the element to be removed
	 * @return the value previously at the specified position
	 * @throws IndexOutOfBoundsException - if the index is out of range (index < 0 || index >= size())
	 */
	@Override
	public Integer remove(int index) throws IndexOutOfBoundsException {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Index Out Of Bounds: " + index);
		}

		Node target;

		if (index == 0) {
			target = head;
			head = head.getNext();
			if (head != null) {
				head.setPrevious(null);
			} else {
				tail = null;
			}
		} else {
			Node currentNode = head;
			for (int i = 0; i < index - 1; i++) {
				currentNode = currentNode.getNext();
			}
			target = currentNode.getNext();
			currentNode.setNext(target.getNext());
			if (target.getNext() != null) {
				target.getNext().setPrevious(currentNode);
			} else {
				tail = currentNode;
			}
		}

		size--;
		return target.getValue();
	}

	/**
	 * Print the values in the list in order from the front.
	 * For example: [ 1, 2, 4, 8, 16 ]
	 */
	public void printList() {
		System.out.print("[ ");
		Node currentNode = head;

		while (currentNode != null) {
			System.out.print(currentNode.getValue());
			currentNode = currentNode.getNext();
			if (currentNode != null) System.out.print(", ");
		}

		System.out.println(" ]");
	}

	/**
	 * prints the entire list starting from the tail of the list and working
	 * backwards through the list by following the previouse node references.
	 */
	public void printReverse() {
		System.out.print("[ ");
		Node currentNode = tail;
		while (currentNode != null) {
			System.out.print(currentNode.getValue());
			currentNode = currentNode.getPrevious();
			if (currentNode != null) System.out.print(", ");
		}
		System.out.println(" ]");
	}

	/**
	 * Inserts the specified element at the specified position in this list.
	 * Shifts the element currently at that position (if any) and any subsequent
	 * elements to the right (adds one to their indices).
	 * Prohibits the insertion of a null value into the list.
	 *
	 * @param index - index at which the specified element is to be inserted
	 * @param value - value to be inserted
	 * @throws IndexOutOfBoundsException - if the index is out of range (index < 0 || index > size())
	 * @throws IllegalArgumentException  - if the value specified is null
	 */
	@Override
	public void add(int index, Integer value)
			throws IndexOutOfBoundsException, IllegalArgumentException {
		if (value == null) {
			throw new IllegalArgumentException("Null values not allowed");
		}
		if (index < 0 || index > size) {
			throw new IndexOutOfBoundsException("Index Out Of Bounds: " + index);
		}

		Node newNode = new Node(value);

		if (index == 0) {
			// add to front
			newNode.setNext(head);
			newNode.setPrevious(null);
			if (head != null) {
				head.setPrevious(newNode);
			}
			head = newNode;
			if (size == 0) {
				tail = newNode;
			}
		} else if (index == size) {
			// add to end
			newNode.setNext(null);
			newNode.setPrevious(tail);
			if (tail != null) {
				tail.setNext(newNode);
			}
			tail = newNode;
			if (size == 0) {
				head = newNode;
			}
		} else {
			// add after node at index - 1
			Node currentNode = head;
			for (int i = 0; i < index - 1; i++) {
				currentNode = currentNode.getNext();
			}
			newNode.setNext(currentNode.getNext());
			newNode.setPrevious(currentNode);
			currentNode.getNext().setPrevious(newNode);
			currentNode.setNext(newNode);
		}

		size++;
	}

	/**
	 * Returns the value at the specified position in this list.
	 *
	 * @param index - index of the element to return
	 * @return the value at the specified position in this list or null if empty
	 * @throws IndexOutOfBoundsException - if the index is out of range (index < 0 || index >= size())
	 */
	@Override
	public Integer get(int index) throws IndexOutOfBoundsException {
		// validate index argument
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Index Out Of Bounds: " + index);
		}
		// Check if list is empty
		if (isEmpty()) {
			return null;
		}
		Node currentNode = find(index);
		return currentNode.getValue();
	}

	private Node find(int index) throws IndexOutOfBoundsException {
		// validate index argument
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Index Out Of Bounds: " + index);
		}
		Node currentNode = head;
		for (int i = 0; i < index; i++) {
			currentNode = currentNode.getNext();
		}
		return currentNode;
	}

	/**
	 * Returns true if this collection contains no elements.
	 *
	 * @return true if this collection contains no elements
	 */
	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	/**
	 * Returns the number of elements in this collection. If this collection
	 * contains more than Integer.MAX_VALUE elements, returns Integer.MAX_VALUE.
	 *
	 * @return the number of elements in this collection
	 */
	@Override
	public int size() {
		return size;
	}

	/**
	 * Retrieves the node at index
	 * @param index
	 * @return the node at index
	 */
	public Node getNode(int index) {
		return find(index);
	}
}
