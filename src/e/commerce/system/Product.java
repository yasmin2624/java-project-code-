package e.commerce.system;
public class Product {
   protected int productId;
   protected String name;        
   protected float price ;

    public Product() {
    }
    public Product(int productId, String name, float price) {
        this.productId =  productId;
        this.name = name;
        this.price =price ;
    }
    public int getProductId() {
        return Math.abs(productId);
    }
    public void setProductId(int productId) {
        this.productId =productId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public float getPrice() {
        return Math.abs(price);
    }
    public void setPrice(float price) {
        this.price = price;
    }   }
