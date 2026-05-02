package randomPractice;

public class test {

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int target = 9;
        int sum = 0, start = 0;

        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
            while(sum > target){
                sum -= arr[start];
                start++;
            }
            if(sum == target){
                System.out.println("Target found between index " + start + " and " + i);
                break;
            }

        }

    }
}
