package MUI.Algo;

public class practice2 {

    public static void algo1(int []arr){
        int idxFirstMax = 0;
        int idxSecondMax = 0;
        int idxThirdMax = 0;
        for(int i=0;i<arr.length;i++){
            if( arr[idxFirstMax] < arr[i]){
                idxFirstMax = i;
            }
        }

        for(int i=0;i<arr.length;i++){
            if(idxFirstMax != i  && arr[idxSecondMax] < arr[i] ){
                idxSecondMax = i;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(idxSecondMax != i  &&  idxFirstMax != i  && arr[idxThirdMax] < arr[i] ){
                idxThirdMax = i;
            }
        }
    }

    public static void algo2(int []arr){
        int max = Integer.MIN_VALUE;
        int preMax = Integer.MIN_VALUE;
        int prePreMax = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i] < max){
                prePreMax = preMax;
                preMax = max;
                max = arr[i];
            }else if(arr[i] < max){

            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {7, 20, 18, 4, 20, 19, 20, 3};
        algo1(arr);
    }
}
