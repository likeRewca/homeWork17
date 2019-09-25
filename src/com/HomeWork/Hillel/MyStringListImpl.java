package com.HomeWork.Hillel;

import java.util.Arrays;

public class MyStringListImpl implements IMyList<String> {

    private String[] array = new String[0];

    @Override
    public void add(String value) {
        String[] arrayTarget = new String[array.length + 1];
        System.arraycopy(array, 0, arrayTarget, 0, array.length);
        array = arrayTarget;
        array[array.length - 1] = value;
    }

    @Override
    public int size() {
        return array.length;
    }

    @Override
    public void clean() {
        array = new String[0];
    }

    @Override
    public String get(int index) {
        return array[index];
    }

    @Override
    public void print() {
        System.out.println(Arrays.toString(array));
    }
}