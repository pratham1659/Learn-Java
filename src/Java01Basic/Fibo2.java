package Java01Basic;

import java.util.Scanner;

public class Fibo2 {
    static int n1 = 0, n2 = 1, n3 = 0;
    public static void isFibo(int count){

        if(count>0){
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;

            System.out.print(" " + n3);
            isFibo(count - 1);
        }

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        System.out.print(n1 + " " + n2);
        isFibo(count - 2);


    }
}
