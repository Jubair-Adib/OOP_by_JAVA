import java.util.*;

public class Array{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for the size of arrays
        System.out.print("Enter the number of elements (n): ");
        int n = scanner.nextInt();
        
        // Declaring arrays
        int[] intArray = new int[n];
        String[] stringArray = new String[n];
        
        // Taking input for integer array
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            intArray[i] = scanner.nextInt();
        }
        
        scanner.nextLine(); // Consume the newline character left by nextInt
        
        // Taking input for string array
        System.out.println("Enter " + n + " strings:");
        for (int i = 0; i < n; i++) {
            stringArray[i] = scanner.nextLine();
        }
        
        // Printing the integer array
        System.out.println("Integer array:");
        for (int num : intArray) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        // Printing the string array
        System.out.println("String array:");
        for (String str : stringArray) {
            System.out.println(str);
        }
        
        int v1[][] = new int[4][5]; 
        for(int i=0; i<4; i++){
            for(int j=0; j<5; j++){
                v1[i][j] = i*j;
            }
        }

        int v3[][][] = new int[4][][];
        v3[0] = new int[5][];
        v3[1] = new int[7][8];

        /*
        Integer array:
        2 5 
        String array:
        dfgdf dfdsf
        dswdsdsdwaf
        */

        scanner.close();
    }
}
