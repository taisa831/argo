package listandstring;

public class Main {


    public static void main(String[] args) {

        boolean result;

        // 1-1
        result = new NoDuplicateString().isUniqueChars("ABCDEE");
        System.out.println(result);

        // 1-2
        result = new OrderCheck().permutation("god", "dog");
        System.out.println(result);

        // 1-4
        result = new Palindrome().isPermutationOfPalindrome("Tact Coa");
        System.out.println(result);

        // 1-5

        // 1-6
        String strResult;
        strResult = new CompressString().compress("aabccccaaa");
        System.out.println(strResult);

        // 1-7

        // 1-8

        // 1-9
        result = new RotateString().isRotation("waterbottle", "erbottlewat");
        System.out.println(result);

    }
}
