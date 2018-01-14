package com.kyiv_kug.stream.jv;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {
        List<Integer> strings = Arrays.asList(1,2,3,4);
        List<String> strings1 = strings.stream().map(s -> s + " ").collect(Collectors.toList());

        strings1.forEach(System.out::println);

    }
}
