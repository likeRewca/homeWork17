package com.HomeWork.Hillel;

public class Main {

    public static void main(String[] args) {
        IMyList arrayInt = new MyIntegerListImpl();
        IMyList arrayStr = new MyStringListImpl();

        arrayInt.add(1);
        arrayInt.add(10);
        arrayInt.add(1994);
        arrayStr.add("Tobbi");
        arrayStr.add("want");
        arrayStr.add("eat!");
        print(arrayInt);
        print(arrayStr);

    }
    private static void print(IMyList value){
        value.print();
    }
}
