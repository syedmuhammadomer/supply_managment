          // Employee //    
package empmain;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import java.util.Scanner;

class Employee {

    private int EmployeeId;
    private String loginName;
    private String password;
    private String department;
    private String firstName;
    private String lastName;

    public Employee(int EmployeId, String loginName, String password, String department, String firstName, String lastName) // Parametarize Constructor
    {
        this.EmployeeId = EmployeId;
        this.department = loginName;
        this.firstName = password;
        this.lastName = department;
        this.loginName = firstName;
        this.password = lastName;
    }

    public Employee() //Default Constructor//
    {
        this.EmployeeId = 0;
        this.department = "";
        this.firstName = "";
        this.lastName = "";
        this.loginName = "";
        this.password = "";
    }

    public int getEmployId() {
        return EmployeeId;
    }

    public void setEmployeId(int newEmployeId) {
        EmployeeId = newEmployeId;
    }

    public String getloginName() {
        return loginName;
    }

    public void setloginName(String newloginNmae) {
        loginName = newloginNmae;
    }

    public String getdepartment() {
        return department;
    }

    public void setdepartment(String newDepartment) {
        department = newDepartment;
    }

    public String firstName() {
        return firstName;
    }

    public void setfirstName(String newFirstname) {
        firstName = newFirstname;
    }

    public String lastName() {
        return lastName;
    }

    public void setlastName(String newLastname) {
        lastName = newLastname;
    }

    public String getpassword() {
        return password;
    }

    public void setpassword(String newpasword) {
        password = newpasword;
    }

    public void setorderNumber(int neworderNum, int orderNumber) {
        orderNumber = neworderNum;
    }

    static String purchaser = "";
    static String item = "";
    static String cart = "";
    static int number = 0;
    static int items_requested = 0;
    static double cost = 0.0;
    static double total_cost = 0.0;
    static String editRecord = "";
    
   public  static void ViewListOfSupply() {
      System.out.println("\t\tProduct Catalog\n\n");
        product_catalog Pc = new product_catalog();
        Pc.product_catalog();
        
} 
         
        
    

 

  public static void FilterListOfSupply() {
        Scanner sc = new Scanner(System.in);
        String Serch_category;
        System.out.println("Enter Product category by item e.g pencil : ");
        Serch_category = sc.next();
        
        String line = genral.searchRecord(Serch_category);
        
        if (!line.equals("")) {  //Checks whether record was found before putting on Table

            editRecord = line;
            String data[] = line.split("\\|");

            purchaser = (data[0]);
            item = (data[1]);
            cart = (data[2]);
            number = parseInt(data[3]);
            items_requested = parseInt(data[4]);
            cost = parseDouble(data[5]);
            total_cost = parseDouble(data[6]);
          
        }
        System.out.println("Purchaser name : " + purchaser);

        System.out.println("item : " + item);

        System.out.println("Cart name : " + cart);

        System.out.println("number  : " + number);

        System.out.println("number of items requested : " + items_requested);

        System.out.println("cost per unit : " + cost);
        System.out.println("Total cost : " + total_cost);
        
    }
    
  public static ArrayList arr = new ArrayList();
  int A= arr.size();
  public static void OrderMultipleSupply() throws IOException {
        Scanner sc = new Scanner(System.in);
        int NoOrder;
        System.out.println("How many order do you want to give");
        NoOrder = sc.nextInt();
        int i = 1;
        
        while (i <= NoOrder) {

            System.out.println("Enter " + i + " Purchaser name : ");
            purchaser = sc.next();
            System.out.println("Enter " + i + " Product Nsme : ");
            item = sc.next();
            System.out.println("Enter " + i + " Cart name : ");
            cart = sc.next();
            number = i;
            System.out.println("Enter number of items requested : ");
            items_requested = sc.nextInt();
            System.out.println("Enter cost per unit : ");
            cost = sc.nextDouble();
            total_cost = cost * items_requested;
            
            arr.add(item);
            arr.add(items_requested);
            arr.add(total_cost);
            String Gap=" ";
            StringGenrator std = new StringGenrator(purchaser, item, cart, number, items_requested, cost, total_cost,Gap);
            genral.saveRecord(std);
            i++;
        }
    }
  
 public void Display() throws IOException{
    
       Scanner sc = new Scanner(System.in);
        System.out.print("\n Press 1 To View List Of Supply"); 
        System.out.print("\n Press 2 To Filter List Of Supply"); 
        System.out.print("\n Press 3 To Order Multiple Supply"); 
        System.out.print("\n Press 4 To Exit :  "); 
        int choice;
        choice = sc.nextInt();
        if(choice==1 ){
            ViewListOfSupply();
            Display();
        }
        else if(choice==2 ){
            FilterListOfSupply();
            Display();
        }
        else if(choice==3 ){
            System.out.print("\n You Can Now Order Multiple Supply");
           OrderMultipleSupply();
            System.out.print("\n Your Order status Will soon be verified");
            Display();
        }
        else if(choice==4 ){
            Start S = new Start();
            S.main(null);
        }
        else{
           System.out.print("\n  To Exit");  
        }
 }
    public static void main(String[] args) throws IOException {
       
        
        Employee E = new Employee();
        E.Display();
        
        
        
    }
}
