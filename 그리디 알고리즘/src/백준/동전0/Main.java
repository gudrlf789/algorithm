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

        for(int i=0; i < coninValue.length ; i++){
            coninValue[i] = scan.nextInt();
        }

        int minusNum = 1;
        int coinCount = 0;
        while(true){
            if(coninValue.length-minusNum < 0){
                break;
            }else {
                int currentPrice = coninValue[coninValue.length - minusNum];
                int divideValue = countAndMoney[1] / currentPrice;

                if (divideValue == 0) {
                    minusNum++;
                } else {
                    coinCount += divideValue;
                    countAndMoney[1]  = countAndMoney[1] - (currentPrice * divideValue);
                    minusNum++;
                }
            }
        }

        System.out.println(coinCount);
    }
}
