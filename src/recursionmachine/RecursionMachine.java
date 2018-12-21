package RecursionMachine;


import java.io.FileNotFoundException;
import java.util.Scanner;

public class RecursionMachine {

    /**
     * The main method
     * @param args the arguments
     * @throws FileNotFoundException the file not found exception
     */

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter File Name: ");
        String fileName = "input.txt";

        System.out.println("\nExecuting " + fileName + "...");
        CommandProcessor cp = new CommandProcessor(fileName);
        cp.run();

        System.out.print("\nEnter the number of execution: ");
        int numberOfExecution = scan.nextInt();

        CommandProcessor cp2 = new CommandProcessor(numberOfExecution);   // Create another instance of CommandProcessor to try overloaded constructor
        cp2.run(numberOfExecution); // overloaded method of run

        System.out.println();
        System.out.println(numberOfExecution + " times executed");
        System.out.println("Work Completed");
    }
}
