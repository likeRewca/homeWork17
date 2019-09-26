package com.HomeWorkP2.Hillel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Person person = new Person("Юрий", "Горб", "Андреевич", "1.10.1994");
        Person person1 = new Person("Артур", "Клемешев", "Николаевич");
        Person person2 = new Person("Горб Юрий Андреевич");
        Person person3 = new Person("Юрий", "Горб", "Андреевич");
        Person person4 = new Person("Никита", "Хрущев", "Леонидович");
        Person person5 = new Person("Дмитрий", "Тяшкевич", "Юрьевич");
        List<Person> arrayPerson = new ArrayList<>();
        arrayPerson.add(person1);
        arrayPerson.add(person3);
        arrayPerson.add(person4);
        arrayPerson.add(person5);
        System.out.println("Before: " + arrayPerson
                + "\n===========================");
        getSortName(arrayPerson);
        System.out.println("After: " + arrayPerson);
        System.out.println(person4.getFio());

    }

    private static void getSortName(List<Person> person) {
        Collections.sort(person, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getFirstName().compareTo(o2.getFirstName());
            }
        });
    }
}
