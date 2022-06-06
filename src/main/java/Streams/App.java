package Streams;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {


int[] nums = {1,2,3,41,12,4,6};
        //lembda expression
        //:: operator or method reference
//        Arrays.stream(nums).forEach(System.out::println);
//        int sum = Arrays.stream(nums).sum();
//        System.out.println(sum);

     //   //IntStream.range(0,5).forEach(x -> System.out.println(x));
      //  IntStream.range(0,10).filter(x -> x > 4).forEach(x -> System.out.println(x));

        String[] names = {"Adam","Daniel","martha","Kevin"};
//        Stream.of(names).forEach(System.out::println);
        Stream.of(names).sorted().forEach(System.out::println);

    }
}

