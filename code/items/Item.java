package code.items;

public abstract class Item
{
    String name;//Item Name
    int size;//Item size
    int durability;//Item Durability
    

    //Constructor Method
    public Item(String name, int size, int durability)
    {
        this.name = name;
        this.size = size;
        this.durability = durability;
    }

    //Common Methods for Items
    public void ConsumeDurability(Item item, int spent)
    {
        durability -= spent;
        if(durability <= 0)
        {
            durability = 0;
            BreakItem(Item);
        }
    }
    public void BreakItem(Item item)
    {
        system.out.printLn(item +"quebrou!");
        //Beaking system
    }
}