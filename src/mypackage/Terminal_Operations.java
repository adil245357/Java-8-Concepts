package mypackage;

import java.util.*;

public class Terminal_Operations {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,23,5,7,4,2,1);
        Optional<Integer> optional = list.stream().max(Comparator.naturalOrder());
        System.out.println(optional.get());

        long count= list.stream().count();
        System.out.println(count);
        int min= list.stream().min(Comparator.naturalOrder()).get();
        System.out.println(min);

        int sum= list.stream().reduce(0,(a,b)->a+b);   // sum of nos
        System.out.println(sum);

        List<String> list1= List.of("Adil Qureshi","Rahil Khan","Ritu Patel");
        String[]str=     list1.stream().toArray(String[]::new);
        System.out.println(Arrays.toString(str));

    }
}
