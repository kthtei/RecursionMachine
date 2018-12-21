package RecursionMachine;

import java.io.*;
import java.util.Scanner;

public class CommandProcessor {
    /** The fileName. */
    private String fileName;

    /** number of Execution entered from the user. */
    private int numberOfExecution;

    /** Constructor taking String arguments for file name. */
    CommandProcessor(String fileName) {
        this.fileName = fileName;
    }

    /** Overloaded constructor taking number of executions to run */
    CommandProcessor(int numberOfExecution) {
        this.numberOfExecution = numberOfExecution;
    }

    /**
     * Run.
     * @throws FileNotFoundException the file not found exception
     */

    public void run() throws FileNotFoundException {
        File file = new File(fileName);
        Scanner scan = new Scanner(file);

        while (scan.hasNextLine()) {
            String line = scan.nextLine();
            String[] splitted = line.split("<SEP>");
            splitted[0] = splitted[0].trim();

            String caseName = splitted[0];
            String input1 = splitted.length < 2 ? "" : splitted[1].trim();
            String input2 = splitted.length < 3 ? "" : splitted[2].trim();

            switch (splitted[0]) {
                case "factorial":
                    System.out.println(caseName + "(" + input1 + ") -> "
                            + RecursionMethod.factorial(Integer.parseInt(input1)));
                    break;
                case "fibonacci":
                    System.out.println(caseName + "(" + input1 + ") -> "
                            + RecursionMethod.fibonacci(Integer.parseInt(input1)));
                    break;
                case "powerN":
                    System.out.println(caseName + "(" + input1 + ", " + input2 + ") -> "
                            + RecursionMethod.powerN(Integer.parseInt(input1), Integer.parseInt(input2)));
                    break;
                case "sumDigits":
                    System.out.println(caseName + "(" + input1 + ") -> " + RecursionMethod.sumDigits(Integer.parseInt(input1)));
                    break;
                case "count11":
                    System.out.println(caseName + "(" + input1 + ") -> " + RecursionMethod.count11(input1));
                    break;
                case "stringClean":
                    System.out.println(caseName + "(" + input1 + ") -> " + RecursionMethod.stringClean(input1));
                    break;
                case "strCount":
                    System.out.println(caseName + "(" + input1 + ", " + input2 + ") -> "
                            + RecursionMethod.strCount(input1, input2));
                    break;
                case "allStar":
                    System.out.println(caseName + "(" + input1 + ") -> " + RecursionMethod.allStar(input1));
                    break;
                case "endX":
                    System.out.println(caseName + "(" + input1 + ") -> " + RecursionMethod.endX(input1));
                    break;
                case "strDist":
                    System.out.println(caseName + "(" + input1 + ", " + input2 + ") -> "
                            + RecursionMethod.strDist(input1, input2));
                    break;
                case "":
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
        }
        scan.close();
    }

    /**
     * Overloaded run.
     * @param numberOfExecution the number of execution method run executes.
     */

    public void run(int numberOfExecution) {
        int count = 0;

        while (count != numberOfExecution) {
            RandomInput ri = new RandomInput();

            String str = ri.inputGenerator();
            Scanner scan = new Scanner(str);

            String line = scan.nextLine();
            String[] splitted = line.split("<SEP>");
            splitted[0] = splitted[0].trim();

            String caseName = splitted[0];
            String input1 = splitted.length < 2 ? "" : splitted[1].trim();
            String input2 = splitted.length < 3 ? "" : splitted[2].trim();

            switch (splitted[0]) {
                case "factorial":
                    System.out.println(caseName + "(" + input1 + ") -> "
                            + RecursionMethod.factorial(Integer.parseInt(input1)));
                    break;
                case "fibonacci":
                    System.out.println(caseName + "(" + input1 + ") -> "
                            + RecursionMethod.fibonacci(Integer.parseInt(input1)));
                    break;
                case "powerN":
                    System.out.println(caseName + "(" + input1 + ", " + input2 + ") -> "
                            + RecursionMethod.powerN(Integer.parseInt(input1), Integer.parseInt(input2)));
                    break;
                case "sumDigits":
                    System.out.println(caseName + "(" + input1 + ") -> " + RecursionMethod.sumDigits(Integer.parseInt(input1)));
                    break;
                case "count11":
                    System.out.println(caseName + "(" + input1 + ") -> " + RecursionMethod.count11(input1));
                    break;
                case "stringClean":
                    System.out.println(caseName + "(" + input1 + ") -> " + RecursionMethod.stringClean(input1));
                    break;
                case "strCount":
                    System.out.println(caseName + "(" + input1 + ", " + input2 + ") -> "
                            + RecursionMethod.strCount(input1, input2));
                    break;
                case "allStar":
                    System.out.println(caseName + "(" + input1 + ") -> " + RecursionMethod.allStar(input1));
                    break;
                case "endX":
                    System.out.println(caseName + "(" + input1 + ") -> " + RecursionMethod.endX(input1));
                    break;
                case "strDist":
                    System.out.println(caseName + "(" + input1 + ", " + input2 + ") -> "
                            + RecursionMethod.strDist(input1, input2));
                    break;
                case "":
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
            count++;
            scan.close();
        }
    }
}
