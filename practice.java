import java.util.Arrays; 
import java.util.Scanner;

public class Practice{

        static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        System.out.println("Hello! What is your name user?");
        String userName = scanner.nextLine();
        System.out.println("Hello! " + userName + ". It's so nice to meet you. ");
    }

}