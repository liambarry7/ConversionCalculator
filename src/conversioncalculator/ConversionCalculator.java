package conversioncalculator;
import java.util.*;

public class ConversionCalculator {

    
    
    public static void getBinary() {
        Scanner input = new Scanner(System.in);
        int[] conversion = new int[8];
        
        System.out.println("Enter Denary number");
        int userNumber = input.nextInt();
        
        for (int i = 0; i < 8; i++) {
            int binaryNumber = userNumber % 2;
            //System.out.println(binaryNumber);
            userNumber = userNumber / 2;
            conversion[i] = binaryNumber;
        }        
        
        System.out.println("Your Binary Number is:");
        
        for (int i = 7; i >= 0; i--) {
            System.out.print(conversion[i]);
        }
        System.out.println("");
    }
    
    
    public static void getDenary() {
        Scanner input = new Scanner(System.in);
        
        int[] binary = new int[8];
        int p = 0;
        int finalValue = 0;
        
        System.out.println("Enter your 8-bit binary number digit by digit.");
        
        for (int i = 0; i < binary.length; i++) { //gets binary numbers
            int userBinary = input.nextInt();
            binary[i] = userBinary;            
        }
        
        for (int i = 0; i < binary.length; i++) {
        System.out.print(binary[i]); //prints binary numbers in one line
            
        }
        
        for (int i = 7; i >= 0; i--) {
            double power = Math.pow(2, p); //Get base system number t o be used as power
            int toThePower = (int) power; //converts double into int            
            p++; //adds 1 to p so that the power increase by 1 each time
            
            int denary = binary[i] * toThePower;
            finalValue = finalValue + denary;            
            //System.out.println(binary[i] * toThePower);            
        }        
        System.out.println("\nYour Denary number is: " + finalValue + ".");
    }
    
    public static void getHex() {
        Scanner input = new Scanner(System.in);
        
        int choice = 0;
        
        boolean valid = false;
        while (valid == false) {
            
            try {
                System.out.println("1- Convert Hexadecimal into Binary.");
                System.out.println("2- Convert Binary into Hexadecimal.");
                System.out.println("3- Return.");
                choice = input.nextInt();
            } catch (Exception e) {
                System.out.println("Error occured: " + e);
                System.out.println("Please enter a number.");
            }
            
            if (choice == 1) {
                hexToBin();
            } else if (choice == 2) {
                binToHex();
            } else if (choice == 3) {
                valid = true;
            } else {
                System.out.println("Re-Enter Number.");
            }
            
            
        }
    }
    
    public static void hexToBin() {
        Scanner input = new Scanner(System.in);
    }
    
    public static void binToHex() {
        Scanner input = new Scanner(System.in);
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int choice = 0;
        
        boolean valid = false;
        while (valid == false) {

            try {
                System.out.println("\nWelcome To The Number Conversion Calculator!");
                System.out.println("1- Convert Denary to Binary.");
                System.out.println("2- Convert Binary to Denary.");
                System.out.println("3- Hexadecimal Converter.");
                System.out.println("4- Quit.");
                choice = input.nextInt();

            } catch (Exception e) {
                System.out.println("Error Occured: " + e);
                System.out.println("Please enter a number.");
                input.next();
            }

        if (choice == 1) {
            getBinary();
        } else if (choice == 2) {
            getDenary();
        } else if (choice == 3) {
            getHex();
        } else if (choice == 4) {
            System.out.println("Goodbye.");
            valid = true;
        } else {
            System.out.println("Re-Enter Number.");
        }


            
        }


        
        
        
   

    }
    
}
