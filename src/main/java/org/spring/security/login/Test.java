package org.spring.security.login;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        int chunkSize = 3;
        AtomicInteger counter = new AtomicInteger();
        List<Integer> nlist = Arrays.asList(3,2,4,1,5,6,7,8,9,1);
        Collection<List<Integer>> result = nlist.stream()
                .collect(Collectors.groupingBy(it -> counter.getAndIncrement() / chunkSize))
                .values();
        System.out.println(result);

    }

    public static <T> List<List<T>> split(List<T> list, int size) {
        final AtomicInteger counter = new AtomicInteger();
        return new ArrayList<>(
                list.stream()
                        .collect(Collectors.groupingBy(it -> counter.getAndIncrement() / size))
                        .values());
    }
}
