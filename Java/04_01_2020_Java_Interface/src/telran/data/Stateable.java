package telran.data;

//показывают статус
public interface Stateable {
    int OPEN = 1;
    int CLOSED = 0;

    void printState(int n);
}
