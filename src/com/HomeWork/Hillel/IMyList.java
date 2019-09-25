package com.HomeWork.Hillel;

public interface  IMyList<T> {
    void add(T value);
    int size();
    void clean();
    T get(int index);
    void print();
}