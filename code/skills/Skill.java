package code.skills;

public abstract class Skill
{
   protected String name;
   protected String description;
   protected int cost;
   protected SkillType type; //ENUM {OFFENSSIVE, PASSIVE, DEFENSIVE, BUFF}

   public enum SkillType
   {
      OFFENSIVE,
      PASSIVE,
      DEFENSIVE,
      BUFF
   }
   //Constructor Method
   public Skill()
   {
      this.name = name;
      this.description = description;
      this.cost = cost;
      this.type = type;
   }
   //Skill Methods
   public abstract void Execute(Character caster, Character target);
   //Abstract Method
   public boolean CanAffort(Character caster)
   {
      if(caster.ep >= cost)
      {
         return true;
      }
      else
      {
         return false;
      }
   }


}