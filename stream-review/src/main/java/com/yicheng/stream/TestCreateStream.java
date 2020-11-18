package com.yicheng.stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import java.util.stream.Stream;

/**
 * @author 张艺成
 * @date 2020/11/18 0018 13:36
 */
// 创建 Stream 流的多种方式
public class TestCreateStream {
    public static void main(String[] args) {

        //        // 1.使用 Arrays.stream() 传入参数创建Stream
        //        Stream<String> stream1 = Arrays.stream(new String[]{"A", "B", "C", "D"});
        //        stream1.forEach(System.out::println);
        //
        //        // 2. 使用 Collection.stream() 方法返回 Stream
        //        List<String> list = Arrays.asList("A", "B", "C", "D");
        //        Stream<String> stream2 = list.stream();
        //        Stream<String> parallelStream = list.parallelStream();
        //        stream2.forEach(System.out::println);
        //
        // 3.使用 Stream 类下的静态方法 of()、iterate()、generate() 创建 Stream
        Stream<String> stream3 = Stream.of("A", "B", "C", "D");
        stream3.forEach(System.out::println);

        Stream<String> stream4 = Stream.iterate("A", temp -> temp + "B").limit(4);
        System.out.println("------------------------------------");
        stream4.forEach(System.out::println);

        Stream<UUID> stream5 = Stream.generate(UUID::randomUUID).limit(4);
        System.out.println("------------------------------------");
        stream5.forEach(System.out::println);
    }
}
