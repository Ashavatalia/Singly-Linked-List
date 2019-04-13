/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlistsingly;

/**
 *
 * @author ashavatalia
 */
public class EmployeeLinkedList {

    EmployeeNode head, tail;
    int size = 0;

    /* insert at the last position */
    public void insertAtLast(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);
        if (isEmpty()) {
            head = node;
            tail = node;
            head.setNext(null);
            size++;
        } else {
            tail.setNext(node);
            tail = node;
            size++;
        }
    }

    /* insert at the first position */
    public void insertAtFront(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);
        if (isEmpty()) {
            head = node;
            head.setNext(null);
            size++;
        } else {
            node.setNext(head);
            head = node;
            size++;
            //head.setNext(null);
        }
    }

    /* insert at the given position */
    public void insertAtGivenPosition(Employee employeem, Employee prevEmployee) {
        EmployeeNode node = new EmployeeNode(employeem);
        EmployeeNode current = head;
        if (isEmpty()) {
            head = node;
            head.setNext(null);
            size++;
        }
        while (current.employee != prevEmployee) {
            current = current.getNext();
        }
        node.setNext(current.getNext());
        current.setNext(node);
        size++;
    }

    /* remove from the first position */
    public EmployeeNode removeEmployeeFromFront() {
        EmployeeNode temp = head;
        if (isEmpty()) {
            return null;
        }
        head = head.next;
        size--;
        temp.setNext(null);
        return temp;
    }

    /* remove from the last position */
    public EmployeeNode removeEmployeeFromLast() {
        EmployeeNode current = head;
        while (current.getNext() != tail) {
            current = current.getNext();
        }
        tail = current;
        tail.setNext(null);
        size--;
        return current;
    }

    /* remove at the given position */
    public EmployeeNode removeEmployeeAtGivenPosition(Employee employee) {
        EmployeeNode current = head;
        EmployeeNode temp;
        while (current.getNext().employee != employee) {
            current = current.getNext();
        }
        //current.setNext(current.getNext().getNext());
        temp = current.getNext();
        current.setNext(temp.getNext());
        size--;
        temp.setNext(null);
        return temp;
    }

    /* print all nodes */
    public void printEmployee() {
        EmployeeNode current = head;
        if (isEmpty()) {
            System.out.println("No Employee available!");
        }
        while (current != null) {
            System.out.println(current.employee);
            current = current.getNext();
        }
    }

    /* check whether list is empty */
    public boolean isEmpty() {
        return head == null;
    }
}
