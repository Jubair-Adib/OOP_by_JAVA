import java.util.*;

public class Variable{
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);

        // Taking inputs
        System.out.print("Enter an integer: ");
        int intValue=scanner.nextInt();
        
        scanner.nextLine(); // Consume the newline character left by nextInt
        
        System.out.print("Enter a string: ");
        String stringValue=scanner.nextLine();
        
        System.out.print("Enter a long: ");
        long longValue=scanner.nextLong();
        
        System.out.print("Enter a character: ");
        char charValue=scanner.next().charAt(0);
        
        System.out.print("Enter a double: ");
        double doubleValue=scanner.nextDouble();
        
        System.out.print("Enter a float: ");
        float floatValue=scanner.nextFloat();
        
        // Printing the values
        System.out.println("Integer: "+intValue);
        System.out.println("String: "+stringValue);
        System.out.println("Long: "+longValue);
        System.out.println("Character: "+charValue);
        System.out.println("Double: "+doubleValue);
        System.out.println("Float: "+floatValue);

        scanner.close();
    }
}
