package MUI.sample_test.Interview;

/*
Find the minimum and the max value in the array
*/

public class FindMinMax{

    public static void main(String[] args){
        int[] test1 = {2,3,5,9,1};

        int[] returns = getMinMaxvalue(test1);

        System.out.println("min value is :"+returns[0]+ " max value is :"+returns[1]);
    }

    public static int[] getMinMaxvalue(int[] values){

        int min = values[0];//2
        int max = values[0];//3

        for(int i = 1 ; i < values.length ; i++){
            if( values[i] < min)
                min = values[i];
            if( values[i] > max)
                max = values[i];
        }
        return new int[]{min, max};
    }

}