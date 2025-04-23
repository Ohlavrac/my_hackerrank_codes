import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();
        
        
        if (isAPalindrome(s)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
    
    public static boolean isAPalindrome(String name) {
        String result = "";
        
        for (int c = name.length()-1; c >= 0; c--) {
            result = result + "" + String.valueOf(name.charAt(c));
        }
                
        if (result.equals(name)) {
            return true;
        } else {
            return false;
        }
    }
}
