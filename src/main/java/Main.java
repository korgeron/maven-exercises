import java.util.Arrays;
import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        //TODO: Gets user input
        System.out.println("Enter Something: ");
        String reply = scan.nextLine();

        //TODO: Tells user if they entered a number or not
        if (StringUtils.isNumeric(reply)){
            System.out.println("\"" + reply + "\"" + " is a number!");
        } else {
            System.out.println("\"" + reply + "\"" + " is not a number!");
        }

        //TODO: Flip capital letters
        System.out.println(StringUtils.swapCase(reply));

        //TODO: Answer reversal
        System.out.println("This is your answer reversed! " + "\"" + StringUtils.reverse(reply) + "\"");


    }
}
