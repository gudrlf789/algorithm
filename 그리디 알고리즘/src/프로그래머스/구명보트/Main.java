package 프로그래머스.구명보트;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] people = new int[]{70, 50, 80, 50};
        int limit = 100;
        int answer = 0;

        if(people.length >= 1 && people.length <= 240){
            Arrays.sort(people);

            int boatWeight = 0;
            int peopleCount = 0;
            for(int i=0 ; i < people.length ; i++){
                if(people[i] >= 40 && people[i] <= 240){
                    if(boatWeight + people[i] <= limit){
                        peopleCount ++;
                        boatWeight += people[i];
                        if(peopleCount == 2){
                            answer ++;
                            boatWeight = 0;
                        }
                    }else{
                        if(i == people.length-1){
                            answer += 2;
                        }else{
                            answer ++;
                        }

                        boatWeight = people[i];
                    }
                }
            }
        }
    }
}
