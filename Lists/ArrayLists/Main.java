package Lists.ArrayLists;

import java.util.*;

public class Main {
    public static void main(String[] args){
        ArrayList<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Jane", "Jones", 123));
        employeeList.add(new Employee("John", "Doe", 4567));
        employeeList.add(new Employee("Mary", "Smith", 22));
        employeeList.add(new Employee("Mike", "Wilson", 3245));

        //employee in here is a lambda expression
        employeeList.forEach(employee-> System.out.println(employee));
        
        //print the second employee in the list
        System.out.println(employeeList.get(1));

        //check to see if it's empty
        System.out.println(employeeList.isEmpty());

        //replace with new Employee object --> in this case is the second object
        employeeList.set(1, new Employee("John", "Adams",4568));

        //give 1 more empty line
        System.out.println();

        //now print the entire ArrayList again 
        employeeList.forEach(employee->System.out.println(employee));

        //tell how many employee this will be added 
        System.out.println(employeeList.size());

    }
}
