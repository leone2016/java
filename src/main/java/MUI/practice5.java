package MUI;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class practice5 {
    private static int[] sortColors(int[] arr){
        Map<Integer, Integer> map = new HashMap<>();
        for(int val :arr){
            map.put(val,map.getOrDefault(val,0)+1);
        }
        int j = 0;
        int i = 0;
        while(i < map.size()){
            if(map.get(i)>0){
                arr[j++] = i;
                map.put(i,map.get(i)-1);
            }else{
                i++;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr1 = {0,1,1,0,1,1,0,0};
        int[] arr2 = {1,2,2,1,1,0,0,0,2,1};
        int[] arr3 = {3,2,3,1,2,0,0,0,2,1,2,3,2,1};

        System.out.println(Arrays.toString(sortColors(arr1)));
        System.out.println(Arrays.toString(sortColors(arr2)));
        System.out.println(Arrays.toString(sortColors(arr3)));

    }
}
