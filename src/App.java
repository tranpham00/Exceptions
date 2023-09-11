import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number (enter exit to quit program): ");
        String number = scan.nextLine();

        while(number != "exit");
        {
            System.out.println("Enter a number (enter exit to quit program): ");
            number = scan.nextLine();
        }  
    }

    public void factor(String num)
    {
        int number = Integer.parseInt(num);

    }
}

/*
 * 
 */