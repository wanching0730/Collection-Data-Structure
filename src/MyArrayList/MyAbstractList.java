package MyArrayList;

public abstract class MyAbstractList<E> implements MyList<E> {
    protected int size = 0;

    protected MyAbstractList() {
    }

    protected MyAbstractList(E[] objects) {
        for(int i = 0; i < objects.length; ++i) {
            this.add(objects[i]);
        }
    }

    @Override
    public boolean addAll(MyList<E> otherList) {
        boolean flag = false;
        for(int i = 0; i < otherList.size(); i++) {
            add(otherList.get(i));
            flag = true;
        }

        return flag;
    }

    /**
     * Removes all the elements in otherList from this list.
     * Returns true if this list changed as a result of the call
     */
    @Override
    public boolean removeAll(MyList<E> otherList) {
        boolean flag = false;
        for(int i = 0; i < otherList.size(); i++) {
            remove(otherList.get(i));
            flag = true;
        }

        return flag;
    }

    /**
     * Retains the elements in this list that are also in otherList.
     * Returns true if this list changed as a result of the call
     */
    @Override
    public boolean retainAll(MyList<E> otherList) {
        boolean flag = false;
        for(int i = 0; i < otherList.size(); i++) {
            E element = otherList.get(i);
            if(!contains(element))
                add(element);

            flag = true;
        }

        return flag;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean remove(E e) {
        if (indexOf(e) >= 0) {
            remove(indexOf(e));
            return true;
        } else {
            return false;
        }
    }

}