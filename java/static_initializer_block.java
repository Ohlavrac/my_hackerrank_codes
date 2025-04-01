import java.io.*;
import java.util.*;

public class static_initializer_block {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int b = scan.nextInt();
        int h = scan.nextInt();
        
        try {
            int result = areaOfParallelogram(b, h);
            System.out.println(result);
        } catch (Exception exception) {
            System.out.print(exception.getMessage());
        }
    }
    
    public static int areaOfParallelogram(int breadth, int height) throws Exception {
        
        if (breadth <= 0 || height <= 0) {
            throw new Exception("java.lang.Exception: Breadth and height must be positive");
        } else {
            int area = breadth * height;
            return area;
        }
        
    }
}
