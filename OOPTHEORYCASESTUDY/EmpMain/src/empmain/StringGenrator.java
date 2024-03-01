
package empmain;

public class StringGenrator {
    String purchaser;
    String item;
    String cart;
    int number;
    int items_requested;
    double cost;
    double total_cost;
    String Gap;
    public StringGenrator(String purchaser, String item, String cart, int number, int items_requested, double cost, double total_cost,String Gap) {
        this.purchaser = purchaser;
        this.item = item;
        this.cart = cart;
        this.number = number;
        this.items_requested = items_requested;
        this.cost = cost;
        this.total_cost = total_cost;
        this.Gap=Gap;
    }
    
   public String toString() {
        return (purchaser + "|" + item + "|" + cart + "|"
                + number + "|" + items_requested + "|" + cost + "|"
                + total_cost+"|"+Gap);
    }
    
    
}
