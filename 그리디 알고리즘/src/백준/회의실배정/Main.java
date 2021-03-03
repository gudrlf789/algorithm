package 백준.회의실배정;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int meetingCount = scan.nextInt();

        int[][] meetingTime = new int[meetingCount][2];

        for(int i=0 ; i < meetingCount ; i++){
            meetingTime[i][0] = scan.nextInt();
            meetingTime[i][1] = scan.nextInt();
        }

        Arrays.sort(meetingTime, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0] == o2[0]){
                    return o1[1] - o2[1];
                }else{
                    return o1[0] - o2[0];
                }
            }
        });

        for(int i=0 ; i<meetingCount ; i++){
            for(int j=0 ; j<1 ; j++){
                System.out.println(meetingTime[i][0] + ", " + meetingTime[i][1]);
            }
        }

        int num = 0;
        int beforeNum = 0;
        int endTime = 0;
        int count = 0;
        while(true){
            if(num == meetingCount){
                break;
            }else{
                int meetingTimeFirst = meetingTime[num][1] - meetingTime[num][0];
                int meetingTimeSecond = meetingTime[num+1][1] - meetingTime[num+1][0];

                if(meetingTimeFirst <= meetingTimeSecond){

                    endTime = meetingTime[beforeNum][1];
                    if(endTime <= meetingTime[num+1][0]){
                        beforeNum = num;
                        num++;
                        count++;
                    }else{
                        num++;
                    }
                }else{
                    num++;
                    beforeNum++;
                }
            }
        }

        System.out.println(count);
    }
}
