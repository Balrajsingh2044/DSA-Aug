import java.util.ArrayList;
import java.util.Collection;
import java.util.*;

public class Majority {
    static void optimal(int[] vec) {
        if (vec.length == 1) {
            System.out.println("Majority Element is " + vec[0]);
            return;
        }
        Arrays.sort(vec);
        int freq = 1;
        for(int i = 1; i < vec.length; i++){
            //1 1 1 1 2 2
            if(vec[i] == vec[i-1]){
                freq++;
            }else{
                freq = 1;
            }
            if (freq > vec.length / 2) {
                System.out.println("Majority Element is " + vec[i] + " (Printed " + freq + " times)");
                return;
            }
        }
    }
    static void Moore(int[] arr) {
        int candidate = -1;
        int count = 0;
        for (int j : arr) {
            if (count == 0) {
                candidate = j;
                count = 1;
            } else if (candidate == j) {
                count++;
            } else {
                count--;
            }
        }
        System.out.println("Majority Element is " + candidate);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,2,1,1,1,2,2,2,2,2,2};
        Moore(arr);

    }
}
