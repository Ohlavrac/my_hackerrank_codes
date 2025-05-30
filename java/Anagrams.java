import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Anagrams {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String stringA = scan.nextLine();
        String stringB = scan.nextLine();
        scan.close();
        
        if (isAnagram(stringA, stringB)) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }
    }
    
    public static Boolean isAnagram(String stringA, String stringB) {
        HashMap<Character, Integer> map = new HashMap<>();
        
        if (stringA.length() != stringB.length()) {
            return false;
        }
        
        
        for (int c = 0; c < stringA.length(); c++) {
            Character currentChar = Character.toLowerCase(stringA.charAt(c));

            if (map.containsKey(currentChar)) {
                map.replace(currentChar, map.get(currentChar) + 1);
            } else {
                map.put(currentChar, 1);
            }
        }
        
        for (int c = 0; c < stringB.length(); c++) {
            Character currentChar = Character.toLowerCase(stringB.charAt(c));

            if (map.containsKey(currentChar)) {
                map.replace(currentChar, map.get(currentChar) + 1);
            } else {
                map.put(currentChar, 1);
            }
        }
        
        for (Map.Entry<Character, Integer> m : map.entrySet()) {
            if (m.getValue() % 2 != 0) {
                return false;
            } else {
                continue;
            }
        }
        
        return true;
    }
}
