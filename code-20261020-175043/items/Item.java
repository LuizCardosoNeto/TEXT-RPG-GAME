public abstract class Item
{
    String name;
    int size;
    int durability;
    

    //Constructor Method
    public Item()
    {
        //do something
    }
    public void ConsumeDurability(int spent)
    {
        durability -= spent;
    }
}