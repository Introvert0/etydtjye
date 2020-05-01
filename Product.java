public class Product
{
    private String name;
    private String itemPrice;
    private int totItems;
    
    public Product(String n, String i, int t)
    {
        name = n;
        itemPrice = i;
        totItems = t;
    }
    
    public String getName()
    {
        return name;
    }
    public void setName(String n)
    {
        name = n;
    }
    
    public String getItemPrice()
    {
        return itemPrice;
    }
    public void setItemPrice(String i)
    {
        itemPrice = i;
    }
    
    public int getTotItems()
    {
        return totItems;
    }
    public void setTotItems(int t)
    {
        totItems = t;
    }
    
}
