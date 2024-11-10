package com.chatgpt.api;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Chatgpt47970130 {
    public static String[] filterOptionAndValue(String option, String[] args) {
        return IntStream.range(0, args.length)
                .filter(i -> i % 2 == 0)
                .mapToObj(i -> new AbstractMap.SimpleEntry<>(args[i], args[i + 1]))
                .filter(e -> !option.equals(e.getKey()))
                .flatMap(e -> Stream.of(e.getKey(), e.getValue()))
                .toArray(String[]::new);
    }

    public static void main(String... env) {
        String[] args = {"-o", "opt1", "-k", "secret", "-a", "opt2"};
        System.out.println(Arrays.toString(filterOptionAndValue("-k", args)));
    }
}
