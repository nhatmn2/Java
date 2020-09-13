package Lists.LinkedLists;

public class EmployeeSinglyLinkedLists{
    private EmployeeNode head;
    private int size;
    //create a method to add a node to the front of the linked list
    public void addToFront(Employee employee){
        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head);
        head = node;
        size++;
    }

    //create a getSize method
    public int getSize(){
        return size;
    }

    //create a method to check if a linked list isEmpty
    public boolean isEmpty(){
        return head == null;
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

    //create the method to remove a node
    public EmployeeNode removeFromFront(){
        if (isEmpty()){
            return null;
        }

        EmployeeNode removeNode = head;
        head = head.getNext();
        size--;
        removeNode.setNext(null);
        return removeNode;
    }
}