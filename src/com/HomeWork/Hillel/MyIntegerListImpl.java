package com.HomeWork.Hillel;

import java.util.Arrays;

public class MyIntegerListImpl implements IMyList<Integer> {

    private Integer[] array = new Integer[0];

    @Override
    public void add(Integer value) {
        Integer[] arrayTarget = new Integer[array.length + 1];
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
        array = new Integer[0];
    }

    @Override
    public Integer get(int index) {
        return array[index];
    }

    @Override
    public void print() {
        System.out.println(Arrays.toString(array));
    }
}