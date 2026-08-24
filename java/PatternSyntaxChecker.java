import java.io.*;
import java.util.*;
import java.util.regex.*;


public class PatternSyntaxChecker {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nInputs = scan.nextInt();
        scan.nextLine();
        List<String> textInputs = new ArrayList<String>();
        for (int c = 0; c < nInputs; c++) {
            String input = scan.nextLine();
            textInputs.add(input.trim());
        }
        scan.close();
        
        for (String regex : textInputs) {
            try {
                Pattern.compile(regex);
                System.out.println("Valid");
            } catch (PatternSyntaxException exception) {
                System.out.println("Invalid");
            }
        }
    
    }
}