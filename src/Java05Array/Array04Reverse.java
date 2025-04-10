package Java05Array;

import java.util.Arrays;
import java.util.Scanner;

public class Array04Reverse {

    // Program to Display Array
    public static void displayArray(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

    // 1. Reverse In Array Methods
    public static int[] reverseArray(int[] arr) {
        int[] reverse = new int[arr.length];
        int j = 0;

        int n = arr.length;

        for (int i = n - 1; i >= 0; i--) {
            reverse[j++] = arr[i];
        }
        return reverse;
    }

    // 2. Program to Reverse Integer
    public static int reverseInteger(int num) {
        int rev = 0;
        while (num != 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }
        return rev;
    }

    // 3. Program to Reverse String Integer
    public static void reverseStringInteger(int num) {
        StringBuffer sb = new StringBuffer(String.valueOf(num));
        sb.reverse();
        System.out.println(sb);
    }

    // 4. check Palindrome Number
    public static boolean checkPalindrome(int num) {

        int newNum = 0;
        int sum = 0;
        int temp = num;
        while (num > 0) {
            newNum = num % 10;
            sum = (sum * 10) + newNum;
            num = num / 10;
        }

        return temp == sum;
    }

    // 5. check palindrom number using String Builder
    public static boolean isPalindrome(String str) {
        // Convert the number to a string
        // String str = Integer.toString(num);

        // Reverse the string
        StringBuilder reversed = new StringBuilder(str).reverse();
        return str.equals(reversed.toString());
    }

    // 6: To find palindrome numbers within a long integer using an array,
    public static boolean isPalindrome(int number) {

        char[] digits = Integer.toString(number).toCharArray();

        int start = 0;
        int end = digits.length - 1;

        while (start < end) {
            if (digits[start] != digits[end]) {
                return false;
            }
            start++;
            end--;
        }

        return true;

    }

    // 7. Reverse of an Array
    public static int[] reverseArrayTemp(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        return arr;
    }

    // 8. Count the number of elements strictly greater than value x.
    public static int strictlyGreater(int[] arr, int key) {

        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > key) {
                return arr[i];
            }
        }

        return -1;
    }

    // 9. Reverse the digits in Descending Order TimeComplexity O(Nlog N)
    public static void reverseMax(int num) {

        String str = Integer.toString(num);

        char[] digits = str.toCharArray();

        Arrays.sort(digits);

        StringBuffer sb = new StringBuffer(new String(digits));

        sb.reverse();

        System.out.println(sb);

    }

    // 8. Reverse of Array
    public static void reverseArraySwap(int[] arr) {
        int i = 0;
        while (i < arr.length / 2) {
            int swap = arr[i];
            arr[i] = arr[(arr.length - i) - 1];
            arr[(arr.length - i) - 1] = swap;
            i++;
        }
    }

    // 9. Create a program to check is the array is palindrome or not.
    public static boolean checkPalindrome(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] != arr[(arr.length - 1) - i]) {
                return false;
            }
            i++;
        }
        return true;
    }

    // Given an integer array 'a', return the prefix sum/running sum in the same
    public static int[] prefixSumArray(int[] arr) {

        int n = arr.length;
        int[] prefix = new int[n];
        prefix[0] = arr[0];

        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }
        return prefix;
    }

    public static int[] sufixSumArray(int[] arr) {
        int sum = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            sum += arr[i];
            arr[i] = sum;
        }
        return arr;
    }

    // array without creating a new array.
    public static int[] prefixSum(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            arr[i] = arr[i] + arr[i - 1];
        }
        return arr;
    }

    // Given an array of integers of size n. Answer q queries where you need to
    // print the sum
    // of valuesin a given range of indices from 1 to r (both included). //Note: The
    // values of 1 and r in queries follow 1-based indexing.

    public static void indicesArray(int[] arr, int q) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Original indices: " + Arrays.toString(arr));
        int[] prefSum = prefixSum(arr);
        System.out.println("Enter Range: ");
        while (q-- > 0) {

            int l = sc.nextInt();
            int r = sc.nextInt();

            int ans = prefSum[r] - prefSum[l - 1];

            System.out.println("Sum: " + ans);
        }
        sc.close();

    }

    // Check if we can partition the array into two subarrays with equal sum. More
    // formally, check that the prefix sum of a part of the array is equal to the
    // suffix sum of rest of the array.
    public static int findSumArray(int[] arr) {
        int totalSum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
        }
        return totalSum;
    }

    public static boolean divideSubArray(int[] arr) {

        int totalSum = findSumArray(arr);
        int prefixSum = 0;
        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];
            int suffixSum = totalSum - prefixSum;

            if (suffixSum == prefixSum) {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {

        int[] arr = { 2, 7, 8, 9, 4, 10, 8, 5 };

        System.out.println("Reverse Integer: " + reverseInteger(123));
        reverseStringInteger(456);
        System.out.println("Check Palindrome String: " + isPalindrome("AMA"));
        System.out.println("Check Palindrome: " + isPalindrome(121897));

        System.out.println("Strictly greater: " + strictlyGreater(arr, 5));
        System.out.println(Arrays.toString(reverseArray(arr)));

        reverseMax(37489842);

        int[] prefixArr = { 2, 1, 3, 4, 5 };
        System.out.println(Arrays.toString(prefixSum(prefixArr)));

        int[] suiffixArr = { 2, 1, 3, 4, 5 };
        System.out.println(Arrays.toString(sufixSumArray(suiffixArr)));

        // int[] indicesArray = { 2, 4, 1, 3, 6, 5 };
        // indicesArray(indicesArray, 6);

        int[] divideSubArray1 = { 5, 3, 2, 6, 3, 1 };
        System.out.println(divideSubArray(divideSubArray1));

        int[] divideSubArray2 = { 1, 2, 3, 4, 5, 6 };
        System.out.println(divideSubArray(divideSubArray2));
    }
}
