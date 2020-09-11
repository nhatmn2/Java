package Lists.LinkedLists;

public class EmployeeSinglyLinkedLists{
    private EmployeeNode head;

    //create a method to add a node to the front of the linked list
    public void addToFront(Employee employee){
        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head);
        head = node;
    }

    //create a method to print the list
    public void printList(){
        EmployeeNode current = head;
        System.out.print("HEAD -> ");

        while (current != null){
            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNext();

        }
        System.out.println("null");
    }
}