package e.commerce.system;
public class Cart {
    private int customerId ;
    private int nProduct ;
    private Product [] products;
    
    public Cart(int customerId, int nProduct) {
        this.customerId = Math.abs(customerId);
        this.nProduct = Math.abs(nProduct);
        this.products =  new Product [nProduct];
    }
    public int getCustomerId() {
        return customerId;
    }
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
    public int getnProduct() {
        return nProduct;
    }
    public void setnProduct(int nProduct) {
        this.nProduct = nProduct;
    }
    public Product[] getProducts() {
        return products;
    }
    public void setProducts(Product[] products) {
        this.products = products;
    }
    public void addProduct (Product product,int index) {
       if ( index >=0 && index < products.length) {
            products[index] = product;           
      }     }
    public void removeProduct (int index) {
         if(index >= 0 && index <products.length){
             products [index] =null ;
         }       }
   public float  calculatePrice ( ) {
        float total =0.0f;
        for(Product product : products){
            if(product != null ){
                  total +=product.getPrice();
        }   }
       return total ;   
}    
public void  placeOrder (){ 
    Order order =new Order (customerId ,1 , products ,calculatePrice());
   order.printOrderInfo();
}   }


