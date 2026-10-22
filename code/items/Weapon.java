package code.items;

public class Weapon extends Item
{
    private int bonusDamege;

    //Constructor Method
    public Weapon(String name, int size, int durability, int bonusDamege)
    {
        super(name, size, durability);
        this.bonusDamege = bonusDamege;
    }

    //Weapon Methods
    public void WeaponDamege(Weapon weapon)
    {
        return PlayerCharacter.atk + bonusDamege;
    }
}