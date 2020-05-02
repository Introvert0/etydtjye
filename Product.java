public class Product
{
    private String name;
    private double cost;
    private int totItems;
    
    public Product(String n, double c, int t)
    {
        name = n;
        cost = c;
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
    
    public double getCost()
    {
        return cost;
    }
    public void setCost(double c)
    {
        cost = c;
    }
    
    public int getTotItems()
    {
        return totItems;
    }
    public void setTotItems(int t)
    {
        totItems = t;
    }
    
    public String toString()
    {
        return String.format("%-38s", name) + "\t" + 
               String.format("%-38s", "$" + cost) + "\t" +
        String.format("%-38s", totItems + " left in the vending machine");
    }
}
