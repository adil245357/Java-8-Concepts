package mypackage;

import java.util.List;

public class Intermediate_Operation {
    public static void main(String[] args) {
       List<Integer> list= List.of(3,3,3,1,2,3,4,5,6);
       list.stream().takeWhile(e->e==3).forEach(System.out::println);     // short-circuit operation it runs until condition become true then terminate
        System.out.println("--------------------------------------");
        list.stream().dropWhile(e->e==3).forEach(System.out::println);     // short-circuit operation it checks whether the condition is true from the first element
                                                                            // and dropping element until condition become false


    }
}
