package ArrayList;

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

    @Override
    public boolean removeAll(MyList<E> otherList) {
        return false;
    }

    @Override
    public boolean retainAll(MyList<E> otherList) {
        return false;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public int size() {
        return this.size;
    }

    public boolean remove(E e) {
        if (indexOf(e) >= 0) {
            this.remove(indexOf(e));
            return true;
        } else {
            return false;
        }
    }
}