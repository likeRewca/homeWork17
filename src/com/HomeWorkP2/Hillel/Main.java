package com.HomeWorkP2.Hillel;

public class Main {

    public static void main(String[] args) {
        Person person = new Person("Юрий", "Горб", "Андреевич", "1.10.1994");
        Person person1 = new Person("Ярослав", "Клемешев", "Николаевич");
        Person person2 = new Person("Горб Юрий Андреевич");
        System.out.println(person.firstName);
        System.out.println(person.lastName);
        System.out.println(person.middleName);
        System.out.println(person.fio);
        System.out.println(person.age);
        System.out.println(person.shortFio);
        System.out.println("==================");
        System.out.println(person1.firstName);
        System.out.println(person1.lastName);
        System.out.println(person1.middleName);
        System.out.println(person1.fio);
        System.out.println(person1.age);
        System.out.println(person1.shortFio);
        System.out.println("==================");
        System.out.println(person2.firstName);
        System.out.println(person2.lastName);
        System.out.println(person2.middleName);
        System.out.println(person2.fio);
        System.out.println(person2.age);
        System.out.println(person2.shortFio);
    }

}
