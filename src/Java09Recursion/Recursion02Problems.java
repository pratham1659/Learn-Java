package Java09Recursion;

public class Recursion02Problems {

    // Ques 1: Program to sum of its digits using recursion
    public static int sumOfDigit(int n) {

        // baseCase
        if (n >= 0 && n <= 9)
            return n;

        // subProblems
        int shortNum = sumOfDigit(n / 10);

        // selfWork
        return shortNum + (n % 10);
    }

    // Ques 2: Program to finder power
    // Time complexity O(q) times
    public static int findPower(int p, int q) {

        // baseCase
        if (q == 0)
            return 1;

        // subProblems
        int pow = findPower(p, q - 1);

        // self work
        return pow * p;
    }

    // Approach 2
    // Time complexity O(logq) times
    public static int powNum(int p, int q) {
        if (q == 0)
            return 1;

        int smalPaw = powNum(p, q / 2);

        if (q % 2 == 0) {
            return smalPaw * smalPaw;
        }

        return p * smalPaw * smalPaw;
    }

    // Given a number num and a value k. Print k multiples of num.
    public static void multiples(int num, int k) {

        // baseCase
        if (k == 1) {
            System.out.print(num + " ");
            return;
        }

        // subCase recursive work
        multiples(num, k - 1);

        int ans = num * k;
        // self work
        System.out.print(ans + " ");
    }

    //Given a number n. Find the sum of natural numbers till n but with alternate signs.
    public static int sumOfNatural(int num) {
        if (num == 0) return num;

        return sumOfNatural(num - 1) + num;
    }

    public static int alternateSum(int num) {
        if (num == 0) return num;

        if (num % 2 == 0) {
            return alternateSum(num - 1) - num;
        } else {
            return alternateSum(num - 1) + num;
        }
    }

    //Find GCD using recursion.
    public static int iterateGCD(int x, int y) {
        // temp -- Divisor
        // y -- Divisor
        // x -- remainder

        while (x % y != 0) {
            int rem = x % y;
            x = y;
            y = rem;
        }
        return y;
    }

    //Find GCD using Euclid
    public static int euclidGCD(int x, int y){

        if(y == 0){
            return x;
        }
        return euclidGCD(y, x % y);
    }

    public static void main(String[] args) {

        int num = 523;
        System.out.println("Sum of Digits: " + sumOfDigit(num));

        System.out.println("Power of Digit: " + findPower(5, 4));
        System.out.println("Power of Digit: " + powNum(2, 5));

        multiples(12, 5);

        System.out.println("\nSum of Natural: " + sumOfNatural(10));
        System.out.println("Sum of Alternate: " + alternateSum(10));

        System.out.println("GCD of x and y: " + iterateGCD(12, 16));
        System.out.println("GCD of x and y: " + euclidGCD(12, 16));


    }
}
