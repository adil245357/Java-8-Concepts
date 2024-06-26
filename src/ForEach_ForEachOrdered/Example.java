package ForEach_ForEachOrdered;

import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6);
        // Order is preserved even for parallel stream when we are using forEachOrdered
        list.parallelStream().forEach(num->System.out.print(num+" "));
        System.out.println("\n-------");
        list.parallelStream().forEachOrdered(num->System.out.print(num+" "));
    }
}
