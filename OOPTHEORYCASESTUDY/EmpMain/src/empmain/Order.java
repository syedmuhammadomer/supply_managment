  // Order // 
package empmain;
class Order extends Employee
{
    private long orderNumber;
    private int orderDate;
    private String status;
    
    public Order() //Default Contructor
    {
        orderNumber = 0;
        orderDate = 0;
        status = "";
    }
    
    public Order(long orderNum, int orderDat, String Status) // Parametarize Constructor//
    {
        orderNumber = orderNum;
        orderDate = orderDat;
        status = Status;
    }
    
    public long getorderNumber() //Getter setter for private Attributes//
    {
        return orderNumber;
    }
    
    public int getorderDate()
    {
        return orderDate;
    }
    
    public void setStatus(int neworderDa)
    {
        orderDate = neworderDa;
    }
    
    public String getStatus()
    {
        return status;
    }
    
    public void setStatus(String newstatus)
    {
        status = newstatus;
    }
    
    
    
}
