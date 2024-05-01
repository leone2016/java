package udemy.U_lamdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _2_Basic_list {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Leo", "Lorem", "Ipsum", "Lorem", "Ipsum");

        //Before
        List<String> uniqueList = new ArrayList<>();
        for (String name : names) {
            if (!uniqueList.contains(name)) {
                uniqueList.add(name);
            }
        }
        System.out.println(uniqueList);

        //AFTER

        List<String> uniqueList2 = names.stream().distinct().collect(Collectors.toList());//remueve todos lo valores repetidos
        System.out.println(uniqueList2);

    }
}
