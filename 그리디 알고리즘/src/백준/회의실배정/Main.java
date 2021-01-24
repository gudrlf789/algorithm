package 백준.회의실배정;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int meetingCount = scan.nextInt();
        int[][] meetingTime = new int[meetingCount][2];

        int[] startTime = new int[meetingCount];

        for(int i=0 ; i < meetingTime.length ; i++){
            for(int j=0 ; j < 2 ; j++){
                meetingTime[i][j] = scan.nextInt();
            }
        }

        for(int i=0 ; i < meetingTime.length ; i++){

        }

    }
}
