package baitap.buoi8;

import java.util.Arrays;

public class MyArrrayList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;

    Object element[];

    public MyArrrayList(){
        element = new Object[DEFAULT_CAPACITY];
    }

    public MyArrrayList(int capacity){
        if(capacity > 0){
            element = new Object[capacity];
        }else {
            throw new IllegalArgumentException("capacity can't be null");
        }
    }

    public int size() {
        return this.size;
    }

    public void clear() {
        this.size = 0;
        for (int i = 0; i < element.length; i++) {
            element[i] = null;
        }
    }

    public boolean add(Object elements){
        if (element.length == size){
            this.ensureCapacity(5);
        }
        element[size] = elements;
        size++;
        return true;
    }

    public void add(E elements, int index){
        if (index > element.length){
            throw  new IllegalArgumentException("index can't be greater than length");
        }else if (element.length == size){
            this.ensureCapacity(5);
        }

        if (element[index] == null){
            element[index] = elements;
            size++;
        }else {
            for (int i = size + 1; i >= index; i--){
                element[i] = element[i-1];
            }
            element[index] = elements;
            size++;
        }
    }

    public void ensureCapacity(int minCapacity){
        if(minCapacity >= 0){
            int newSize = this.element.length + minCapacity;
            element = Arrays.copyOf(element, newSize);
        }else {
            throw new IllegalArgumentException("minCapacity can't be negative");
        }
    }
}
