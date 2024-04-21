package e.commerce.system;
import java.util.Scanner;
public class ECommerceSystem {
public static void main(String[] args) {

    Scanner input =new Scanner (System.in);

     System.out.println("Welcome to the E-commerce System ! ") ;
     System.out.print("\nPlease enter your ID :  ");
     int ID = input .nextInt();
     System.out.print("Please enter your name  :  ");
     String name = input .nextLine();
     input.nextLine();
     System.out.print("Please enter your address :  ");
     String address =input.nextLine();
     
     System.out.println("How many product  you want to add to you cart ? ");
     int nProduct =input .nextInt();
     
EletronicProduct electronicProduct = new EletronicProduct("Samsung",1,1,"smartphone",599.99f);
ClothingProduct clothingProduct = new ClothingProduct("Medium","cotton",2,"T-shirt",19.99f);
BookProduct bookProduct = new BookProduct (" O’Reilly","X Pubications",3,"oop",39.99f);
Customer customer = new Customer (ID,name ,address);

Cart cart = new Cart (ID ,nProduct);

int productID = 0;
for(int i =0; i< nProduct ; i++){
    System.out.println("Which product would you want to add ? 1- smartPhone  2- T-shirt  3- oop ");
     productID = input .nextInt();
    
    switch (productID){
        case 1 :
            cart.addProduct( electronicProduct,i);
            break;
            
        case 2 :
            cart.addProduct( clothingProduct,i);
            break;
            
        case 3 :
             cart.addProduct (bookProduct,i);
            break;
            
        default:
            System.out.println("Invalid Product ID .");
    }
}
System.out.println("Your total is "+cart.calculatePrice()+" $ .");
System.out.println("Would you like to place the order ?  1-Yes  2-No ");
int user = input.nextInt();
if(user ==1){
    System.out.println("Here’s your order’s summary : ");
    cart.placeOrder();
}else {
    cart.removeProduct(productID);
    System.out.println("thank you for your time  ");
}
}}
