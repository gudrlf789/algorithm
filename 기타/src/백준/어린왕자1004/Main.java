package 백준.어린왕자1004;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    private static int result = 0;

    public static void main(String[] args) throws IOException {
        /*
         * 어떻게 input 코드를 작성해야 할지 생각이 나질 않아 기존예제 데이터를 강제로 넣어서 문제풀이 진행을 했다.
         * (다시 한번 고민해보자)
         */

        //String[] firstTestCase = new String[]{"-5", "1", "12", "1"};
        String[] firstTestCase = new String[]{"-5", "1", "12", "1"};

        //String[] planetCount = new String[]{"1 1 8", "-3 -1 1","2 2 2", "5 5 1", "-4 5 1", "12 1 1", "12 1 2"};
        String[] planetCount = new String[]{"0 0 2"};

        List<String[]> firstTestList =  Arrays.stream(planetCount).map(t -> t.split(" ")).collect(Collectors.toList());

        int startX = Integer.parseInt(firstTestCase[0]);
        int startY = Integer.parseInt(firstTestCase[1]);

        int arriveX = Integer.parseInt(firstTestCase[2]);
        int arriveY = Integer.parseInt(firstTestCase[3]);

        for(int i = 0; i < firstTestList.size(); i++){
            result += checkLocation(firstTestList.get(i), startX, startY);
            result += checkLocation(firstTestList.get(i), arriveX, arriveY);
        }

        System.out.println("결과: " + result);
    }

    public static int checkLocation(String[] arr, int x, int y){
        if(Integer.parseInt(arr[0]) == x && Integer.parseInt(arr[1]) == y){
            return 1;
        }

        // 출발점이나 도착점이 행성 영역의 안에 존재해야지 진입/이탈 할수 있다고 생각하여 문제를 풀었다.
        if(Integer.parseInt(arr[0]) - Integer.parseInt(arr[2]) < x && Integer.parseInt(arr[0]) - Integer.parseInt(arr[2]) < y
                && Integer.parseInt(arr[0]) + Integer.parseInt(arr[2]) > x && Integer.parseInt(arr[0]) + Integer.parseInt(arr[2]) > y){
            return 1;
        }else{
            return 0;
        }
    }
}
