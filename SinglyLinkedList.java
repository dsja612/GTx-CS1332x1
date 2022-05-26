import java.util.NoSuchElementException;

/**
 * Your implementation of a Singly-Linked List.
 */
public class SinglyLinkedList<T> {

    /*
     * Do not add new instance variables or modify existing ones.
     */
    private SinglyLinkedListNode<T> head;
    private SinglyLinkedListNode<T> tail;
    private int size;

    /*
     * Do not add a constructor.
     */

    /**
     * Adds the element to the front of the list.
     *
     * Method should run in O(1) time.
     *
     * @param data the data to add to the front of the list
     * @throws java.lang.IllegalArgumentException if data is null
     */
    public void addToFront(T data) {
        // WRITE YOUR CODE HERE (DO NOT MODIFY METHOD HEADER)!
        if (data == null) {
            throw new IllegalArgumentException("Data is null");
        }
        if (this.head == null && this.tail == null) {   // Empty linked list
            SinglyLinkedListNode<T> temp = new SinglyLinkedListNode<>(data, null);
            this.head = temp;
            this.tail = temp;
        } else if (this.head == this.tail) {    // Linked list with length of 1
            SinglyLinkedListNode<T> temp = new SinglyLinkedListNode<>(data, this.head);
            this.tail.setNext(null);
            this.head = temp;
        } else {    // Default
            this.head = new SinglyLinkedListNode<>(data, this.head);
        }
        this.size++;
    }

    /**
     * Adds the element to the back of the list.
     *
     * Method should run in O(1) time.
     *
     * @param data the data to add to the back of the list
     * @throws java.lang.IllegalArgumentException if data is null
     */
    public void addToBack(T data) {
        // WRITE YOUR CODE HERE (DO NOT MODIFY METHOD HEADER)!
        if (data == null) {
            throw new IllegalArgumentException("Data is null");
        }
        if (this.head == null && this.tail == null) {   // Empty linked list
            SinglyLinkedListNode<T> temp = new SinglyLinkedListNode<>(data, null);
            this.head = temp;
            this.tail = temp;
        } else if (this.head == this.tail) {    // Linked list with length of 1
            SinglyLinkedListNode<T> temp = new SinglyLinkedListNode<>(data, null);
            this.tail.setNext(temp);
            this.tail = temp;
        } else {    // Default
            SinglyLinkedListNode<T> temp = new SinglyLinkedListNode<>(data, null);
            this.tail.setNext(temp);
            this.tail = temp;
        }
        this.size++;
    }

    /**
     * Removes and returns the first data of the list.
     *
     * Method should run in O(1) time.
     *
     * @return the data formerly located at the front of the list
     * @throws java.util.NoSuchElementException if the list is empty
     */
    public T removeFromFront() {
        // WRITE YOUR CODE HERE (DO NOT MODIFY METHOD HEADER)!
        if (this.head == null) {
            throw new NoSuchElementException("Data is null");
        }
        T val = this.head.getData();
        if (this.head == this.tail) {
            this.head = null;
            this.tail = null;
        } else {
            this.head = this.head.getNext();
        }
        this.size--;
        return val;
    }

    /**
     * Removes and returns the last data of the list.
     *
     * Method should run in O(n) time.
     *
     * @return the data formerly located at the back of the list
     * @throws java.util.NoSuchElementException if the list is empty
     */
    public T removeFromBack() {
        // WRITE YOUR CODE HERE (DO NOT MODIFY METHOD HEADER)!
        if (this.head == null) {
            throw new NoSuchElementException("Data is null");
        }
        T val = this.tail.getData();
        if (this.head == this.tail) {
            this.head = null;
            this.tail = null;
        } else {
            SinglyLinkedListNode<T> curr = this.head;
            while (curr.getNext() != this.tail) {
                curr = curr.getNext();
            }
            curr.setNext(null);
            this.tail = curr;
        }
        this.size--;
        return val;
    }

    /**
     * Returns the head node of the list.
     *
     * For grading purposes only. You shouldn't need to use this method since
     * you have direct access to the variable.
     *
     * @return the node at the head of the list
     */
    public SinglyLinkedListNode<T> getHead() {
        // DO NOT MODIFY THIS METHOD!
        return head;
    }

    /**
     * Returns the tail node of the list.
     *
     * For grading purposes only. You shouldn't need to use this method since
     * you have direct access to the variable.
     *
     * @return the node at the tail of the list
     */
    public SinglyLinkedListNode<T> getTail() {
        // DO NOT MODIFY THIS METHOD!
        return tail;
    }

    /**
     * Returns the size of the list.
     *
     * For grading purposes only. You shouldn't need to use this method since
     * you have direct access to the variable.
     *
     * @return the size of the list
     */
    public int size() {
        // DO NOT MODIFY THIS METHOD!
        return size;
    }

    @Override
    public String toString() {
        if (this.head == null) {
            return "null";
        } else if (this.head.getNext() == null) {
            return this.head.getData().toString();
        } else {
            return this.head.getData().toString() + ", " + this.head.getNext().toString();
        }
    }

}