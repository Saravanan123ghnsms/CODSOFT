
import java.util.Scanner;

public class numbergame
{
    public static void main(String[] args) {
         Scanner scan=new Scanner(System.in);
          int a=(int)(Math.random()*101);
          System.out.println("Welcome to the Number game..");
          
          int maxattempts=5;
          int attempts=0;
          boolean result=false;
          while(attempts<=maxattempts)
          {
            System.out.println("enter the number between 1 to 100");
          int ent=scan.nextInt();
            if(ent==a)
            {
                
                result=true;
                break;
                
                
            }
            else if(ent<a)
            {
                System.out.println("Too low ..Try again");
                
            }
            else
            {
                System.out.println("Too high ...Try again");
                
            }
            attempts++;
                 
          }
          if(result)
        {
            System.out.println("Congragulation.. You won the game");
        }
        else
        {
            System.out.println("Max attempts tries...Sorry you lost the game ...the number is "+a);
        }
        
        
    }
}