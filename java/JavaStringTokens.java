import java.io.*;
import java.util.*;

public class JavaStringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().trim();
        scan.close();
        
        if (s.isEmpty()) {
            System.out.println(0);
            return;
        }
        
        String regex = "[^a-zA-Z0-9]+";
        String[] t = s.split(regex);
        
        System.out.println(t.length);
        for (String data : t) {
            System.out.println(data);
        }
    }
}