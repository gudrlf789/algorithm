package 백준.약수의합2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        //int sum = 0; sum이 int 타입인거에 조심하자 (맥시멈값 유의하기)
        Long sum = 0L;

        for(int i=1 ; i<= num ; i++){
            sum += i*(num/i);
        }

        System.out.println(sum);
    }
}
