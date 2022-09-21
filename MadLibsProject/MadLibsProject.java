import java.util.Scanner;

public class MadLibsProject 
{
    public static void main(String[] args) {
        
        String incomp = "Once, you happened to <verb> and it impacted the <noun> very <adverb>.";
        
        Scanner scan = new Scanner(System.in);

        // System.out.println("Enter something (1): ");
        // String inputOne = scan.nextLine();

        // System.out.println("Enter something (2): ");
        // String inputTwo = scan.nextLine();

        // System.out.println("Enter something (3): ");
        // String inputThree = scan.nextLine();

        int tempOne = incomp.indexOf("<");
        int tempTwo = incomp.indexOf(">");
        System.out.println(tempOne + " " + tempTwo + " " + (tempTwo-tempOne));

        System.out.println(incomp.replaceFirst("<verb>","gadbabh"));


        // System.out.println(inputOne);
        // System.out.println(inputTwo);
        // System.out.println(inputThree);
    }
}