package udemy.lambdas_functional_programming.lambdaFunctionInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class _6_array_basic {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Leo", "Lore", "Blanca", "Edu", "Cris", "Gaby", "Leo", "Lore");
        //before lambdas
        List<String> namesList = new ArrayList<>();
        for (String name: names){
            if(!namesList.contains(name)){
                namesList.add(name);
            }
        }
        System.out.println("NameList: "+namesList);
          //After lambdas


    }

}

