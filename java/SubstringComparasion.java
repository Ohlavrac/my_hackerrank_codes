import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SubstringComparasion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
    
    public static String getSmallestAndLargest(String s, int k) {
    
        ArrayList<String> subStringsList = new ArrayList<String>();
        
        int aux = k;
        for (int index = 0; index < s.length(); index+=k) {
            if (aux > s.length()) {
                break;
            }
            subStringsList.add(s.substring(index, aux));
            aux = aux+k;
        }
        
        for (int index = 0; index < s.length(); index++) {
            if (index+k > s.length()) {
                break;
            }
            subStringsList.add(s.substring(index, index+k));
        }
                            
        Collections.sort(subStringsList);         
                    
        return subStringsList.get(0) + "\n" + subStringsList.get(subStringsList.size()-1);
    }
}