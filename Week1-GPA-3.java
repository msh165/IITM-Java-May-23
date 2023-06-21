// // Complete the definition of the given class by defining appropriate constructors and member functions such that it is in coherence with the given main method and produce the required output
import java.util.*;

class Employee
{
    String eid;
    String ename;
    String eprojects[];

    public Employee(String id, String name, String[] project){
        this.eid=id;
        this.ename=name;
        this.eprojects=project;
    }

    public Employee(Employee e){
        this.eid=e.eid;
        this.ename=e.ename;
        this.eprojects=e.eprojects.clone();

    }


    public void mutator()
        {
            this.ename = "Mr "+ this.ename;
            this.eprojects[0] = null;
            
        }
    public void display(){
        System.out.println("id:"+this.eid);
        System.out.println("name:"+this.ename);
        System.out.println("projects:");
        for(String project : eprojects){
            System.out.print(project+":");
        }
    }

}
public class App
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
    	String project[] = {"P001","P002","P003"};
        //Enter the id of employee
        String id = s.nextLine();
        //Enter the name of employee
        String name = s.nextLine();
        
        Employee e1 = new Employee(id,name,project);
        //All the values added by the user have been input into Employee e1

        Employee e2 = new Employee(e1); 
        //The copy constructor must copy all the data members. 
       
        e1.mutator();
        
        e2.display();
    }
}
