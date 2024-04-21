package e.commerce.system;
public class ClothingProduct extends Product {
    private String size ;
    private String fadric ;

    public ClothingProduct() {
    }   
    public ClothingProduct(String size, String fadric, int productId, String name, float price) {
        super(productId, name, price);
        this.size = size;
        this.fadric = fadric;
    }
    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        this.size = size;
    }
    public String getFadric() {
        return fadric;
    }
    public void setFadric(String fadric) {
        this.fadric = fadric;
    }
    public int getProductId() {
        return Math.abs(productId);
    }
    public void setProductId(int productId) {
        this.productId = productId;
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
    }

 
    
    
    
}
