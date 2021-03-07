package 백준.회의실배정;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String countMeeting = br.readLine();
        int maxLength = Integer.parseInt(countMeeting);
        int[][] meetingArray = new int[maxLength][2];

        String[] inputMeetingTime = new String[2];
        for(int i=0 ; i < Integer.parseInt(countMeeting) ; i++){
            inputMeetingTime = br.readLine().split(" ");
           meetingArray[i][0] = Integer.parseInt(inputMeetingTime[0]);
           meetingArray[i][1] = Integer.parseInt(inputMeetingTime[1]);
        }
        
        // 미팅시간을 먼저 종료하는 순서 대로 재정렬
        Arrays.sort(meetingArray, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1] == o2[1]){
                    return o1[0] - o2[0];
                }
                return o1[1] - o2[1];
            }
        });

        int resultCount = 0;
        int prev_end_time = 0;

        for(int i=0 ; i < maxLength ; i++){

            if(prev_end_time <= meetingArray[i][0]){
                prev_end_time = meetingArray[i][1];
                resultCount++;
            }
        }

        System.out.println(resultCount);
    }
}
