package com.kyiv_kug.stream.jv;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsJava {
    public static void main(String[] args) {
        List<Integer> ints = Arrays.asList(1, 2, 3, 4, 5);

        List<String> strings = ints.stream()
                .filter(it -> it > 0)
                .map(s -> s + " ")
                .collect(Collectors.toList());

        strings.forEach(System.out::println);
    }
}
