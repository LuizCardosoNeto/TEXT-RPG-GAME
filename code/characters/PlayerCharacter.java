package code.characters;

public class PlayerCharacter extends Character
{
    private inventory playerInventory;

    //Constructor Method
    public PlayerCharacter(String name)
    {
        super(10, 2, 5, 4, 4, name);
        this.playerInventory = new inventory();
    }

    //PlayerCharacter Methods
    public boolean WeaponInUse()
    {
        if(playerInventory.EquipedWeapon != null)
        {
           this.atk = playerInventory.EquipedWeapon.WeaponDamege;
           return true; 
        }
        else
        {
            return false;
        }
        
    }
    public UseSkill(Skill skill)
    {
        //do something
    }

    public UseItem(Item item)
    {
        //do something
    }

}   