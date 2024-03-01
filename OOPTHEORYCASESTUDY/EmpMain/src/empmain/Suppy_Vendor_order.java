
package empmain;

import java.util.Scanner;

public class Suppy_Vendor_order {
    Scanner sc = new Scanner(System.in);
    public Suppy_Vendor_order() {
        
    }
     int  Choice;
   public void Display1(){
       System.out.println("\nYour order Has Now Been Recieved By Suppy Vendor Application ");
        System.out.println("Plese Proceed To Complete Your Oder ");
        Display();
   }
   public  void Display(){
       
       
        System.out.println("Do you Want\n Press 1 To recieve Document \n Press 2 Parse/Analyse Document\nPress 3  Marked OrderStatus");
        Choice = sc.nextInt();
            if(Choice == 1){
                //RecieveDoucument();
                //Display();
                Product P = new Product();
            }
            else if(Choice == 2){
                ParseDoucument();
                Display();
            }
            else if(Choice == 3){
                MarkStatus();
                Display();
            }
            else{
               System.out.println("Wrong input! ");  
               Display();
            }
   }
   public void RecieveDoucument(){
       
      String line = genral.viewRecord();
      System.out.println("Ordered Item "+line);
       
   }
   public void ParseDoucument(){
       
        int i = 0;
        String line = genral.viewRecord();

        String[] splitString = line.split("\\|");

        int size = splitString.length;
        System.out.println("\nNow you can View list of supply\n");
        if (i > 1 && i % 7 == 0) {
            System.out.println("\tOrder");
        }
        while (i <= size - 1) {
            System.out.println(splitString[i]);
            i++;
        }
       
   }
   public void MarkStatus(){
       int Status;
       System.out.println("Now if You Have Reviewed The Order Plese Proceed By Marking Status Of Order To PROCEED FURTHER \n Press 1 OrderGenrated \n Press 2 For Order Pending : ");
       Status = sc.nextInt(); 
       if(Status == 1){
                System.out.println("Order have Been Genrated Order Status Genrated \n order is Ready To Be Recieve \n \n Product Have no Added To Product Catalog ");
            }
            else if(Status == 2){
                System.out.println("\tOrder");
            }
            else{
               System.out.println("Wrong input! ");  
               Display();
            }
   }
    
}
