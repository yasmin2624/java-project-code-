package e.commerce.system;
public class EletronicProduct extends Product {
    private String brand ;
    private int warrantyPeriod ;

    public EletronicProduct() {
    }   
    public EletronicProduct(String brand, int warrantyPeriod, int productId, String name, float price) {
        super(productId, name, price);
        this.brand = brand;
        this.warrantyPeriod = warrantyPeriod;
    }       
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public int getWarrantyPeriod() {
        return Math.abs(warrantyPeriod);
    }
    public void setWarrantyPeriod(int warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
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
