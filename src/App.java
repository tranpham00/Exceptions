import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number (enter exit to quit program): ");
        String input = scan.nextLine();

        while(!(input.equals("exit")));
        {
            try
            {
              //  int num = Integer.parseInt(input);
              int num = 20;
                factor(num);
            }
            catch(NumberFormatException err)
            {
                System.out.println("Invalid: " + err.getMessage());
            }
            finally
            {
                System.out.println("how dare you");
            }

            System.out.println("enter another number (enter exit to quit program): ");
            input = scan.nextLine();
        }  
    }

    public static void factor(int num)
    {
        /*for(int val = num; val <= num; val--)
        {
            if(num % val == 0)
            {
                System.out.println(val);
            }
        }*/
        System.out.println("loop works");
    }
}
