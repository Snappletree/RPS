import java.util.Scanner;
import java.lang.Math;
import java.util.Random;
public class rockPaper
{
    public static void main(String [] agrs){

        int R = 0;
        int S = 2;
        int P = 1;
        
        String answer;
        
        Random generator = new Random(); 
        double cpu = generator.nextInt(3); 
        Scanner reader = new Scanner(System.in);;
        System.out.println("Please pick Rock, Paper, or Scissor. Type 0 to end program.");
        
        
        answer  = reader.nextLine();
        
       
       
            if (cpu == 0)
            {
                System.out.println("Computer says rock");
            }

            else if (cpu ==1)
            {
                System.out.println("Computer says scissor");
            }
            else if (cpu == 2)
            {
                System.out.println("Computer says Paper");
            }

            System.out.println("You picked " + answer);

        
        
        

    }
}
