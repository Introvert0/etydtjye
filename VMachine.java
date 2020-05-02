import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class VMachine 
{

    private List<String> productList = new ArrayList<>();
    private float profit = 0f;

    public VMachine() 
    {
        
    }

    public void addProduct(String product) 
    {
        if (!this.productList.contains(product)) 
        {
            this.productList.add(product);
        }
    }

    // used in instructions 3b, 4b
    public void printSortedStock() 
    {
        /*
            This method is public, to be called on the tester

            Used to print the products sorted by their stock,
            then give the user the option to restock the product
         */
        
        
    }

    // to be used inside printSortedStock()
    private void increaseStock(int id, int quantity) 
    {
        /*
            This method is private, will be used within the class

            It takes the id of the product and the quantity,
            should increase the stock inside the product class
         */
    }

    // used in instructions 3a and 4a
    public void registerSale() 
    {
        /*
            This method is public, to be called on the tester.

            Use this with a While loop or something,
            Its used to register the sales,
            it must call printProducts() to display their id and name,
            and it must use soldProduct() to reduce the stock.

            Print the profit then set it back to 0
         */
        
        
    }

    // to be used inside registerSale()
    private float soldProduct(int id, int quantity) 
    {
        /*
            This method is private, will be used within the class.

            It takes the id of the product from the array, and the
            quantity to reduce from the stock, returns the sales.
         */
        return profit;
    }

    // to be used inside registerSale()
    private void printProducts() 
    {
        /*
            This method is private, will be used within the class.

            Its used to print the product list during soldProducts(),
            this method should print the products and their index
         */
    }

    public List<String> getProductList() 
    {
        return productList;
    }

    public void setProductList(List<String> productList) 
    {
        this.productList = productList;
    }
}
