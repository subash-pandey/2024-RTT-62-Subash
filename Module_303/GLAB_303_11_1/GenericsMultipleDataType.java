package GLAB_303_11_1;

public class GenericsMultipleDataType<T,E> {
    private T t;
    private E e;
    public GenericsMultipleDataType(T t, E e) {
        this.t = t;
        this.e = e;
    }

    public GenericsMultipleDataType() {

    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public E getE() {
        return e;
    }

    public void setE(E e) {
        this.e = e;
    }
}
