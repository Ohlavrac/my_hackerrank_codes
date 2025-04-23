import java.util.*;

public class StringIntroduction {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String myStringA = scan.nextLine();
        String myStringB = scan.nextLine();

        scan.close();

        int stringASize = myStringA.length();
        int stringBSize = myStringB.length();
        int totalStringSize = stringASize + stringBSize;

        String firstLetterStringA = String.valueOf(myStringA.charAt(0));
        String firstLetterStringB = String.valueOf(myStringB.charAt(0));

        String newStringA = myStringA.replace(
            firstLetterStringA, 
            firstLetterStringA.toUpperCase()
        );

        String newStringB = myStringB.replace(
            firstLetterStringB,
            firstLetterStringB.toUpperCase()
        );

        System.out.println(totalStringSize);
        System.out.println(verifyLexicographicallyGreater(myStringA, myStringB));
        System.out.println(newStringA + " " + newStringB);
    }
    
    public static String verifyLexicographicallyGreater(String stringA, String stringB) {
        
        if (stringA.charAt(0) > stringB.charAt(0)) {
            return "Yes";
        } else {
            return "No";
        }
    } 
}
