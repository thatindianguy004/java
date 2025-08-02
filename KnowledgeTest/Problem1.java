package com.codes.dsa;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line1;
        System.out.println("Enter the sentence: ");
        line1 = sc.nextLine();
        HashMap<Character, Integer> counter = new HashMap<>();
        for(int i = 0; i < line1.length(); i++) {
            char c = line1.charAt(i);
            c = Character.toLowerCase(c);
            if(Character.isLetter(c)){
                if(counter.containsKey(c)){
                    counter.put(c, counter.get(c)+1);
                }
                else{
                    counter.put(c,1);
                }
            }
        }
        System.out.println(counter);
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;
        for(int value : counter.values()){
            if(value > max){
                secondMax = max;
                max = value;
            }
            else if(value < max && value > secondMax){
                secondMax = value;
            }
            else if(value <= secondMax){
                thirdMax = value ;
            }
        }
        if(secondMax == Integer.MIN_VALUE || secondMax == thirdMax ){
            System.out.println("No highest second Value found!");
        }
        else{
            for(Map.Entry<Character, Integer> entry : counter.entrySet()){
                if(entry.getValue() == secondMax ){
                    System.out.println("the second most used letter is "+entry.getKey());
                    break;
                }
            }
        }

    }
}
