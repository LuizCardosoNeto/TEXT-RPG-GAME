package code.items;

public class Consumable extends Item
{
    private String typeConsumable;

    //Constructor Method
    public Consumable(String name, int size, int durability, String typeConsumable)
    {
        super(name, size, durability);
        this.typeConsumable = typeConsumable;
    }
    
}