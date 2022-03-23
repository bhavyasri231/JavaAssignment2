import java.util.Scanner;

public class JavaAssignment2 {
    public static void main(String[] args) {

        System.out.println("Enter a string");
        Scanner scan = new Scanner(System.in);
        String givenString = scan.nextLine();

        String lowercase = givenString.toLowerCase();

        if(checkForAllAlphabets(lowercase))
        {
            System.out.println("Given string contains all the alphabets");
        }
        else
        {
            System.out.println("Given string does not contain all the alphabets");
        }

    }
    public static boolean checkForAllAlphabets(String str)
    {
        for(int i=97; i<=122;i++)
        {
            String alphabet = Character.toString((char)i);
            if(!(str.contains(alphabet)))
                return false;
        }
        return true;
    }
}
