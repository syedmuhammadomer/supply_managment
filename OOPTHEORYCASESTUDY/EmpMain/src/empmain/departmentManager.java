    // Department // 
package empmain;

//import static empmain.Employee.OrderMultipleSupply;
import static empmain.genral.S;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

class departmentManager extends Employee {

    String Request_Status;
    String Reason;

    public departmentManager() {
        super();
        // TODO Auto-generated constructor stub
    }

    public departmentManager(int EmployeId, String loginName, String password, String department, String firstName, String lastName) {
        super(EmployeId, loginName, password, department, firstName, lastName);

    }

    

    public void Track() {
      
        int i=0,j=1,k=2;            
      System.out.println("\t Tracking Spending : \n");
       while(i <=arr.size()-1) { 	
            System.out.println(" Product Name : "+arr.get(i)+" No of Product : "+arr.get(j)+" Total cost : " +arr.get(k));
            i=i+2;
            j=j+2;
            k=k+2;
        }
      
    }

    public void Display() throws IOException {

        Scanner sc = new Scanner(System.in);
        System.out.print("\n Press 1 To Approve Deny Requested Supplies");
        System.out.print("\n Press 2 Order More Supply");
        System.out.print("\n Press 3 track Spending");
        System.out.print("\n Press 4 To Exit :  ");
        int choice;
        choice = sc.nextInt();

        if (choice == 1) {
            Employee E = new Employee();
            System.out.print("****************************************************************\n");
            String line = genral.viewRecord();
       System.out.println("Ordered Item "+line);
            System.out.print("****************************************************************\n");
            int Approve;
            System.out.print("Do You Want To Approve Or Deny Request\n Press 1 For Approve Press 2 For Denial : ");

            Approve = sc.nextInt();
            int Req;
            if (Approve == 1) {
                Request_Status = "Approved";
                System.out.print(Request_Status);
                System.out.print("Do You Want To Add Any other order \n Press 1 For Add Press 2 For Proceed without changes : ");
                Req = sc.nextInt();
                if (Req == 1) {
                    Employee E1 = new Employee();
                    E1.OrderMultipleSupply();
                    System.out.print("Order list Has Been Updated And Send To Supply Vendor");
                } else if (Req == 2) {
                    System.out.print("Order list Has Been Updated And Send To Supply Vendor");
                    Suppy_Vendor_order SVO = new Suppy_Vendor_order();
                    SVO.Display();
                }
            }
            
            
            else if (Approve == 2) {

                Request_Status = "Deniend";
                System.out.print("\nGive Reason For Denial");
                Reason = sc.next();
                System.out.print("\n Reason Has Been Added");
            } else {
                System.out.print("\n Wrong input");
            }
            Display();
        } 
        
        else if (choice == 2) {
            System.out.print("\n You Can Now Order Multiple Supply");
            Employee E = new Employee();
            E.OrderMultipleSupply();
            System.out.print("\n Your Order status Will soon be verified");
            Suppy_Vendor_order SVO = new Suppy_Vendor_order();
            SVO.Display();
        } 
        
        else if (choice == 3) {
            
        } 
        
        else if (choice == 4) {
        Start S = new Start();
        S.main(null);
        } else {
            System.out.print("\n  To Exit");
        }
    }

    public void request_general_supplies() throws IOException {

    }

    public static void main(String[] args) throws IOException {
        departmentManager Dm = new departmentManager();
        Dm.Display();

    }

}
