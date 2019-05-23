package listandstring;

public class Main {

    public static void main(String[] args) {

        boolean result = new NoDuplicateString().isUniqueChars("ABCDEE");
        System.out.println(result);

        new OrderCheck().permutation("god", "dog");
        System.out.println(result);

        result = new Palindrome().isPermutationOfPalindrome("Tact Coa");
        System.out.println(result);

    }
}
