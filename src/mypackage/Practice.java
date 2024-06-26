package mypackage;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Practice {
    public static void main(String[] args) {
//        IntStream.iterate((int)'A',i->i<=(int)'z',i->i+1)
//                .filter(Character::isAlphabetic)
//                .forEach(ch->System.out.printf("%c ",ch));
        Random random = new Random();

        Stream.generate(()->random.nextInt((int)'A',(int)'Z'+1))
                .limit(50)
                .distinct()
                .sorted()
                .forEach(d->System.out.printf("%c ",d));
    }
}
