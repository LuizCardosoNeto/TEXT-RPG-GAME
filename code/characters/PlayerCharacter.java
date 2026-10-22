package code.characters;

public class PlayerCharacter extends Character
{
    //Constructor Method
    public PlayerCharacter(String name)
    {
        super(10, 2, 5, 4, name);
    }

    //PlayerCharacter Methods
    public void BaseAttack(Character target)
    {
        target.hp -= atk;
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