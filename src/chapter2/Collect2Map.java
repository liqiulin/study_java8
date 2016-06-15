package chapter2;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.zip.Inflater;

/**
 * Created by qiulin on 2016-6-5.
 */
public class Collect2Map {

    public static void main(String[] args) {
        Person p1 = new Person(1, "haha");
        Person p2 = new Person(2, "hehe");

        Stream<Person> personStream = Stream.of(p1, p2);
        Map<Integer, String> personMap = personStream.collect(Collectors.toMap(Person::getAge, Person::getName));

        personMap.forEach((k, v) -> System.out.println(k));
    }

}

class Person {
    private int age;

    private  String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
