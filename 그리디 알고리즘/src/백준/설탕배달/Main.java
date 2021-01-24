package 백준.설탕배달;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int kg = scan.nextInt();
        int originKg = 0;

        int count5kg = kg/5;

        if(kg%5 == 0){
            System.out.println(count5kg);
        }else{
            originKg = kg;

            while(true){
                kg = originKg;
                kg = kg - 5*count5kg;

                if(kg%3 == 0){
                    System.out.println(count5kg + (kg/3));
                    break;
                }else{
                    if(count5kg == 0){
                        if(originKg%3 == 0){
                            System.out.println(originKg/3);
                            break;
                        }else{
                            System.out.println(-1);
                            break;
                        }
                    }else{
                        count5kg--;
                        continue;
                    }
                }
            }
        }
    }
}
