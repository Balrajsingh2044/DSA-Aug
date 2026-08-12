import java.util.*;

public class pairSum {
    static void brute(List<Integer> vec, int target){//O(n^2)
        for(int i = 0; i < vec.size(); i++){
            for(int j = i+1; j < vec.size(); j++){
                if(vec.get(i) + vec.get(j) == target){
                    System.out.println(vec.get(i) +" "+ vec.get(j));
                }
            }
        }
    }

    static void optimal(List<Integer> vec, int target) {
        int i =0;
        int j = vec.size();
        int sum = 0;
        while(i < j){
            sum = vec.get(i) + vec.get(j);
            if(sum == target){
                System.out.println(vec.get(i) +" "+ vec.get(j));
                return;
            }
            else if(sum < target){
                i++;
            }
            else {
                j++;
            }
        }
    }
    public static void main(String[] args){
        List<Integer> vec = new ArrayList<>();
        vec.add(2);
        vec.add(7);
        vec.add(11);
        vec.add(15);

        int target = 9;
        brute(vec,target);
    }
}
