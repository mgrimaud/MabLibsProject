import java.util.Scanner;

public class MadLibsProject 
{
    public static void main(String[] args) {
        
        String incomp = "Once, you happened to <verb> and it impacted the <noun> very <adverb>.";
        // String incomp = "Once, you happened to <verb> and it impacted the <noun> very <adverb>.";
        // String incomp = "Once, you happened to <verb> and it impacted the <noun> very <adverb>.";
        
        Scanner scan = new Scanner(System.in);
        int count = 0;
        for (int j = 0; j < incomp.length(); j++) {
            if (incomp.substring(j,j+1).equals("<")) {
                count++;
            }
        }

        for (int i = 0; i < count; i++) {
            int tempOne = incomp.indexOf("<");
            int tempTwo = incomp.indexOf(">");
            // System.out.println(tempOne + " " + tempTwo + " " + (tempTwo-tempOne));


            System.out.println("Enter " + incomp.substring((tempOne+1), tempTwo) + ": ");
            String input = scan.nextLine();

            incomp = incomp.replaceFirst(incomp.substring(tempOne, tempTwo+1), input);
            // System.out.println(incomp);
        }

        scan.close();
        System.out.println(incomp);
    }
}