package ch.salvomulas.algd2.u01.sortedbag;

import java.util.Arrays;

public class SortedBag<E extends Comparable <E>> extends MyAbstractCollection<E> {

    public static final int DEFAULT_CAPACITY = 100;

    private int capacity;
    private Object[] data;

    // Sets the index
    private int index = 0;

    public SortedBag() {
        this(DEFAULT_CAPACITY);
    }

    public SortedBag(int capacity) {
        this.capacity = capacity;
        data = new Object[capacity];
    }

    @Override
    public boolean add (E e) {

        if (e != null) {

            index = Math.abs(Arrays.binarySearch(data, 0, (data.length-capacity), e));

            // Fills the data into the array
            data[index] = e;

            // Decrease the capacity by one
            index++;

            return true;

        } else {

            throw new NullPointerException();

        }

    }

    @Override
    public boolean remove(Object o) {

        // Increase the capacity by one
        capacity++;

        return true;
    }

    @Override
    public boolean contains(Object o) {
        return (Arrays.binarySearch(data, o)>0);
    }


    @Override
    public Object[] toArray() {
        return Arrays.copyOf(data, size());
    }

    @Override
    public int size() {
        return capacity;
    }

    /**
     * Sorts the array after insertion or removal
     * @param index		Sets the index where the sorting operation takes place
     * @param push		If true, the method pushes the values within the array,
     * 					if false, it pulls the values
     */
    public void sortArray(int index, boolean push) {
        while (index<data.length) {
            if (push) {

            }
        }
    }

    public static void main(String[] args) {
        SortedBag<Integer> bag = new SortedBag<Integer>(10);
        bag.add(2);
        bag.add(1);
        System.out.println(Arrays.toString(bag.toArray()));
    }

}