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
public class LinkedListSingly {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Employee Harvey = new Employee("Harvey", "Specter", 1001);
        Employee Mike = new Employee("Michael", "Ross", 1002);
        Employee Rachel = new Employee("Rachel", "Zane", 1003);

        EmployeeLinkedList list = new EmployeeLinkedList();

        /* insert at last position */
//        list.insertAtLast(Harvey);
//        list.insertAtLast(Mike);
//        list.insertAtLast(Rachel);

        /* insert at first position */
        list.insertAtFront(Harvey);
        list.insertAtFront(Mike);
        list.insertAtFront(Rachel);

        /* insert at given position */
//        list.insertAtLast(Harvey);
//        list.insertAtLast(Rachel);
//        list.insertAtGivenPosition(Mike, Harvey);

          list.printEmployee();
          System.out.println("Total number of employee: "+list.size);
         
    }

}
