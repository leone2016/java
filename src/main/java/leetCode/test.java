package leetCode;
import java.util.Collections;
import java.util.Map;
import java.util.HashMap;
import java.lang.Integer;


public class test {

    public static void main(String[] args){
        Map<Integer, Integer> track = new HashMap<>();

        track.put(23,12);
        track.put(3,2);
        track.put(4,4);
        track.put(5,76);
        boolean  test1 = track.containsKey(3);
        boolean  test2 = track.containsValue(3);
        Integer  test3 = track.get(23);
        System.out.printf(""+test3);
        int maxValueInMap=(Collections.max(track.values()));
        System.out.println("test-"+ maxValueInMap);

        for (Map.Entry<Integer, Integer> entry : track.entrySet()) {  // Iterate through HashMap
            if (entry.getValue()==maxValueInMap) {
                System.out.println(entry.getKey());     // Print the key with max value
            }
        }

    }
}
