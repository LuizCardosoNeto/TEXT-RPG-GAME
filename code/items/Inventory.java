package code.items;
import java.util.*;
import code.narrative.Choice;
public class Inventory
{
    ArrayList<Item> inventory;
    int backPackSize;
    Weapon EquipedWeapon; 
    //0 = Pockets(5); 1 = SmallBackPack(10);
    //2 = MediumBackPack(15); 3 = BigBackPack(20);

    //Constructor Method
    public Inventory()
    {
        this.inventory = new ArrayList<>();
        this.backPackSize = 5;
        this.EquipedWeapon = null;
    }
    
    //Inventory Methods
    public void AddItem(Item item)
    {
        if(inventory.size() < backPackSize)
        {
            inventory.add(item);
        }
        else
        {
            System.out.println("Não há espaço suficiente em seu inventario!");
        }
        if(item instanceof Weapon)
        {
            boolean EquipWeapon = Choice.Yes_or_No("Deseja equipar "+item+" como sua arma principal?");
            if(EquipWeapon == true)
            {
                EquipedWeapon = (Weapon) item;
            }
        }
    }
    public void RemoveItem(Item item)
    {
        if(inventory.isEmpty())
        {
            System.out.println("Seu inventario está vazio!");
        }
        else
        {
            System.out.println("Digite a posição do item que deseja remover[]:");
            Scanner scn = new Scanner(System.in);
            int pos = scn.nextInt();
            if(pos <= backPackSize)
            {
                inventory.remove(pos);
                System.out.println("Item removido!");
            }
            else
            {
                System.out.println("Não há itens nessa posição");
            }
        }
    
    
    }
    public void IncreaseSize()
    {
        this.backPackSize += 5;
    }
}