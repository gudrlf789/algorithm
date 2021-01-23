package 백준.ATM;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int peopleNum = scan.nextInt();
        int[] moneyWithdrawTime = new int[peopleNum];

        for(int i=0 ; i < peopleNum ; i++){
            moneyWithdrawTime[i] = scan.nextInt();
        }

        Arrays.sort(moneyWithdrawTime);
        int num = 0;
        for(int i=0 ; i < moneyWithdrawTime.length ; i++){
            for(int j=0 ; j <= i ; j++){
                num += moneyWithdrawTime[j];
            }
        }

        System.out.println(num);
        scan.close();
    }
}
