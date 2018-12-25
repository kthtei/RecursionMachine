package RecursionMachine;

public class RecursionMethod {
    public static int factorial(int n) {
        if (n == 1) return 1;
        return n * factorial(n - 1);
    }

    public static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static int powerN(int base, int n) {
        if (n == 1) return base;
        return base * powerN(base, n-1);
    }

    public static int sumDigits(int n) {
        if (n < 10) return n;
        return n % 10 + sumDigits(n / 10);
    }

    public static int count11(String str) {
        if (str.length() < 2) return 0;
        if (str.substring(0, 2).equals("11")) return 1 + count11(str.substring(2));
        else return count11(str.substring(1));
    }
    public static String stringClean(String str) {
        if (str.length() < 2) return str;
        if (str.charAt(0) == str.charAt(1)) return stringClean(str.substring(1));
        else return str.charAt(0) + stringClean(str.substring(1));
    }

    public static int strCount(String str, String sub) {
        if (str.length() < sub.length()) return 0;
        if (str.substring(0, sub.length()).equals(sub)) {
            return 1 + strCount(str.substring(sub.length()), sub);
        } else return strCount(str.substring(1), sub);
    }

    public static String allStar(String str) {
        if (str.equals("")) return "";
        if (str.length() == 1) return str;
        return str.charAt(0) + "*" + allStar(str.substring(1));
    }

    public static String endX(String str) {
        if (str.equals("")) return "";
        if (str.charAt(0) == 'x') return endX(str.substring(1)) + "x";
        else return str.charAt(0) + endX(str.substring(1));
    }

    public static int strDist(String str, String sub) {
        if (str.equals("")) return 0;
        if (!str.startsWith(sub)) return strDist(str.substring(1), sub);
        if (!str.endsWith(sub)) return strDist (str.substring(0, str.length()-1), sub);
        return str.length();
    }
    
    public static boolean groupSum6(int start, int[] nums, int target) {
        if(start >= nums.length){
            return target == 0;
        }

        if(nums[start] != 6 && groupSum6(start + 1, nums, target)){
            return true;
        }
        return groupSum6(start+1, nums, target - nums[start]);
    }

    public static boolean groupNoAdj(int start, int[] nums, int target) {
        if (start >= nums.length) return (target == 0);

        if (groupNoAdj(start + 2, nums, target - nums[start])) return true;
        if (groupNoAdj(start + 1, nums, target)) return true;
        return false;
    }

    /**
     * 
     * @param str random strings that has a numbers in format of "1, 2, 3, 4" with random length.
     * @return Return an int array to pass to the methods that take an array as an argument
     */
    public static int[] createAnIntArray(String str) {
        String[] strArray = str.split(",");
        int[] intArray = new int[strArray.length];
        for (int i = 0; i < strArray.length; i++) {
            strArray[i] = strArray[i].trim();
            intArray[i] = Integer.parseInt(strArray[i]);
        }
        return intArray;
    }
}
