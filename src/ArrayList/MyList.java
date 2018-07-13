package ArrayList;

import java.util.Iterator;

public interface MyList<E> extends Iterable<E> {

    public boolean addAll(MyList<E> otherList);

    public boolean removeAll(MyList<E> otherList);

    public boolean retainAll(MyList<E> otherList);

    public int indexOf(E e);

    public void add(E e);

    public void add(int index, E e);

    public E remove(int index);

    public int size();

    public E get(int index);


    Iterator<E> iterator();
}