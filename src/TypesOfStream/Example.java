package TypesOfStream;

import java.util.List;

public class Example {
    public static void main(String[] args) {
        // Sequential Stream
        List<Integer> list= List.of(1,2,3,4,5,6);
        list.stream().forEach(num->System.out.print(num+" "));
        System.out.println("\n----------");

        //Parallel Stream (Random order because element is processing by multiple threads)
        list.parallelStream().forEach(num->System.out.print(num+" "));
    }
}
