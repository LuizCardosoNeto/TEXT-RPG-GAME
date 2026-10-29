package code.narrative;
import java.util.Scanner;

public class Choice
{
    private Scanner scanner;

    public Choice()
    {
        this.scanner = new Scanner(System.in);

        public boolean Yes_or_No(String question)
        {
            while(true)
            {
                system.out.printLn(question +" [S/N]");
                String input = Scanner.nextLine().trim().toUpperCase();

                if(input.equals("S")|input.equals("SIM"))
                {
                    return true;
                }
                else if(input.equals("N")|input.equals("NAO")|input.equals("NÃO"))
                {
                    return false;
                }
                else
                {
                    system.out.printLn("Opção invalida! Tente novamente!");
                }
            }
        }
    }
}