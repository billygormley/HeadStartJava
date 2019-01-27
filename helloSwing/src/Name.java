import java.util.Scanner;

public class Name {

    public static String getName() {

        System.out.println("What is your name?");

        //Get name from console
        Scanner sc = new Scanner(System.in);

        String myName = sc.nextLine();

        return myName;

    }
}
