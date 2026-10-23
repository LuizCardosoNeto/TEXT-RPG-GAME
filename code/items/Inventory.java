package code.items;
import java.util.Scanner;

public class Inventory
{
    ArrayList<Item> inventory;
    int backPackSize; 
    //0 = Pockets(5); 1 = SmallBackPack(10);
    //2 = MediumBackPack(15); 3 = BigBackPack(20);

    //Constructor Method
    public Inventory()
    {
        ArrayList<Item> inventory = new ArrayList<Item>;
        int backPackSize = 5;
    }
    
    //Inventory Methods
    public void AddItem(Item item)
    {
        if(inventory.size() <= backPackSize)
        {
            inventory.add(item);
        }
        else
        {
            system.out.printLn("Não há espaço suficiente em seu inventario!")
        }
    }
    public void RemoveItem(Item item)
    {
       system.out.printLn("Digite a posição do item que deseja remover[]:");
       Scanner scn = new Scanner(System.in);
       int pos = scn.nextLine();
       if(pos <= backPackSize)
       {
        inventory.remove(pos);
        system.out.printLn("Item removido!")
       }
       else
       {
        system.out.printLn("Não há itens nessa posição")
       }
    }
    public void IncreaseSize(int backPackSize)
    {
        backPackSize += 5;
    }
}