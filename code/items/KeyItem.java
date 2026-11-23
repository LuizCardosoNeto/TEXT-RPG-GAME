package code.items;

public class KeyItem extends Item
{
    private int ID;

    //Constructor Method
    public KeyItem(String name, int size, int durability, int ID)
    {
        super(name, size, 1);
        this.ID = ID;
    }

    //KeyItems Methods
    public void UseKeyItem(KeyItem item)
    {
        System.out.println("Você usou "+ item);
        item = null;
        //KeyItems are for single use only.
    }
    
}