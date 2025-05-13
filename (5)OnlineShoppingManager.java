package BM23AI021;
import java.util.Vector;
class Product{
    String name;
    double price;
    String category;
    public Product(String name,double price,String category){
        this.name= name;
        this.price=price;
        this.category=category;
    }
}
public class OnlineShoppingManager  {
    private Vector<Product> inventory;
    public OnlineShoppingManager(){
        inventory=new Vector<>();
    }

    public void addProduct(String name,double price,String category){
        Product product=new Product(name,price,category);
        inventory.add(product);
    }
    public void removeProduct(String name) {
        for (int i = 0; i < inventory.size(); i++) {
            if (inventory.get(i).name.equalsIgnoreCase(name)) {
                inventory.remove(i);
                break;
            }
        }
    }
    public void displayInventory(){
        System.out.println("Inventory:");
        for(Product product:inventory){
            System.out.println("Name:"+product.name+"\tPrice:"+product.price+"\tCategory:"+product.category);
        }
    }
    public static void main(String[] args){
        OnlineShoppingManager manager=new OnlineShoppingManager();
        manager.addProduct("Laptop",25000,"Electronics");
        manager.addProduct("T-shirt",100,"Clothing");
        manager.addProduct("Book",980,"Books");
        manager.displayInventory();
        manager.removeProduct("T-shirt");
        manager.displayInventory();
    }
}
