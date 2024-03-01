// Order Item//
package empmain;
class orderNumber extends Order
{
    //Attributes//
    private String productNumber;
    private short quantity;
    private float unitPrice;
    
    public orderNumber()  //Default Constructor//
    {
        this.productNumber = "";
        this.quantity = 0;
        this.unitPrice = 0.0F;
    }
    
    //Parametarize Constructor//
    public orderNumber(String productNum, short Quantity, float unitPrce)  
    {
        this.productNumber = productNum ;
        this.quantity = Quantity;
        this.unitPrice = unitPrce;
    }
    
    // User get the status with the help of getter method // 
    public String getproductNumber(String productNum)
    {
        return productNum;
    }
    
    public short quantity(short Quantity)
    {
        return Quantity;
    }
    
    public float unitPric(float unitPrc)
    {
        return unitPrc;
    }
}
