package 백준.동전0;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] countAndMoney = new int[2];

        for(int i=0 ; i < countAndMoney.length ; i++){
            countAndMoney[i] = scan.nextInt();
        }

        int[] coninValue = new int[countAndMoney[0]];
        coninValue[0] = 1;

        for(int i=1; i < coninValue.length ; i++){
            coninValue[i] = scan.nextInt();


        }
    }
}
