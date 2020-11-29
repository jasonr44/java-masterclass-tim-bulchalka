package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class StreamThings {
    StreamThings() {
        List<Integer> someList = Arrays.asList(
              1, 2, 3, 4, 5, 6, 7, 8, 9, 10
        );

        Function<Integer, Integer> addOne = (Integer integer) -> integer + 1;

        SimpleObject object1 = new SimpleObject(1, "Jason Ransom");
        SimpleObject object2 = new SimpleObject(2, "Nicole Ransom");

        someList.stream()
                .map(addOne)
                .map(StreamThings::testMethod) // Class::method
                .map(integer -> integer + 1)
                .filter(integer -> integer % 2 == 0)
                 .forEach(System.out::println);

        Stream<SimpleObject> simpleStream = Stream.of(object1, object2);

        simpleStream.map(simpleObject -> simpleObject.name = simpleObject.name + " --- modified").forEach(System.out::println);
    }

    public static Integer testMethod(Integer integer) {
        return integer - 2;
    }

    public class SimpleObject {
        public int id;
        public String name;

        SimpleObject(int uid, String uName) {
            this.id = uid;
            this.name = uName;
        }
    }
}
