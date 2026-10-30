package code.characters;
import code.itens.*;
public abstract class Character
{
    protected int level = 1;//Initial Level
    protected int xp = 0;//Initial Experience
    protected int maxHp;//Health Points
    protected int hp;//Current Health Points
    protected int maxDp;//Defense Points
    protected int dp;//Current Defense Points
    protected int maxEp;//Effort Points
    protected int ep;//Current Effort Points
    protected int atk;//Attack Damege
    protected String name;//Character name

    //Constructor Method
    public Character(int maxHp, int maxDp, int maxEp, int atk, String name)
    {
        //Max Character Attributes and Name set
        this.maxHp = maxHp;
        this.maxDp = maxDp;
        this.maxEp = maxEp;
        this.atk = atk;
        this.name = name;
        //Actual Atributes set
        this.hp = maxHp;
        this.dp = maxDp;
        this.ep = maxEp;
    }
    //Common Methods
    public void TakeDamage(int damage)
    {
        this.hp -= damage;
        if(this.hp < 0)
        {
            this.hp = 0;
        }
    }
    public void Attack(Character target)
    {
        target.TakeDamage(this.atk);
    }
    public void Heal(int healing)
    {
        this.hp += healing;
        if(this.hp > this.maxHp)
        {
            this.hp = this.maxHp;
        }
    }
    
    public void GainXp(int obtainedXp)
    {
        this.xp += obtainedXp;
        //Character Level System
        while(this.level<10 && xp >= this.level * 50)
        {
            this.xp = this.level * 50;
            LevelUp();
        }
    }
    public void LevelUp()
    {
        this.level += 1;
        this.atk += 1;
        this.maxHp = this.maxHp + this.level; 
        this.maxDp += 1;
        this.maxEp += 2;
    }

}
