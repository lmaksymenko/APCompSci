import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class CompanyData {
	 
	private ArrayList <Employee> empList= new ArrayList <Employee>(10);
	private ArrayList <Manager> manList= new ArrayList <Manager>();
	
	
	public ArrayList<Employee> getEmpLog() {
		return empList;
	}

	
	public ArrayList<Manager> getManLog() {
		return manList;
	}
	
	
	public void addManager(String name, int ID, String username, String password) {
		
		Manager manag = new Manager(name, ID, username, password);
		manList.add(manag);
	
	}
	
	
	public void addEmployee(String name, int ID, String occ, String username, String password) {
		Employee empl = new Employee(name, ID, occ, username, password);
		empList.add(empl);
	}

	
	public void serialize() {
		
		System.out.println("Serialization running.");
	
		try {
		 //save employee list
		 // for writing or saving binary data
         FileOutputStream fos = new FileOutputStream("EmployeeArrayList.ser");

         // converting java-object to binary-format 
         ObjectOutputStream  oos = new ObjectOutputStream(fos);

         // writing or saving ArrayList values to stream
         oos.writeObject(empList);
         oos.flush();
         oos.close();
         
         System.out.println("Serialized empList");
         
         //save manager list
         // for writing or saving binary data
         FileOutputStream fos1 = new FileOutputStream("ManagerArrayList.ser");

         // converting java-object to binary-format 
         ObjectOutputStream  oos1 = new ObjectOutputStream(fos1);

         // writing or saving ArrayList values to stream
         oos1.writeObject(empList);
         oos1.flush();
         oos1.close();
         
         System.out.println("Serialized manList.");
	 } 
    catch (IOException fnfex) {
         fnfex.printStackTrace();
     }
	 
	}

	
	//not working
	@SuppressWarnings("unchecked")
	public void deserialize() {
	    try {
	    	 System.out.println("Trying to load EmployeeArrayList.ser");
	    	// reading binary data
	       FileInputStream fis = new FileInputStream("EmployeeArrayList.ser");
	
	        // converting binary-data to java-object
	       ObjectInputStream ois = new ObjectInputStream(fis);
	
	        // reading object's value and casting ArrayList<String>
	       empList = (ArrayList<Employee>) ois.readObject();
	        
	       System.out.println("Throwing exceptions for EmployeeArrayList.ser");

	    } 
	    catch (FileNotFoundException fnfex) {
	        fnfex.printStackTrace();
	    }
	    catch (IOException ioex) {
	        ioex.printStackTrace();
	    } 
	    catch (ClassNotFoundException ccex) {
	        ccex.printStackTrace();
	    }
	   
	     System.out.println("EmployeeArrayList.ser loaded");
	    
	    try {
	       
	    	System.out.println("Trying to load ManagerArrayList.ser");
	        
	       // reading binary data
		    FileInputStream fis1 = new FileInputStream("ManagerArrayList.ser");
		
		    // converting binary-data to java-object
		    ObjectInputStream ois1 = new ObjectInputStream(fis1);
		
		    // reading object's value and casting ArrayList<String>
		    manList =  (ArrayList<Manager>) ois1.readObject();
		   
		    System.out.println("Throwing exceptions for ManagerArrayList.ser");
		    
	    } 
	    catch (FileNotFoundException fnfex) {
	        fnfex.printStackTrace();
	    }
	    catch (IOException ioex) {
	        ioex.printStackTrace();
	    } 
	    catch (ClassNotFoundException ccex) {
	        ccex.printStackTrace();
	    }
	    
	     System.out.println("ManagerArrayList.ser loaded");
	    
	    
	    
	    
	}


}


