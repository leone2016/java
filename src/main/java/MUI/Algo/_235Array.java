package MUI.Algo;

public class _235Array {
    public static int is235Array(int []arr){
        int n = arr.length;
        int acumDiv = 0,nonDiv=0;

        for(Integer val:arr){

            if(val%2==0)acumDiv++;
            if(val%3==0)acumDiv++;
            if(val%5==0)acumDiv++;


        }
        int total = acumDiv+nonDiv;
        return total == n ? 1: 0;

    }
    public static boolean is235ArrayOppositeCondition(int []arr){

        for(Integer val:arr){
            if(val%2==0 && val%3==0)return false;
            if(val%2==0 && val%3==0)return false;
            if(val%5==0 && val%2==0)return false;
        }
        return true;
    }
    public static boolean is235ArrayOppositeCondition2(int []arr){

        for(Integer val:arr){
            if(val%6==0)return false;//(val%2==0 && val%3==0)
            if(val%15==0)return false;//(val%2==0 && val%3==0)
            if(val%10==0)return false;//(val%5==0 && val%2==0)
        }
        return true;
    }
    public static void main(String[] args) {
        int []arr = {81, 13, 7, 2, 4, 9, 8, 5};
        System.out.println( is235Array(arr));
        System.out.println("Is array 235: "+is235ArrayOppositeCondition2(arr));
    }
}
