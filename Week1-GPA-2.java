//Complete the definition of the given class by defining appropriate constructors and member functions such that it is in coherence with the given main method and produce the required output
import java.util.Scanner;

class Employee{
	    String ename1;
	    String eid1;
	    String edept1;
        public Employee(){
            ename1="Guest";
        }
        public Employee(String name,String id,String dept){
            this.ename1 = name;
            this.edept1=dept;
            this.eid1=id;
        }
        public void copyDept(Employee e){
            this.edept1=e.edept1;
        }
        public void displayDetails(){
            System.out.println("ename : "+ename1);
            System.out.println("eid : "+eid1);
            System.out.println("edept : "+edept1);
        }
    }
public class App{
	    public static void main(String args[]) 
	    {
		        Scanner s = new Scanner(System.in);
		        Employee e1 = new Employee();
		
		        //Enter name of the employee
		        String name = s.nextLine();
		
		        //Enter id of the employee
		        String id = s.nextLine();
		
		        //Enter department of the employee
		        String dept = s.nextLine();
		
		        Employee e2 = new Employee(name,id,dept);
		
		        e1.copyDept(e2); 
		        //Copies the department name of e2 into e1's department name.
		
		        e1.displayDetails();
	    }
    }
