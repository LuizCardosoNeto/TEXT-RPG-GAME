public abstract class Character
{
    private int level = 1;//Initial Level
    private int xp = 0;//Initial Experience
    private int maxHp;//Health Points
    private int hp;//Current Health Points
    private int maxDp;//Defense Points
    private int dp;//Current Defense Points
    private int maxEp;//Effort Points
    private int ep;//Current Effort Points
    private int atk;//Attack Damege
    private String name;//Character name

    //Constructor Method
    public Character(maxHp, maxDp, maxEp, name)
    {
        //Max Character Attributes and Name set
        this.maxHp = maxHp;
        this.maxDp = maxDp;
        this.maxEp = maxEp;
        this.atk = atk;
        this.name = name;
        //Actual Atributes set
        hp = maxHp;
        dp = maxDp;
        ep = maxEp;
    }
    //Common Methods
    public void TakeDamage(int damage)
    {
        hp -= damage;
        if(hp < 0)
        {
            hp = 0;
        }
    }
    public void Heal(int healing)
    {
        hp += healing;
        if(hp > maxHp)
        {
            hp = maxHp;
        }
    }
    
    public void GainXp(int obtainedXp)
    {
        xp += obtainedXp;
        //Character Level System
        while(level<10 && xp >= level * 50)
        {
            xp = level * 50;
            LevelUp();
        }
    }
    public void LevelUp()
    {
        level += 1;
        maxHp = maxHp + level; 
        maxDp = maxDp + 1;
        maxEp = maxEp + 2;
    }

}
