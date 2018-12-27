package RecursionMachine;

import java.util.Random;

public class RandomInput {
    public String inputGenerator() {
        String result = "";

        switch (1 + new Random().nextInt(12)) {
            case 1: // starting from factorial in order
                result = "factorial<SEP>" + randomNumber();
                break;
            case 2:
                result = "fibonacci<SEP>" + randomNumber();
                break;
            case 3:
                result = "powerN<SEP>" + randomNumber() + "<SEP>" + randomNumber();
                break;
            case 4:
                result = "sumDigits<SEP>" + randomNumber();
                break;
            case 5:
                result = "count11<SEP>" + randomString();
                break;
            case 6:
                result = "stringClean<SEP>" + randomString();
                break;
            case 7:
                result = "strCount<SEP>" + randomString() + "<SEP>" + randomString();
                break;
            case 8:
                result = "allStar<SEP>" + randomString();
                break;
            case 9:
                result = "endX<SEP>" + randomString();
                break;
            case 10:
                result = "strDist<SEP>" + randomString() + "<SEP>" + randomString();
                break;
            case 11:
                result = "groupSum6<SEP>" + randomNumber() + "<SEP>" + randomNumbersForAnIntArray() +
                        "<SEP>" + randomNumber();
                break;
            case 12:
                result = "groupNoAdj<SEP>" + randomNumber() + "<SEP>" + randomNumbersForAnIntArray() +
                        "<SEP>" + randomNumber();
                break;
        }
        return result;
    }

    public char randomCharacter() {
        return (char) (97 + new Random().nextInt(26)); // return a character between a-z
    }

    public int randomNumber() {
        return 1 + new Random().nextInt(10); // generating random number between 1-10
    }

    public String randomNumbersForAnIntArray() {  // The string method to create an input to create an int array
        String result = "";
        for (int i = 0; i < randomNumber() - 1; i++) { // numberArray length between 1-10
            result += "" + randomNumber() + ", ";
        }
        return result + randomNumber();
    }

    public String randomString() {
        String result = "";
        for (int i = 0; i < randomNumber(); i++) {
            result += randomNumber() > 7 ? randomNumber() + "" : randomCharacter() + ""; // 80% time it's a character otherwise a number
        }
        return result;
    }
}
