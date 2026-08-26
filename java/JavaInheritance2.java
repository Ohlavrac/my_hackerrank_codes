import java.io.*;
import java.util.*;

public class JavaInheritance2 {

    public static void main(String[] args) {
        
        
        Adder adder = new Adder();
        
        System.out.println("My superclass is: " + adder.getClass().getSuperclass().getSimpleName());
        System.out.println(adder.add(20,22) + " " + adder.add(6,7) + " " + adder.add(10,10));
    }
}

class Arithmetic {
    int add(int number1, int number2) {
       return number1 + number2; 
    }

}

class Adder extends Arithmetic {
    
}