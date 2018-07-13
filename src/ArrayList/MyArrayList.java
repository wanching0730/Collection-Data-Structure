package ArrayList;

import java.util.Iterator;

public class MyArrayList<E> extends MyAbstractList<E> {
    public static final int INITIAL_CAPACITY = 16;
    private E[] data = (E[])new Object[INITIAL_CAPACITY];

    public MyArrayList() {
    }

    public MyArrayList(E[] objects) {
        for(int i = 0; i < objects.length; ++i) {
            this.add(objects[i]);
        }
    }

    public void add(int index, E e) {
        this.ensureCapacity();

        for(int i = this.size - 1; i >= index; --i) {
            this.data[i + 1] = this.data[i];
        }

        this.data[index] = e;
        ++this.size;
    }

    private void ensureCapacity() {
        if (this.size >= this.data.length) {
            E[] newData = (E[])new Object[this.size * 2 + 1];
            System.arraycopy(this.data, 0, newData, 0, this.size);
            this.data = newData;
        }

    }

    public void clear() {
        this.data = (E[])new Object[16];
        this.size = 0;
    }

    public boolean contains(E e) {
        for(int i = 0; i < this.size; ++i) {
            if (e.equals(this.data[i])) {
                return true;
            }
        }

        return false;
    }

    public E get(int index) {
        this.checkIndex(index);
        return this.data[index];
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException("index " + index + " out of bounds");
        }
    }

    public int indexOf(E e) {
        for(int i = 0; i < this.size; ++i) {
            if (e.equals(this.data[i])) {
                return i;
            }
        }

        return -1;
    }

    @Override
    public void add(E e) {
        data[size++] = e;
    }

    public int lastIndexOf(E e) {
        for(int i = this.size - 1; i >= 0; --i) {
            if (e.equals(this.data[i])) {
                return i;
            }
        }

        return -1;
    }

    public E remove(int index) {
        this.checkIndex(index);
        E e = this.data[index];

        for(int j = index; j < this.size - 1; ++j) {
            this.data[j] = this.data[j + 1];
        }

        this.data[this.size - 1] = null;
        --this.size;
        return e;
    }

    public E set(int index, E e) {
        this.checkIndex(index);
        E old = this.data[index];
        this.data[index] = e;
        return old;
    }

    public String toString() {
        StringBuilder result = new StringBuilder("[");

        for(int i = 0; i < this.size; ++i) {
            result.append(this.data[i]);
            if (i < this.size - 1) {
                result.append(", ");
            }
        }

        return result.toString() + "]";
    }

    public void trimToSize() {
        if (this.size != this.data.length) {
            E[] newData = (E[])new Object[this.size];
            System.arraycopy(this.data, 0, newData, 0, this.size);
            this.data = newData;
        }

    }

    public Iterator<E> iterator() {
        return new ArrayListIterator();
    }

    private class ArrayListIterator implements Iterator<E> {
        private int current;

        private ArrayListIterator() {
            this.current = 0;
        }

        public boolean hasNext() {
            return this.current < MyArrayList.this.size;
        }

        public E next() {
            return MyArrayList.this.data[this.current++];
        }

        public void remove() {
            MyArrayList.this.remove(this.current);
        }
    }
}