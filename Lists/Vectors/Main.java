package Lists.Vectors;

import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args){
        List<Employee> employeeList = new Vector<>();
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

        //add new object into a specific index
        employeeList.add(3,new Employee("John", "Doe", 4567));
        //print the entire list again
        employeeList.forEach(employee->System.out.println(employee));
        System.out.println();

        //change from ArrayList to Array -> using toArray() built in method
        Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);
        for(Employee employee: employeeArray){
            System.out.println(employee);
        }
        
        //this will result in false because they are 2 different objects we created not the same instance. 
        //For this we need to override the equal and hashcode methods through using auto generate
        System.out.println(employeeList.contains(new Employee("Mary", "Smith", 22)));
        System.out.println(employeeList.indexOf(new Employee("John", "Doe", 4567)));

        //remove from arrayList
        employeeList.remove(2);
        //print the entire list again
        employeeList.forEach(employee->System.out.println(employee));
    }
}
