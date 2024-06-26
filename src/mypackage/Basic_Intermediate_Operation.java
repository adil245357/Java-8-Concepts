package mypackage;

import java.util.List;

public class Basic_Intermediate_Operation {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,1,2,2,3,4,5);

        list.stream().filter(num->num%2==0)             // list of even nos
                .forEach(num->System.out.print(num+" "));
        System.out.println("\n--------------------");

        list.stream().filter(num->num%2!=0)             // list of odd nos
                .forEach(num->System.out.print(num+" "));
        System.out.println("\n--------------------");

        list.stream().map(num->num*num)                 // square of number
                .forEach(num->System.out.print(num+" "));
        System.out.println("\n--------------------");



        list.stream().filter(num->num>3)
                .peek(num->System.out.print(num+" "))                 // to debug the intermediate result
                .map(e->e*e)
                .forEach(num->System.out.print(num+" "));
        System.out.println("\n--------------------");

        list.stream().distinct().forEach(num->System.out.print(num+" "));  // to remove duplicate
    }
}
