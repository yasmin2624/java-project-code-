package e.commerce.system;
public class Order {
    private int customerId ;
    private int orderId ;
    private Product [] products;
    private float totalPrice ;

    public Order() {
    } 
    public Order(int customerId, int orderId, Product[] products, float totalPrice) {
        this.customerId = Math.abs(customerId);
        this.orderId = Math.abs(orderId);
        this.products = products;
        this.totalPrice = Math.abs(totalPrice);
    }  
    public int getCustomerId() {
        return customerId;
    }
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
    public int getOrderId() {
        return orderId;
    }
    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }
    public Product[] getProducts() {
        return products;
    }
    public void setProducts(Product[] products) {
        this.products = products;
    }
    public float getTotalPrice() {
        return totalPrice;
    }
    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }
    public void printOrderInfo (){
        System.out.println("customer ID :"+customerId);
        System.out.println("order ID :"+orderId);
        System.out.println("Products : ");
        for (Product product : products) {
            if(product != null ){
            System.out.println("Name :  " +product.getName()  +"  --Price : $ " +product.getPrice());           
            }       }
        System.out.println("Total Price : $ " + calculateTotalPrice());
    }
    private double calculateTotalPrice (){
      double totalPrice =0;
    for(Product product : products){
            if(product != null ){
                  totalPrice +=product.getPrice(); 
    }        }
    return totalPrice ;
    }
}
    
   