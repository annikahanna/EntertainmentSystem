package Iterator;

public interface IIterator {
    void reset();
    boolean hasNext();
    Object next();
    Object before();
}
